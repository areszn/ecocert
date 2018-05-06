package com.ocd.ecocert.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ocd.ecocert.dao.UserMapper;
import com.ocd.ecocert.entity.User;
import com.ocd.ecocert.entity.UserExample;
import com.ocd.ecocert.service.AgeException;
import com.ocd.ecocert.service.IdNullException;
import com.ocd.ecocert.service.PasswordException;
import com.ocd.ecocert.service.UserNameException;
import com.ocd.ecocert.service.UserNotFoundException;
import com.ocd.ecocert.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Value("#{jdbc.salt}")
	private String salt;
	@Resource
	private UserMapper userDao;
	public User login(String name, String password) throws UserNotFoundException, PasswordException {
		if(password==null||password.trim().isEmpty()){
			throw new PasswordException("密码为空");
		}
		if(name==null||name.trim().isEmpty()){
			throw new UserNotFoundException("用户名为空");
		}
		UserExample example=new UserExample();
		example.createCriteria().andNameEqualTo(name);
		List<User> userList=userDao.selectByExample(example);
		if(userList==null||userList.size()==0){
			throw new UserNotFoundException("找不到用户");
		}
		String pwd = DigestUtils.md5Hex(
				salt+password.trim());
		if(pwd.trim().equals(userList.get(0).getPassword())){
			return userList.get(0);
		}
		throw new PasswordException("密码错误");
	}
	public User regist(String name,String realname,String password,String confirm,String phone,Integer age,Integer fulltime,String gender,String education,String major,String idNumber,String workExperience,Date hiredate,Date leavedate) throws UserNameException, PasswordException {
		if(name==null||name.trim().isEmpty()){
			throw new UserNameException("用户名不能为空");
		}
		UserExample example=new UserExample();
		User user=new User();
		
		if(name!=null&&!name.trim().isEmpty()){
			example.createCriteria().andNameEqualTo(name);
			List<User> userList=userDao.selectByExample(example);
			if(userList!=null&&userList.size()!=0){
				throw new UserNameException("用户已注册");
			}
			user.setName(name);
		}
		if(realname==null||realname.trim().isEmpty()){
			throw new UserNameException("真实姓名不能为空");
		}
		if(password==null||password.trim().isEmpty()){
			throw new PasswordException("密码不能为空");
		}
		if(!password.equals(confirm)){
			throw new PasswordException("两次密码不一致");
		}
		
		password=DigestUtils.md5Hex(salt+password);
		
		
		
		user.setPassword(password);
		user.setRealname(realname);
		if(phone!=null&&!phone.trim().isEmpty()){
			user.setPhone(phone);
		}
		if(age!=null){
			user.setAge(age);
		}
		if(education!=null&&!education.trim().isEmpty()){
			user.setEducation(education);
		}
		if(fulltime!=null){
			user.setFulltime(fulltime);
		}
		if(major!=null&&!major.trim().isEmpty()){
			user.setMajor(major);
		}
		if(hiredate!=null){
			user.setHiredate(hiredate);
		}
		if(leavedate!=null){
			user.setLeavedate(leavedate);
		}
		if(idNumber!=null&&!idNumber.trim().isEmpty()){
			user.setIdNumber(idNumber);
		}
		if(workExperience!=null&&!workExperience.trim().isEmpty()){
			user.setWorkExperience(workExperience);
		}
		
		int n=userDao.insertSelective(user);
		if(n!=1){
			throw new RuntimeException("添加失败");
		}
		return user ;
	}
	public int update(String id,String name,String realname,String password,String confirm,String phone,Integer age,Integer fulltime,String gender,String education,String major,String idNumber,String workExperience,Date hiredate,Date leavedate)
			throws IdNullException, PasswordException,AgeException {
		
		if(id==null||id.trim().isEmpty()){
			throw new IdNullException("id为空");
		}
		User user=new User();
		int intId=Integer.parseInt(id);
		user.setId(intId);
		if(name!=null&&!name.trim().isEmpty()){
			UserExample example=new UserExample();
			example.createCriteria().andNameEqualTo(name);
			List<User> userList=userDao.selectByExample(example);
			if(userList!=null&&userList.size()!=0){
				throw new UserNameException("用户已注册");
			}
			user.setName(name);
		}
		if(realname!=null&&realname.trim().isEmpty()){
			user.setRealname(realname);
		}
		if(password!=null&&password.trim().isEmpty()){
			if(password.equals(confirm)){
				user.setPassword(password);
			}else{
				throw new PasswordException("两次密码不一致");
			}
		}
		if(age!=null||name.trim().isEmpty()){
			if(age>0){
				user.setAge(age);
			}else{
				throw new AgeException("年龄输入有误");
			}
			
		}
		if(gender!=null&&gender.trim().isEmpty()){
			user.setGender(gender);
		}
		int n=userDao.updateByPrimaryKeySelective(user);
		if(n!=1){
			throw new RuntimeException("修改失败");
		}
		return n;
	}
	public int delete(String id) throws IdNullException {
		if(id==null||id.trim().isEmpty()){
			throw new IdNullException("id为空");
		}
		int intId=Integer.parseInt(id);
		int n=userDao.deleteByPrimaryKey(intId);
		if(n!=1){
			throw new RuntimeException("删除失败");
		}
		return n;
	}
	public List<User> selectUseList(Integer authenticationDomain,String post,String specialtyCode,String professionalLevel,Integer fulltime,String realname,String location,String workingCondition) {
		System.out.println(authenticationDomain);
		UserExample example=new UserExample();
		UserExample.Criteria userCriteria=example.createCriteria(); 
		userCriteria.andAuthenticationDomainIdEqualTo(authenticationDomain);
		userCriteria.andFulltimeEqualTo(fulltime);
		userCriteria.andWorkingConditionEqualTo(workingCondition);
		if(post!=null&&(!post.trim().isEmpty())){
			userCriteria.andPostLike("%"+post+"%");
		}
		if(specialtyCode!=null&&(!specialtyCode.trim().isEmpty())){
			userCriteria.andPostLike("%"+specialtyCode+"%");
		}
		if(professionalLevel!=null&&(!professionalLevel.trim().isEmpty())){
			userCriteria.andPostLike("%"+professionalLevel+"%");
		}
		if(realname!=null&&(!realname.trim().isEmpty())){
			userCriteria.andPostLike("%"+realname+"%");
		}
		if(location!=null&&(!location.trim().isEmpty())){
			userCriteria.andPostLike("%"+location+"%");
		}
		List<User> userList=userDao.selectByExample(example);
		return userList;
	}
	

}

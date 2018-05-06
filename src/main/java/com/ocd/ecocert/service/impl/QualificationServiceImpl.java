package com.ocd.ecocert.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ocd.ecocert.dao.QualificationMapper;
import com.ocd.ecocert.dao.UserMapper;
import com.ocd.ecocert.entity.Qualification;
import com.ocd.ecocert.entity.QualificationExample;
import com.ocd.ecocert.entity.User;
import com.ocd.ecocert.entity.UserExample;
import com.ocd.ecocert.service.QualificationService;


@Service("qualificationService")
@Transactional
public class QualificationServiceImpl implements QualificationService{
	
	@Value("#{jdbc.salt}")
	private String salt;
	@Resource
	private QualificationMapper qualificationDao;
	@Resource
	private UserMapper userDao;
	public Qualification regist(String userId, Integer authenticationDomainId ,String qualificationName, String qualificationRegistrationMark, Date beginTime,
			Date endTime,String status, String remarks) {
		if(userId==null||userId.trim().isEmpty()){
			throw new RuntimeException("用户id不能为空");
		}
		int intId=Integer.parseInt(userId);
		UserExample userExample=new UserExample();
		UserExample.Criteria criteria=userExample.createCriteria();
		criteria.andIdEqualTo(intId);
		List<User> userList=userDao.selectByExample(userExample);
		if(userList==null||userList.size()==1){
			throw new RuntimeException("用户id有问题");
		}
		Qualification qualification=new Qualification();
		
		qualification.setId(intId);
		if(authenticationDomainId!=null){
			qualification.setAuthenticationDomainId(authenticationDomainId);
		}
		if(qualificationName!=null&&!qualificationName.trim().isEmpty()){
			qualification.setQualificationName(qualificationName);
		}
		if(qualificationRegistrationMark!=null&&!qualificationRegistrationMark.trim().isEmpty()){
			qualification.setQualificationRegistrationMark(qualificationRegistrationMark);
		}
		if(beginTime!=null){
			qualification.setBeginTime(beginTime);
		}
		if(endTime!=null){
			qualification.setEndTime(endTime);
		}
		if(remarks!=null&&!remarks.trim().isEmpty()){
			qualification.setRemarks(remarks);
		}
		int n=qualificationDao.insertSelective(qualification);
		if(n!=1){
			throw new RuntimeException("添加失败");
		}
		return qualification;
	}
	public int update(String id,Integer authenticationDomainId , String qualificationName, String qualificationRegistrationMark, Date beginTime,
			Date endTime,String status, String remarks) {
			if(id==null||id.trim().isEmpty()){
				throw new RuntimeException("id不能为空");
			}
			Qualification qualification=new Qualification();
			int intId=Integer.parseInt(id);
			qualification.setId(intId);
			if(authenticationDomainId!=null){
				qualification.setAuthenticationDomainId(authenticationDomainId);
			}
			if(qualificationName!=null&&!qualificationName.trim().isEmpty()){
				qualification.setQualificationName(qualificationName);
			}
			if(qualificationRegistrationMark!=null&&!qualificationRegistrationMark.trim().isEmpty()){
				qualification.setQualificationRegistrationMark(qualificationRegistrationMark);
			}
			if(beginTime!=null){
				qualification.setBeginTime(beginTime);
			}
			if(endTime!=null){
				qualification.setEndTime(endTime);
			}
			if(remarks!=null&&!remarks.trim().isEmpty()){
				qualification.setRemarks(remarks);
			}
			int n=qualificationDao.updateByPrimaryKeySelective(qualification);
			if(n!=1){
				throw new RuntimeException("修改失败");
			}
		return n;
	}
	public int delete(String id) {
		
	if(id==null||id.trim().isEmpty()){
		throw new RuntimeException("id不能为空");
		}
	int intId=Integer.parseInt(id);
	int n=qualificationDao.deleteByPrimaryKey(intId);
	return n;
	}
	public List<Qualification> select(String userId) {
		QualificationExample qualificationExample=new QualificationExample();
		QualificationExample.Criteria criteria=qualificationExample.createCriteria();
		criteria.andIdIsNotNull();
		if(userId!=null&&userId.trim().isEmpty()){
			int intId=Integer.parseInt(userId);
			criteria.andIdEqualTo(intId);
		}
		List<Qualification> userList=qualificationDao.selectByExample(qualificationExample);
		return userList;
	}
	

	

}

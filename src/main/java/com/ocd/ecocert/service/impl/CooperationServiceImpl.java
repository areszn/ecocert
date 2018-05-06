package com.ocd.ecocert.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ocd.ecocert.dao.CooperationMapper;
import com.ocd.ecocert.entity.Cooperation;
import com.ocd.ecocert.entity.CooperationExample;
import com.ocd.ecocert.entity.User;
import com.ocd.ecocert.entity.UserExample;
import com.ocd.ecocert.service.AgeException;
import com.ocd.ecocert.service.CooperationNameException;
import com.ocd.ecocert.service.CooperationService;
import com.ocd.ecocert.service.IdNullException;
import com.ocd.ecocert.service.PasswordException;
import com.ocd.ecocert.service.UserNameException;

@Service("cooperationService")
@Transactional
public class CooperationServiceImpl implements CooperationService {
	@Resource
	private CooperationMapper cooperationMapper;

	public Cooperation regist(String name, String contacts, String phone, Integer domain,Float feiScale, String region,String developerid,String guardianid) {
		Cooperation cooperation=new Cooperation();
		if(name!=null&&!name.trim().isEmpty()){
			cooperation.setName(name);
		}
		if(contacts!=null&&!contacts.trim().isEmpty()){
			cooperation.setContacts(contacts);
		}
		if(phone!=null&&!phone.trim().isEmpty()){
			cooperation.setPhone(phone);
		}
		if(domain!=null){
			cooperation.setDomain(domain);
		}
		if(feiScale!=null){
			cooperation.setFeiScale(feiScale);
		}
		if(region!=null&&!region.trim().isEmpty()){
			cooperation.setRegion(region);
		}
		if(developerid!=null&&!developerid.trim().isEmpty()){
			cooperation.setDeveloperid(developerid);
		}
		if(guardianid!=null&&!guardianid.trim().isEmpty()){
			cooperation.setGuardianid(guardianid);
		}
		int n=cooperationMapper.insertSelective(cooperation);
		if(n!=1){
			throw new RuntimeException("添加失败");
		}
		return cooperation;
	}

	public int update(Integer id,String name, String contacts, String phone, Integer domain, Float feiScale,
			String region, String developerid, String guardianid)throws IdNullException, CooperationNameException {
		if(id==null){
			throw new IdNullException("id为空");
		}
		Cooperation cooperation=new Cooperation();
		cooperation.setId(id);
		if(name!=null&&!name.trim().isEmpty()){
			CooperationExample example=new CooperationExample();
			example.createCriteria().andNameEqualTo(name);
			List<Cooperation> cooperationList=cooperationMapper.selectByExample(example);
			if(cooperationList!=null&&cooperationList.size()!=0){
				throw new CooperationNameException("企业已注册");
			}
			cooperation.setName(name);
		}
		if(contacts!=null&&contacts.trim().isEmpty()){
			cooperation.setContacts(contacts);
		}
		if(phone!=null&&phone.trim().isEmpty()){
			cooperation.setPhone(phone);
		}
		if(domain!=null){
			cooperation.setDomain(domain);
		}
		if(feiScale!=null){
			cooperation.setFeiScale(feiScale);
		}
		if(region!=null){
			cooperation.setRegion(region);
		}
		if(developerid!=null){
			cooperation.setDeveloperid(developerid);
		}
		if(guardianid!=null){
			cooperation.setGuardianid(guardianid);;
		}
		int n=cooperationMapper.updateByPrimaryKeySelective(cooperation);
		return n;
	}

	public int delete(int id) {
		int n=cooperationMapper.deleteByPrimaryKey(id);
		return n;
	}

	public List<Cooperation> selectList(String name) {
		CooperationExample example=new CooperationExample();
		CooperationExample.Criteria cooperationCriteria=example.createCriteria();
		cooperationCriteria.andIdIsNotNull();
		if(name!=null&&!name.trim().isEmpty()){
			cooperationCriteria.andNameLike("%"+name+"%");
		}
		List<Cooperation> cooperationList=cooperationMapper.selectByExample(example);
		return cooperationList;
	}

}

package com.ocd.ecocert.service;

import java.util.List;

import com.ocd.ecocert.entity.Cooperation;

public interface CooperationService {
	Cooperation regist(String name, String contacts, String phone, Integer domain,Float feiScale, String region,String developerid,String guardianid);
	int update(Integer id,String name, String contacts, String phone, Integer domain,Float feiScale, String region,String developerid,String guardianid) throws IdNullException, CooperationNameException;
	int delete(int id);
	List<Cooperation> selectList(String name);
}
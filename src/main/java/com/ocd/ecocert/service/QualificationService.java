package com.ocd.ecocert.service;

import java.util.Date;
import java.util.List;

import com.ocd.ecocert.entity.Qualification;


public interface QualificationService {
	
	Qualification regist(String userId,Integer authenticationDomainId ,String qualificationName,String qualificationRegistrationMark,Date beginTime,Date endTime,String status,String remarks);
	int update(String id,Integer authenticationDomainId ,String qualificationName,String qualificationRegistrationMark,Date beginTime,Date endTime,String status,String remarks);
	int delete(String id);
	List<Qualification> select(String userId);
}

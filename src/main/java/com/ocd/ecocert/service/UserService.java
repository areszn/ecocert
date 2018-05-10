package com.ocd.ecocert.service;

import java.util.Date;
import java.util.List;

import com.ocd.ecocert.entity.User;

public interface UserService {
	User login(String name,String password) throws UserNotFoundException,PasswordException;
	User regist(String name,String realname,String password,String confirm,String phone,Integer age,Integer fulltime,String gender,String education,String major,String idNumber,String workExperience,Date hiredate,Date leavedate) throws UserNameException,PasswordException;
	int update(String id,String name,String realname,String password,String confirm,String phone,Integer age,Integer fulltime,String gender,String education,String major,String idNumber,String workExperience,Date hiredate,Date leavedate)
			throws IdNullException, PasswordException,AgeException;
	int delete(String id);
	List<User> selectUseList(Integer authenticationDomain,String post,String specialtyCode,String professionalLevel,Integer fulltime,String realname,String location,String workingCondition);
	List<User> selectUseList();
}

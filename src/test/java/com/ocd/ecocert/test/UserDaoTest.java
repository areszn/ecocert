package com.ocd.ecocert.test;

import java.util.List;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ocd.ecocert.dao.UserMapper;
import com.ocd.ecocert.entity.User;
import com.ocd.ecocert.entity.UserExample;



public class UserDaoTest extends BaseTest {

	UserMapper dao;
//	@Before 
//	public void initdao(){
//		dao = ctx.getBean(
//				"userDao", UserMapper.class);
//	}
	@Test
	public void testdeleteeUser(){
		
		
		
		UserMapper dao = ctx.getBean(
			"userMapper", UserMapper.class);
		UserExample example=new UserExample();
		UserExample.Criteria userCriteria=example.createCriteria(); 
		userCriteria.andPostLike("%前%");
		
		List<User> userList=dao.selectByExample(example);
		
		System.out.println(userList); 
	}
//	@Test
//	public void testdeleteeUser(){
//		
//		String id="8";
//		
//		
//		UserDao dao = ctx.getBean(
//			"userDao", UserDao.class);
//		int user2 = dao.deleteUser(id);
//		System.out.println(user2); 
//	}
//	@Test
//	public void testupdateUser(){
//		String name = "andy";
//		int id=2;
//		User user=new User();
//		user.setName(name);
//		user.setId("2");
//		UserDao dao = ctx.getBean(
//			"userDao", UserDao.class);
//		int user2 = dao.updateUser(user);
//		System.out.println(user2); 
//	}
	
//	
//	@Test
//	public void testFindUserByName(){
//		String name = "admin";
//		UserDao dao = ctx.getBean(
//			"userDao", UserDao.class);
//		User user = dao.findUserByName(name);
//		System.out.println(user); 
//	}
//	@Test
//	public void testinsertUser(){
//		
//		String name = "tom13";
//		String salt="今天你吃了吗";
//		String password=DigestUtils.md5Hex(salt+"123456");
//		String realname="石高超";
//		int age=30;
//		String gender="男";
//		User user=new User();
//		user.setAge(age);
//		user.setGender(gender);
//		user.setName(name);
//		user.setRealname(realname);
//		user.setPassword(password);
//		
//		 dao.addUser(user);
//	}
}

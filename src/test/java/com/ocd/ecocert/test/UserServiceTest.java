package com.ocd.ecocert.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ocd.ecocert.entity.User;
import com.ocd.ecocert.service.UserService;


public class UserServiceTest extends BaseTest {
	
	
	
//	@Test
//	public void testRegist(){
//		UserService service;
//		
//		service = ctx.getBean("userService",
//				UserService.class);
//		User user = service.regist(
//				"sandy", "sandy", "123456", 
//				"123456");
//		System.out.println(user); 
//	}
	@Test
	public void testselect(){
		UserService service;
		
		service = ctx.getBean("userService",
				UserService.class);
		
		List<User> userList= service.selectUseList(1, null, null, null, null,null, null, null);
		System.out.println(userList);
	}
//	@Test
//	public void testupdate(){
//		UserService service;
//		
//		service = ctx.getBean("userService",
//				UserService.class);
//		int user = service.update("2","Asndy", "Andy", "123456","123456", 30, "女");
//		System.out.println(user); 
//	}
//	@Test
//	public void testLogin(){
//		UserService service;
//		
//		service = ctx.getBean("userService",
//				UserService.class);
//		String name = "andy2";
//		String password = "123456";
//		User user = service.login(
//			name, password);
//		System.out.println("111");
//		System.out.println(user); 
//	
//}
}




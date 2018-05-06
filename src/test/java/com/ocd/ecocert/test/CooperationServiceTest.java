package com.ocd.ecocert.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ocd.ecocert.entity.Cooperation;
import com.ocd.ecocert.entity.User;
import com.ocd.ecocert.service.CooperationService;
import com.ocd.ecocert.service.UserService;


public class CooperationServiceTest extends BaseTest {
	
	
	
	@Test
	public void testRegist(){
		CooperationService service;
		float f=(float) 123123.123;
		service = ctx.getBean("cooperationService",
				CooperationService.class);
		int n=service.update(3, "a公司", "a联系人", "13988884444", 1, f, "铁西", "a张三", "a李四");
		System.out.println(n);
	}
//	@Test
//	public void testselect(){
//		CooperationService service;
//		
//		service = ctx.getBean("cooperationService",
//				CooperationService.class);
//		float f=(float) 123123.123;
//		Cooperation n=service.regist("B公司", "B联系人", "13988884444", 1, f, "铁西", "张三", "李四");
//		System.out.println(n);
//	}
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




package com.ocd.ecocert.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocd.ecocert.entity.User;
import com.ocd.ecocert.service.PasswordException;
import com.ocd.ecocert.service.UserNameException;
import com.ocd.ecocert.service.UserNotFoundException;
import com.ocd.ecocert.service.UserService;
import com.ocd.ecocert.util.JsonResult;

@Controller
@RequestMapping("/user")
public class UserController extends AbstractController {
	@Resource
	private UserService userService;
	private String login="/log_in.html";
	@RequestMapping("/login.do")
	@ResponseBody
	public Object login(String name,String password,HttpSession session){

		User user=userService.login(name, password);
		//登录成功时，将user信息保存到session
		session.setAttribute("loginUser", user);
		return new JsonResult(user);

	}
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseBody
	public JsonResult handleUserNotFound(
			UserNotFoundException e){
		e.printStackTrace();
		return new JsonResult(2,e);
	}

	@ExceptionHandler(PasswordException.class)
	@ResponseBody
	public JsonResult handlePassword(
			PasswordException e){
		e.printStackTrace();
		return new JsonResult(3,e);
	}

	@ExceptionHandler(UserNameException.class)
	@ResponseBody
	public JsonResult handleUserName(
			UserNameException e){
		e.printStackTrace();
		return new JsonResult(4,e);
	}
	@RequestMapping("/regist.do")
	@ResponseBody
	public JsonResult regist(String name,String realname,String password,String confirm,String phone,Integer age,Integer fulltime,String gender,String education,String major,String idNumber,String workExperience,@DateTimeFormat(pattern = "MM-dd-yyyy")Date hiredate,@DateTimeFormat(pattern = "MM-dd-yyyy")Date leavedate){
		User user=userService.regist(name, realname, password, confirm, phone, age, fulltime, gender, education, major, idNumber, workExperience, hiredate, leavedate);
		return new JsonResult(user);
	}
	@RequestMapping("/update.do")
	@ResponseBody
	public JsonResult update(String id,String name, String realname, String password, String confirm,String phone,Integer age,Integer fulltime,String gender,String education,String major,String idNumber,String workExperience,@DateTimeFormat(pattern = "MM-dd-yyyy")Date hiredate,@DateTimeFormat(pattern = "MM-dd-yyyy")Date leavedate){
		int n=userService.update(id,name, realname, password, confirm, phone, age, fulltime, gender, education, major, idNumber, workExperience, hiredate, leavedate);
		return new JsonResult(n);
	}
	/*@RequestMapping("/userList.do")
	@ResponseBody
	public JsonResult userList(Integer authenticationDomain,String post,String specialtyCode,String professionalLevel,Integer fulltime,String realname,String location,String workingCondition){

		just for test
		List<User> userList=userService.selectUseList(authenticationDomain, post, specialtyCode, professionalLevel, fulltime, realname, location, workingCondition);


		return new JsonResult(userList);
		}*/

	@RequestMapping("/userList.do")
	//@ResponseBody
	public String userList(){

		return "{    \"result\": \"success\",    \"data\": [\t{emnumber: \"1\", name:\"幻影刺客1\", sex: \"击杀\", cardid: \"斧王\", phone: \"幻影刺客击杀了斧王。\",location:\"location\",isfulltime:\"isfulltime\",learningexperience:\"learningexperience\",workexperience:\"workexperience\",photo:\t\t\t\t\t\t\t\"photo\",startdate:\"startdate\",enddate:\"enddate\"},\t\t\t\t\t\t\t{emnumber: \"2\", name:\"幻影刺客2\", sex: \"击杀\", cardid: \"斧王\", phone: \"幻影刺客击杀了斧王。\",location:\"location\",isfulltime:\"isfulltime\",learningexperience:\"learningexperience\",workexperience:\"workexperience\",photo:\t\t\t\t\t\t\t\"photo\",startdate:\"startdate\",enddate:\"enddate\"},\t\t\t\t\t\t\t{emnumber: \"3\", name:\"幻影刺客3\", sex: \"击杀\", cardid: \"斧王\", phone: \"幻影刺客击杀了斧王。\",location:\"location\",isfulltime:\"isfulltime\",learningexperience:\"learningexperience\",workexperience:\"workexperience\",photo:\t\t\t\t\t\t\t\"photo\",startdate:\"startdate\",enddate:\"enddate\"},\t\t\t\t\t\t\t{emnumber: \"4\", name:\"幻影刺客4\", sex: \"击杀\", cardid: \"斧王\", phone: \"幻影刺客击杀了斧王。\",location:\"location\",isfulltime:\"isfulltime\",learningexperience:\"learningexperience\",workexperience:\"workexperience\",photo:\t\t\t\t\t\t\t\"photo\",startdate:\"startdate\",enddate:\"enddate\"},\t\t\t\t\t\t\t{emnumber: \"5\", name:\"幻影刺客5\", sex: \"击杀\", cardid: \"斧王\", phone: \"幻影刺客击杀了斧王。\",location:\"location\",isfulltime:\"isfulltime\",learningexperience:\"learningexperience\",workexperience:\"workexperience\",photo:\t\t\t\t\t\t\t\"photo\",startdate:\"startdate\",enddate:\"enddate\"},\t\t\t\t\t\t\t{emnumber: \"6\", name:\"幻影刺客6\", sex: \"击杀\", cardid: \"斧王\", phone: \"幻影刺客击杀了斧王。\",location:\"location\",isfulltime:\"isfulltime\",learningexperience:\"learningexperience\",workexperience:\"workexperience\",photo:\t\t\t\t\t\t\t\"photo\",startdate:\"startdate\",enddate:\"enddate\"},\t\t\t\t\t\t\t{emnumber: \"7\", name:\"幻影刺客7\", sex: \"击杀\", cardid: \"斧王\", phone: \"幻影刺客击杀了斧王。\",location:\"location\",isfulltime:\"isfulltime\",learningexperience:\"learningexperience\",workexperience:\"workexperience\",photo:\t\t\t\t\t\t\t\"photo\",startdate:\"startdate\",enddate:\"enddate\"}    ],    \"message\": \"\",    \"pager\": {        \"page\": 1,                  \"recTotal\": 1001,            \"recPerPage\": 10,        }}";

	}

	@RequestMapping("/logout.do")
	@ResponseBody
	public void logout(HttpSession session,HttpServletRequest req,HttpServletResponse res){
		
		session.invalidate();
		
		try {
			res.sendRedirect(req.getContextPath()+login);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

package com.ocd.ecocert.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocd.ecocert.entity.Cooperation;
import com.ocd.ecocert.entity.User;
import com.ocd.ecocert.service.CooperationNameException;
import com.ocd.ecocert.service.CooperationService;
import com.ocd.ecocert.service.IdNullException;
import com.ocd.ecocert.service.UserNotFoundException;
import com.ocd.ecocert.util.JsonResult;

@Controller
@RequestMapping("/cooperation")
public class CooperationController {
	@Resource
	private CooperationService cooperationService;
	@RequestMapping("/regist.do")
	@ResponseBody
	public JsonResult regist(String name, String contacts, String phone, Integer domain,Integer age,Float feiScale, String region,String developerid,String guardianid){
		Cooperation cooperation=cooperationService.regist(name,contacts,phone,domain,feiScale,region,developerid,guardianid);
		return new JsonResult(cooperation);
	}
	@ExceptionHandler(IdNullException.class)
	@ResponseBody
	public JsonResult handleUserNotFound(
			IdNullException e){
		e.printStackTrace();
		return new JsonResult(2,e);
	}
	@ExceptionHandler(CooperationNameException.class)
	@ResponseBody
	public JsonResult handleUserNotFound(
			CooperationNameException e){
		e.printStackTrace();
		return new JsonResult(2,e);
	}
	@RequestMapping("/update.do")
	@ResponseBody
	public JsonResult update(Integer id,String name, String contacts, String phone, Integer domain,Float feiScale, String region,String developerid,String guardianid){
		int n=cooperationService.update(id,name,contacts,phone,domain,feiScale,region,developerid,guardianid);
		return new JsonResult(n);
	}
	
	@RequestMapping("/delete.do")
	@ResponseBody
	public int delete(int id) {
		int n=cooperationService.delete(id);
		
		return n;
	}
	@RequestMapping("/cooperationListList.do")
	@ResponseBody
	public JsonResult cooperationListList(String name){
		List<Cooperation> cooperationList=cooperationService.selectList(name);
		return new JsonResult(cooperationList);
		}
	
}

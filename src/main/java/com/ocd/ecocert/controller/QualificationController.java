package com.ocd.ecocert.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocd.ecocert.entity.Qualification;
import com.ocd.ecocert.service.QualificationService;
import com.ocd.ecocert.util.JsonResult;

@Controller
@RequestMapping("/qualification")
public class QualificationController extends AbstractController {
	@Resource
	private QualificationService qualificationrService;

	@RequestMapping("/regist.do")
	@ResponseBody
	public JsonResult regist(String userId,@RequestParam Integer authenticationDomainId,@RequestParam String qualificationName,@RequestParam String qualificationRegistrationMark,@RequestParam @DateTimeFormat(pattern = "MM-dd-yyyy") Date beginTime,
			@RequestParam @DateTimeFormat(pattern = "MM-dd-yyyy")Date endTime,@RequestParam String status, String remarks){
		Qualification qualification=qualificationrService.regist(userId,authenticationDomainId, qualificationName, qualificationRegistrationMark, beginTime, endTime, status, remarks);
				return new JsonResult(qualification);
	}
	@RequestMapping("/update.do")
	@ResponseBody
	public JsonResult update(@RequestParam String id,Integer authenticationDomainId, String qualificationName, String qualificationRegistrationMark,@DateTimeFormat(pattern = "MM-dd-yyyy") Date beginTime,
			@DateTimeFormat(pattern = "MM-dd-yyyy")Date endTime,String status, String remarks){
		int n=qualificationrService.update(id,authenticationDomainId, qualificationName, qualificationRegistrationMark, beginTime, endTime, status, remarks);
		return new JsonResult(n);
	}
	@RequestMapping("/qualificationList.do")
	@ResponseBody
	public JsonResult qualificationList(String userId){
		List<Qualification> qualificationList=qualificationrService.select(userId);

		return new JsonResult(qualificationList);
		}

}

package com.ocd.ecocert.controller;

import java.io.IOException;
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

import com.ocd.ecocert.entity.Finance;
import com.ocd.ecocert.entity.VFinance;
import com.ocd.ecocert.service.FinanceService;
import com.ocd.ecocert.util.JsonResult;

@Controller
@RequestMapping("/finance")
public class FinanceController extends AbstractController {
	@Resource
	private FinanceService financeService;

	@RequestMapping("/regist.do")
	@ResponseBody
	public JsonResult regist(String company,Integer cooperrationId,String contractNumber,String chargeItem,Float amountReceivable,Float income,String description,@DateTimeFormat(pattern = "MM-dd-yyyy")Date date,Float arrears,int owner,String remark){
		Finance finance=financeService.regist(company, cooperrationId, contractNumber, chargeItem, amountReceivable, income, description, date, arrears, owner, remark);
				return new JsonResult(finance);
	}
	@RequestMapping("/update.do")
	@ResponseBody
	public JsonResult update(String id,String company,int cooperrationId, String contractNumber,String chargeItem,Float amountReceivable,Float income,String description,@DateTimeFormat(pattern = "MM-dd-yyyy")Date date,Float arrears,int owner,String remark){
		int n=financeService.update(id,company,cooperrationId, contractNumber, chargeItem, amountReceivable, income, description, date, arrears, owner, remark);
		return new JsonResult(n);
	}
	@RequestMapping("/delete.do")
	@ResponseBody
	public JsonResult delete(String id){
		int n=financeService.delete(id);
		return new JsonResult(n);
	}
	@RequestMapping("/userList.do")
	@ResponseBody
	public JsonResult selectFinanceList(String company,String chargeItem,@DateTimeFormat(pattern = "MM-dd-yyyy")Date dateBegin,@DateTimeFormat(pattern = "MM-dd-yyyy")Date dateEnd,Integer cooperrationId){
		List<VFinance> financeList=financeService.selectFinanceList(company, chargeItem, dateBegin, dateEnd, cooperrationId);
		return new JsonResult(financeList);
		}
	
}

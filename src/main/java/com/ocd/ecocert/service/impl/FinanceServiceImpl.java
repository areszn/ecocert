package com.ocd.ecocert.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ocd.ecocert.dao.FinanceMapper;
import com.ocd.ecocert.dao.VFinanceMapper;
import com.ocd.ecocert.entity.Finance;
import com.ocd.ecocert.entity.FinanceExample;
import com.ocd.ecocert.entity.User;
import com.ocd.ecocert.entity.UserExample;
import com.ocd.ecocert.entity.VFinance;
import com.ocd.ecocert.entity.VFinanceExample;
import com.ocd.ecocert.service.AgeException;
import com.ocd.ecocert.service.FinanceService;
import com.ocd.ecocert.service.IdNullException;
import com.ocd.ecocert.service.PasswordException;
import com.ocd.ecocert.service.UserNameException;

@Service("financeService")
@Transactional
public class FinanceServiceImpl implements FinanceService  {
	@Resource
	private FinanceMapper financeDao;
	@Resource
	private VFinanceMapper vfinanceDao;
	public Finance regist(String company,int cooperrationId, String contractNumber,String chargeItem,Float amountReceivable,Float income,String description,Date date,Float arrears,int owner,String remark) {
		Finance finance=new Finance();
		FinanceExample example=new FinanceExample();
		//设置公司名称
		if(company==null||company.trim().isEmpty()){
			throw new RuntimeException("公司名称为空");
		}
		finance.setCompany(company);
		
		finance.setCooperrationId(cooperrationId);
		if(contractNumber==null||contractNumber.trim().isEmpty()){
			throw new RuntimeException("合同编号为空");
		}
		finance.setContractNumber(contractNumber);
		if(chargeItem==null||chargeItem.trim().isEmpty()){
			throw new RuntimeException("收费项目为空");
		}
		finance.setChargeItem(chargeItem);
		if(amountReceivable==null){
			throw new RuntimeException("应收金额为空");
		}
		finance.setAmountReceivable(amountReceivable);
		if(income==null){
			throw new RuntimeException("进账金额为空");
		}
		finance.setIncome(income);
		if(date!=null){
			finance.setDate(date);;
		}
		if(description!=null){
			finance.setDescription(description);
		}
		finance.setOwner(owner);
		if(remark!=null){
			finance.setRemark(remark);
		}
		int n=financeDao.insertSelective(finance);
		if(n!=1){
			throw new RuntimeException("添加失败");
		}
		return finance;
	}
	public int update(String id,String company,int cooperrationId,String contractNumber,String chargeItem,Float amountReceivable,Float income,String description,Date date,Float arrears,int owner,String remark) {
		if(id==null||id.trim().isEmpty()){
			throw new IdNullException("id不能为空");
		}
		Finance finance=new Finance();
		int intId=Integer.parseInt(id);
		finance.setId(intId);
		//设置公司名称
		if(company!=null&&!company.trim().isEmpty()){
			finance.setCompany(company);
		}
		
		finance.setCooperrationId(cooperrationId);
		if(contractNumber!=null&&!contractNumber.trim().isEmpty()){
			finance.setContractNumber(contractNumber);
		}
		
		if(chargeItem!=null&&!chargeItem.trim().isEmpty()){
			finance.setChargeItem(chargeItem);
		}
		
		if(amountReceivable!=null){
			finance.setAmountReceivable(amountReceivable);
		}
		
		if(income!=null){
			finance.setIncome(income);
		}
		
		if(date!=null){
			finance.setDate(date);;
		}
		if(description!=null){
			finance.setDescription(description);
		}
		finance.setOwner(owner);
		if(remark!=null){
			finance.setRemark(remark);
		}
		int n=financeDao.updateByPrimaryKeySelective(finance);
		if(n!=1){
			throw new RuntimeException("修改失败");
		}
		return n;
	}
	public int delete(String id) {
		if(id==null||id.trim().isEmpty()){
			throw new IdNullException("id为空");
		}
		int intId=Integer.parseInt(id);
		int n=financeDao.deleteByPrimaryKey(intId);
		if(n!=1){
			throw new RuntimeException("删除失败");
		}
		return n;
	}
	public List<VFinance> selectFinanceList(String company,String chargeItem,Date dateBegin,Date dateEnd,Integer cooperrationId) {
		VFinanceExample example=new VFinanceExample();
		VFinanceExample.Criteria vfinancExampleCriteria=example.createCriteria();
		vfinancExampleCriteria.andIdIsNotNull();
		if(company!=null&&!company.trim().isEmpty()){
			vfinancExampleCriteria.andCompanyLike("%"+company+"%");
		}
		if(chargeItem!=null&&!chargeItem.trim().isEmpty()){
			vfinancExampleCriteria.andChargeItemEqualTo(chargeItem);
		}
		if(dateBegin!=null){
			vfinancExampleCriteria.andDateGreaterThanOrEqualTo(dateBegin);
		}
		if(dateEnd!=null){
			vfinancExampleCriteria.andDateGreaterThanOrEqualTo(dateEnd);
		}
		if(cooperrationId!=null){
			vfinancExampleCriteria.andCooperrationIdEqualTo(cooperrationId);
		}
		List<VFinance> financeList=vfinanceDao.selectByExample(example);
		return financeList;
	}
}

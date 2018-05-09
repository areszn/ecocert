package com.ocd.ecocert.service;

import java.util.Date;
import java.util.List;

import com.ocd.ecocert.entity.Finance;
import com.ocd.ecocert.entity.VFinance;

public interface FinanceService {
	Finance regist(String company,int cooperrationId,String contractNumber,String chargeItem,Float amountReceivable,Float income,String description,Date date,Float arrears,int owner,String remark);
	int update(String id,String company,int cooperrationId,String contractNumber,String chargeItem,Float amountReceivable,Float income,String description,Date date,Float arrears,int owner,String remark);
	int delete(String id);
	List<VFinance> selectFinanceList(String company,String chargeItem,Date dateBegin,Date dateEnd,Integer cooperrationId);
}

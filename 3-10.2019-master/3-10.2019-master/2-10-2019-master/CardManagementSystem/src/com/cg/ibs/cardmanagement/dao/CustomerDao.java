package com.cg.ibs.cardmanagement.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.ibs.cardmanagement.cardbean.CaseIdBean;
import com.cg.ibs.cardmanagement.cardbean.CreditCardBean;
import com.cg.ibs.cardmanagement.cardbean.DebitCardBean;

public interface CustomerDao {
	
	void newDebitCard(CaseIdBean customId,BigInteger accountNumber);
	
	List <DebitCardBean> viewAllDebitCards();

	List<CreditCardBean> viewAllCreditCards();

}

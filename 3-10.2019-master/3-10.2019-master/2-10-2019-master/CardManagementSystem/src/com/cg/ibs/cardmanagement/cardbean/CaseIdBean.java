package com.cg.ibs.cardmanagement.cardbean;

import java.math.BigInteger;
import java.util.Date;

public class CaseIdBean {
	private String caseIdTotal;
	private Date caseTimeStamp;
	 private String statusOfQuery;
	private BigInteger accountNumber ;
	private String UCI = "7894561239632587" ;
	private String defineQuery;
	

	public String getDefineQuery() {
		return defineQuery;
	}
	public void setDefineQuery(String defineQuery) {
		this.defineQuery = defineQuery;
	}
	public BigInteger getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUCI() {
		return UCI;
	}
	public void setUCI(String uCI) {
		UCI = uCI;
	}
	public String getCaseIdTotal() {
		return caseIdTotal;
	}
	public void setCaseIdTotal(String caseIdTotal) {
		this.caseIdTotal = caseIdTotal;
	}
	public  Date getCaseTimeStamp() {
		return caseTimeStamp;
	}
	public void setCaseTimeStamp(Date timestamp) {
		this.caseTimeStamp = timestamp;
	}
	public String getStatusOfQuery() {
		return statusOfQuery;
	}
	public void setStatusOfQuery(String statusOfQuery) {
		this.statusOfQuery = statusOfQuery;
	}
	
	
	
}

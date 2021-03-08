package com.loan.apply.portal.details;



import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="loan")
public class Loandetails {
	@Id
	private String id;
	
	private String userid;
	@NotNull
	private String loanType;
	@NotNull
	private float loanAmount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "Loandetails [id=" + id + ", userid=" + userid + ", loanType=" + loanType + ", loanAmount=" + loanAmount
				+ "]";
	}
	
}

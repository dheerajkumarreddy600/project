package com.loan.apply.portal.details;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="loan")
public class Loandetails {
	@Id
	private String id;
	
	private String userid;
	
	private String LoanType;

	private float LoanAmount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLoanType() {
		return LoanType;
	}
	public void setLoanType(String loanType) {
		LoanType = loanType;
	}
	public float getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		LoanAmount = loanAmount;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Loandetails [id=" + id + ", userid=" + userid + ", LoanType=" + LoanType + ", LoanAmount=" + LoanAmount
				+ "]";
	}
	
   
}

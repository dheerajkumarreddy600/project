package com.loan.apply.portal.service;

import com.loan.apply.portal.details.Loandetails;

public interface Loan_service {
	public String CreateLoan(Loandetails ln,String id);
	public float Getemi(String id,float months);
	
}

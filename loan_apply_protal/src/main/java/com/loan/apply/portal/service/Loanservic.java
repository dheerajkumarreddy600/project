package com.loan.apply.portal.service;

import com.loan.apply.portal.details.Loandetails;

public interface Loanservic {
	public String createLoan(Loandetails ln,String id);
	public float getemi(String id,float months);
	public String applyLoan(String id);
	public String getApplication(String id);
}

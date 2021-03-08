package com.loan.apply.portal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.apply.portal.details.Loandetails;
import com.loan.apply.portal.repos.Loanrepo;
@Service
public class LoanService implements Loan_service {
	@Autowired
   private Loanrepo lr;
	@Override
	public String CreateLoan(Loandetails ln, String id) {
	   ln.setUserid(id);
	   lr.save(ln);
		return "details added";
	}
	@Override
	public float Getemi(String id, float months) {
		
		Loandetails c=getbyid(id);
		float x=c.getLoanAmount();
		
		
		return  emi(x,months);
	
	}
	public Loandetails getbyid(String id) {
		Loandetails current=lr.findUserByuserid(id);
		return current;
	}
   
	   public float emi(float x,float m) {
	    	 float emi; 
	         float r=10;
	         r = r / (12 * 100); // one month interest 
	         
	         emi = (x * r * (float)Math.pow(1 + r, m))  
	                 / (float)(Math.pow(1 + r, m) - 1); 
	       
	         return (emi); 
	    	
	    	
	    	
	    }
	
	

		
	
}

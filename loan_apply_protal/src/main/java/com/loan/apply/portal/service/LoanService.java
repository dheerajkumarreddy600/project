package com.loan.apply.portal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.apply.portal.details.ApplicationForm;
import com.loan.apply.portal.details.Employement;
import com.loan.apply.portal.details.Loandetails;
import com.loan.apply.portal.details.User;
import com.loan.apply.portal.repos.Applicationrepo;
import com.loan.apply.portal.repos.Employerepo;
import com.loan.apply.portal.repos.Loanrepo;
import com.loan.apply.portal.repos.Userrepo;
@Service
public class LoanService implements Loanservic {
	@Autowired
   private Loanrepo lr;
	@Autowired
	private Applicationrepo ar;
	@Autowired
	private Userrepo ur;
	@Autowired
	private Employerepo er;
	@Override
	public String createLoan(Loandetails ln, String id) {
	   ln.setUserid(id);
	   lr.save(ln);
		return "details added";
	}
		@Override
	public float getemi(String id, float months) {
		
		Loandetails c=getbyid(id);
		float x=c.getLoanAmount();
		
		
		return  emi(x,months);
	
	}
	public Loandetails getbyid(String id) {
		
		return lr.findUserByuserid(id);

	}

	public Employement getemp(String id) {
		return er.findUserByuserid(id);
	}
	public User getuser(String id) {
		return ur.findUserByid(id);
	}
   
	   public float emi(float x,float m) {
	    	 float emi; 
	         float r=10;
	         r = r / (12 * 100); // one month interest 
	         
	         emi = (x * r * (float)Math.pow(1 + r, m))  
	                 / (float)(Math.pow(1 + r, m) - 1); 
	     
	         return (emi); 
	    	
	    	
	    	
	    }
	@Override
	public String applyLoan(String id) {
		ApplicationForm af=new ApplicationForm();
		Loandetails ln=getbyid(id);
		Employement em=getemp(id);
		User us=getuser(id);
		af.setUserid(id);
		af.setForm("user Details"+"\n"+
				"FirstName :"+us.getFirstname()+"\n"
				+ "LastName :"+us.getLastname()+"\n"
				+ "Age :"+us.getAge()+"\n"
				+ "PhoneNumber :"+us.getIdproof()+"\n"
				+ "Address :"+us.getAddress()+"\n"
		        + "Education and Employement"+"\n"
				+ "Primary Education :"+em.getSchooling()+"\n"
				+ "Secondary Education :"+em.getInter()+"\n"
				+ "Graduation :"+em.getGraduation()+"\n"
				+ "Occupation :"+em.getOccupation()+"\n"
				+ "WorkExpirience (in years):"+em.getWorkExpirence()+"\n"
				+ "Monthly Income :"+em.getMonthlyincome()+"\n"
				+ "LoanDetails"+"\n"+"LoanType :"+ln.getLoanType()+"\n"+"LoanAmount :"+ln.getLoanAmount()
				
				);
		ar.save(af);
		return "Loan Applied successfully We will contact You with in a peroid of time"+af;
	}
	@Override
	public String getApplication(String id) {
		ApplicationForm af=getform(id);
		return af.getForm();
	}
	public ApplicationForm getform(String id) {
		return ar.findUserByuserid(id);
	}
	
	

		
	
}

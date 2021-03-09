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
public class UserService implements UserServic {
	@Autowired
	   private Loanrepo lr;
		@Autowired
		private Applicationrepo ar;
		@Autowired
		private Userrepo ur;
		@Autowired
		private Employerepo er;
     

	@Override
	public String createUser(User user) {
		User u = ur.findByphonenumber(user.getPhonenumber());

        if (u != null)
        {
             return "UserAlready Exists";
        }
        else
        {
        	
            ur.save(user);
        }
		return "usercreated";
	}

	

	

	@Override
	public String deleteUser(String id) {
		ApplicationForm af=getform(id);
		
		Loandetails ln=getbyid(id);
		Employement em=getemp(id);
		lr.deleteById(ln.getId());
		er.deleteById(em.getId());
		ar.deleteById(af.getId());
		ur.deleteById(id);
		return "user delete with id:"+id;
	}
public Loandetails getbyid(String id) {
		
		return lr.findUserByuserid(id);

	}

	public Employement getemp(String id) {
		return er.findUserByuserid(id);
	}
	public ApplicationForm getform(String id) {
		return ar.findUserByuserid(id);
	}
}
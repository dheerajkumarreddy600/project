package com.loan.apply.portal.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.apply.portal.details.User;

import com.loan.apply.portal.repos.Userrepo;

@Service
public class UserService implements UserServic {
     @Autowired
	 private Userrepo ur;

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
		ur.deleteById(id);
		return "user delete with id:"+id;
	}
}
package com.loan.apply.portal.service;

import java.util.Optional;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.apply.portal.details.User;
import com.loan.apply.portal.exception.Userexception;
import com.loan.apply.portal.repos.Userrepo;

@Service
public class UserService implements User_Service {
     @Autowired
	 private Userrepo ur;
	@Override
	public void CreateUser(User Phonenumber) throws ConstraintViolationException,Userexception
	{
		
		Optional<User> op=ur.findByPhonenumber(Phonenumber.getPhonenumber());
		if(op.isPresent()){
			throw new Userexception(Userexception.UserAllReadyExists());
		}
		else {
			ur.save(Phonenumber);
			
		}
		}
		
	}
 


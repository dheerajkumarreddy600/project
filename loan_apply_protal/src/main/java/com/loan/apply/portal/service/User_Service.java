package com.loan.apply.portal.service;

import javax.validation.ConstraintViolationException;

import com.loan.apply.portal.details.User;
import com.loan.apply.portal.exception.Userexception;

public interface User_Service {
public void CreateUser(User Phonenumber)throws ConstraintViolationException ,Userexception;
	

}
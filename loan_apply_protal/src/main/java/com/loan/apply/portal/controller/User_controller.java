package com.loan.apply.portal.controller;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.apply.portal.details.User;
import com.loan.apply.portal.exception.Userexception;
import com.loan.apply.portal.repos.Userrepo;
import com.loan.apply.portal.service.UserService;

@RestController
public class User_controller {
	@Autowired
	private Userrepo ur;
	@Autowired
	private UserService us;
	@PostMapping("/Adddetails")
	public ResponseEntity<?> saveUser(@RequestBody User use) {
		try {
		us.CreateUser(use);
		return new ResponseEntity<User>(use,HttpStatus.OK);
	}
		catch(ConstraintViolationException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.UNPROCESSABLE_ENTITY);
		}catch(Userexception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
		}
	}
	@GetMapping("/Findall")
	public List<User> getUser(){
		return ur.findAll();
	}
	

}

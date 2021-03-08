package com.loan.apply.portal.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.apply.portal.details.User;
import com.loan.apply.portal.repos.Userrepo;
import com.loan.apply.portal.service.UserService;

@RestController
public class User_controller {
	@Autowired
	private Userrepo ur;
	@Autowired
	private UserService us;
	@PostMapping("/Adddetails")
	public ResponseEntity<?> CreateUser( @ Valid @NotNull @RequestBody User use) {
		
		us.CreateUser(use);
		return new ResponseEntity<User>(use,HttpStatus.OK);
	}
	@GetMapping("/Findall")
	public List<User> getUser(){
		return ur.findAll();
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable String id)
	{
		return us.deleteUser(id);
	}

	

}

package com.loan.apply.portal.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.apply.portal.details.Employement;

import com.loan.apply.portal.service.Employee_Service;
@RestController
public class Employee_Contoller {
	
	@Autowired
	private Employee_Service Es;
	@PostMapping("/AddEmp/{id}")
	public ResponseEntity<?> CreateEmp(@RequestBody Employement emp , @PathVariable String id) {
		
		Es.CreateEmp(emp,id);
		return new ResponseEntity<Employement>(emp,HttpStatus.OK);
	}
	

}

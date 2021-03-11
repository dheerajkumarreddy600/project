package com.loan.apply.portal.controller;






import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.apply.portal.details.Employement;
import com.loan.apply.portal.service.EmployeeServic;
@RequestMapping("/api")
@RestController
public class EmployeeContoller {
	
	@Autowired
	private EmployeeServic es;
	
	@PostMapping("/AddEmp/{id}")
	public String  createEmp(@Valid @NotNull @RequestBody Employement emp , @PathVariable String id) {
		try {
		
	return 	es.createEmp(emp,id);
		}
		catch(Exception e) {
			return "user not found"+e;
		}
	}
	
}
	



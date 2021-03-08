package com.loan.apply.portal.controller;





import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.apply.portal.details.Loandetails;
import com.loan.apply.portal.service.LoanService;
@RestController
public class LoanController {
	@Autowired
	private LoanService ls;
	@PostMapping("/AddLoan/{id}")
	public String  createemp(@Valid @NotNull @RequestBody Loandetails ld , @PathVariable String id) {
		
		 return ls.createLoan(ld,id);
		
	}
	@GetMapping("/emi/{id}")
	public String getemi(@PathVariable String id, @RequestBody float months){
		float x= ls.getemi(id,months);
		
		return "emi for "+months+" months is:"+x;
	}
}

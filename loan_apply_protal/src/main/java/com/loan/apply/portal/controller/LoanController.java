package com.loan.apply.portal.controller;





import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.apply.portal.details.Loandetails;
import com.loan.apply.portal.service.LoanService;
@RestController
@RequestMapping("/api")
public class LoanController {
	@Autowired
	private LoanService ls;
	@PostMapping("/AddLoan/{id}")
	public String  createemp(@Valid @NotNull @RequestBody Loandetails ld , @PathVariable String id) {
		
		 return ls.createLoan(ld,id);
		
	}
	@GetMapping("/emi/{id}")
	public String getemi(@PathVariable String id,  @RequestParam(name="months") float months){
		try {
		float x= ls.getemi(id,months);
		
		return "emi for "+months+" months is:"+x;
		}
		catch(Exception e) {
			return ""+e;
		}
	}
	@PostMapping("/Applyloan/{id}")
	public String applyLoan(@PathVariable String id) {
		try {
	return 	ls.applyLoan(id);
		
	}
		catch(Exception e) {
			return "user not found"+e;		}
	}
	@GetMapping("/getApplication/{id}")
	public String getApplication(@PathVariable String id)
	{try {
		return ls.getApplication(id);
	}
	catch(Exception e) {
		return "userNot found  "+e;
	}
	}
}

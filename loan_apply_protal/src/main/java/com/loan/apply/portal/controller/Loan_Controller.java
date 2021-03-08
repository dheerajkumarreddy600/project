package com.loan.apply.portal.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.apply.portal.details.Loandetails;
import com.loan.apply.portal.service.LoanService;
@RestController
public class Loan_Controller {
	@Autowired
	private LoanService ls;
	@PostMapping("/AddLoan/{id}")
	public ResponseEntity<?> Createemp( @RequestBody Loandetails ld , @PathVariable String id) {
		
		ls.CreateLoan(ld,id);
		return new ResponseEntity<Loandetails>(ld,HttpStatus.OK);
	}
	@GetMapping("/emi/{id}")
	public String Getemi(@PathVariable String id, @RequestBody float months){
		float x= ls.Getemi(id,months);
		return "emi for "+months+" months is:"+x;
	}
}

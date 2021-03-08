package com.loan.apply.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.apply.portal.details.Employement;
import com.loan.apply.portal.repos.Employerepo;
@Service
public class EmployeeServic  implements EmployeeService
{
	@Autowired
   private Employerepo er;
	@Override
	public String createEmp(Employement emp,String id) {
		emp.setUserid(id);
		er.save(emp);
		return "employement details added";
	}
	
}

package com.loan.apply.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.apply.portal.details.Employement;
import com.loan.apply.portal.repos.Employerepo;
@Service
public class Employee_Service  implements EmployeeService
{
	@Autowired
   private Employerepo Er;
	@Override
	public String CreateEmp(Employement emp,String id) {
		emp.setUserid(id);
		Er.save(emp);
		return "employement details added";
	}
	
}

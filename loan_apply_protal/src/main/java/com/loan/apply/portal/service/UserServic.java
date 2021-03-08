package com.loan.apply.portal.service;


import com.loan.apply.portal.details.User;


public interface UserServic {
	
	public String createUser(User user);

	public String deleteUser(String id);
}

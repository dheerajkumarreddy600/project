package com.loan.apply.portal.exception;

public class Userexception extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Userexception(String message) {
		super(message);
	}
	public static String NotfoundException(String id) {
		return "Id not found"+id;
	}
	public static String UserAllReadyExists() {
		return "User all ready exists";
	}

}

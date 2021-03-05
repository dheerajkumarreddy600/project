package com.loan.apply.portal.details;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="user")
public class User {
	@Id
       private String id;
	@NotNull(message =" first name cannot be null")
       private String Firstname;
	@NotNull(message ="Last name cannot be null")
       private String Lastname;
	@NotNull(message ="Age is mandatory")
       private String Age;
	@NotNull(message ="cannot be null")
       private int phonenumber;
	@NotNull(message ="cannot be null")
       private String Idproof;
	@NotNull(message ="cannot be null")
       private String Address;
	@NotNull(message ="cannot be null")
       private String Educationdetails;
	@NotNull(message ="cannot be null")
       private String Loandetails;
	@NotNull(message ="cannot be null")
       private int loanAmount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getIdproof() {
		return Idproof;
	}
	public void setIdproof(String idproof) {
		Idproof = idproof;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEducationdetails() {
		return Educationdetails;
	}
	public void setEducationdetails(String educationdetails) {
		Educationdetails = educationdetails;
	}
	public String getLoandetails() {
		return Loandetails;
	}
	public void setLoandetails(String loandetails) {
		Loandetails = loandetails;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Age=" + Age
				+ ", phonenumber=" + phonenumber + ", Idproof=" + Idproof + ", Address=" + Address
				+ ", Educationdetails=" + Educationdetails + ", Loandetails=" + Loandetails + ", loanAmount="
				+ loanAmount + "]";
	}
       
       
}

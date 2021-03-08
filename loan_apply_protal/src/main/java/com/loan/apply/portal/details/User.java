package com.loan.apply.portal.details;

import javax.validation.constraints.NotNull;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection ="user")
public class User {
	@Id
       private String id;
	@NotNull(message =" first name cannot be null")
       private String firstname;
	@NotNull(message ="Last name cannot be null")
       private String lastname;
	@NotNull(message ="Age is mandatory")
       private String age;
	@NotNull(message ="cannot be null")
       private String phonenumber;
	@NotNull(message ="cannot be null")
       private String idproof;
	@NotNull(message ="cannot be null")
       private String address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", phonenumber=" + phonenumber + ", idproof=" + idproof + ", address=" + address + "]";
	}
	
	
}

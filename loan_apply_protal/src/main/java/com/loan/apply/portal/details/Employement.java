package com.loan.apply.portal.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection ="employee")
public class Employement {
     @Id
     private String id;
   
     private String userid;
     
     private String schooling ;
     
     private String inter;
     
     private String Graduation;
     
     private String Occupation;
     
     private String workExpirence;
     
     private float monthlyincome;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getSchooling() {
		return schooling;
	}
	public void setSchooling(String schooling) {
		this.schooling = schooling;
	}
	public String getInter() {
		return inter;
	}
	public void setInter(String inter) {
		this.inter = inter;
	}
	public String getGraduation() {
		return Graduation;
	}
	public void setGraduation(String graduation) {
		Graduation = graduation;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public String getWorkExpirence() {
		return workExpirence;
	}
	public void setWorkExpirence(String workExpirence) {
		this.workExpirence = workExpirence;
	}
	public float getMonthlyincome() {
		return monthlyincome;
	}
	public void setMonthlyincome(float monthlyincome) {
		this.monthlyincome = monthlyincome;
	}
	@Override
	public String toString() {
		return "Employement [id=" + id + ", userid=" + userid + ", schooling=" + schooling + ", inter=" + inter
				+ ", Graduation=" + Graduation + ", Occupation=" + Occupation + ", workExpirence=" + workExpirence
				+ ", monthlyincome=" + monthlyincome + "]";
	}
      
     
}

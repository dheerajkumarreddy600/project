package com.loan.apply.portal.details;

import javax.validation.constraints.NotNull;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection ="employee")
public class Employement {
     @Id
     private String id;
   
     private String userid;
     @NotNull
     private String schooling ;
     @NotNull
     private String inter;
     @NotNull
     private String graduation;
     @NotNull
     private String occupation;
     @NotNull
     private String workExpirence;
     @NotNull
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
		return graduation;
	}
	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
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
				+ ", graduation=" + graduation + ", occupation=" + occupation + ", workExpirence=" + workExpirence
				+ ", monthlyincome=" + monthlyincome + "]";
	}
	
}

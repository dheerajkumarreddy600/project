package com.loan.apply.portal.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Application")
public class ApplicationForm {
	@Id
    private String id;
	private String userid;
    private String form;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	
	@Override
	public String toString() {
		return "ApplicationForm [id=" + id + ", userid=" + userid + ", form=" + form + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
    
}

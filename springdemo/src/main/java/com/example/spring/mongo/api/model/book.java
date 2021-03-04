package com.example.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection ="Book")
public class book {
   @Id
   private int id;
   private String name;
   private String Authorname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthorname() {
	return Authorname;
}
public void setAuthorname(String authorname) {
	Authorname = authorname;
}
@Override
public String toString() {
	return "book [id=" + id + ", name=" + name + ", Authorname=" + Authorname + "]";
}
    
}

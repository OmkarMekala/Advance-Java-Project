package com.dtomodel;

public class Loginmodel {
 private String firstname;
 private Object password;
 public Loginmodel(){
 }
 public Loginmodel(String fullname,Object password){
	 this.firstname=fullname;
	 this.password=password;
 }
  public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public Object getPassword() {
	return password;
}
public void setPassword(Object password) {
	this.password = password;
}

  
  }

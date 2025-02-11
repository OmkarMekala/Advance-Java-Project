package com.dtomodel;

public class Sttudent {
	private String firstname;
	private String lastname;
	private Object password;
	 public Sttudent() {}
	 public Sttudent( String firstname) {
		 this.firstname=firstname;
	 }
	 public String getLastname() {  
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Object getPassword() {
		return password;
	}
	public void setPassword(Object password) {
		this.password = password;
	}
	public String getFirstname() {
	 return firstname;
}
	public void setFirstname(String firstname) {
		this.firstname=firstname; 
		}
	
	
	public String toString() {
		return firstname;
	}
	
	}

package com.dao;

import java.sql.Connection;
  

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dtomodel.Loginmodel;
import com.dtomodel.Sttudent;
import com.utility.dbconnection;

public class Studentdata implements studentinterf {
 String status="failure";
 Connection con;
	@Override
	public String  stidentinsert(Sttudent s) {
		try {
			 con = dbconnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into  stdtl(firstname,lastname,pass)values(?,?,?)");
			ps.setString(1,s.getFirstname());
			ps.setString(2, s.getLastname());
			ps.setObject(3,s.getPassword());
			int n= ps.executeUpdate();
			if(n>0) {
				status = "success";
			}else {
				status="failure";
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return status ;
	}

	public String selectdata(Loginmodel l) {
		 
		try {
			 con = dbconnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select*from stdtl where firstname=? and pass=?");
			ps.setString(1,l.getFirstname());
			ps.setObject(2,l. getPassword());
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				
				status="success";
			}else {
				status ="failure";
			}
		}
		catch (Exception e) {
			System.out.println(e); 
		}
		return status;
	}
	
	
	
}

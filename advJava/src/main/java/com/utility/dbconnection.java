package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
	 static Connection con;
	public  static Connection getConnection(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306/intro","root","root");
		}catch(Exception e) {
			System.out.println(e);
	}
		return con;
	}
}

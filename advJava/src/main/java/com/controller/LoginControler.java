package com.controller;

import java.io.IOException;

import com.dao.Studentdata;
import com.dtomodel.Loginmodel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginControler extends HttpServlet { 

	public LoginControler() {} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("welcome to login page");
		String firstname=request.getParameter("firstname");
		Object password=request.getParameter("password"); 
		
		Loginmodel l= new Loginmodel();
		l.setFirstname(firstname);
		l.setPassword(password);
		Studentdata sd= new Studentdata();
 String status =sd.selectdata(l);
  System.out.println(status);
  if(status.equals("success")){
		
		RequestDispatcher rd =request.getRequestDispatcher("/home.html");
		rd.include(request,response);
		} else 
		{
			RequestDispatcher rd =request.getRequestDispatcher("/login.html");
			rd.include(request,response);
		}

}
	}


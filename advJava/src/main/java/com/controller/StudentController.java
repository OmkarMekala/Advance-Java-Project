package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

import com.dao.Studentdata;
import com.dtomodel.Sttudent;
import com.utility.dbconnection;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/register1")
public class StudentController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello servlet");
	String firstname=request.getParameter("firstname");
	String lastname =request.getParameter("lastname");
	Object password =request.getParameter("password");
	
		System.out.println("hello"+firstname);
		Sttudent s =new Sttudent ();
		s.setFirstname(firstname);
		s.setLastname(lastname);
		s.setPassword(password);
		System.out.println(s);
		Studentdata d= new Studentdata();
		String status =d. stidentinsert(s);
		System.out.println(status);
if(status.equals("success")){
			
			RequestDispatcher rd =request.getRequestDispatcher("/login.html");
			rd.include(request,response);
			} else 
			{
				RequestDispatcher rd =request.getRequestDispatcher("/index.html");
				rd.include(request,response);
			}

	}

		
}

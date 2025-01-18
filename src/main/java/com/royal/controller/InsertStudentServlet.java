package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;
import com.royal.util.StringUtils;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertStudentServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("request.getPathInfo() : " + request.getPathInfo());
		System.out.println("request.getServletPath() : " + request.getServletPath());
		
		boolean flag = false;
		
		StudentBean sbean = new StudentBean();
		
		String name = request.getParameter("name");
		
		// name validate
		if( StringUtils.isValidString(name)) 
		{
			sbean.setName(name);
			
		}else 
		{
			flag = true;
			request.setAttribute("nameErr", "<font color='red'>Please Enter valid Name</font>");
		}
		
		String std = request.getParameter("std");
		
		// std validate
		if( StringUtils.isValidString(std)) 
		{
			sbean.setStd(Integer.parseInt(std));
			
		}else 
		{
			flag = true;
			request.setAttribute("stdErr", "<font color='red'>Please Enter valid Std</font>");
		}
		
		
		String marks = request.getParameter("marks");
		
		// std validate
		if( StringUtils.isValidString(marks)) 
		{
			sbean.setMarks(Integer.parseInt(marks));
			
		}else 
		{
			flag = true;
			request.setAttribute("marksErr", "<font color='red'>Please Enter valid Marks</font>");
		}
		
		RequestDispatcher rd = null;
		
		if(flag) 
		{
			request.setAttribute("sbean", sbean);
			
			rd = request.getRequestDispatcher("registration.jsp");
			
		}else 
		{
			StudentDao  dao = new StudentDao();
			int rowsAffected = dao.insertStudent(sbean);
			
			if (rowsAffected > 0 )                                             
			{                                                                  
				rd = request.getRequestDispatcher("ListStudentServlet");       
			} else                                                             
			{                                                                  
				rd = request.getRequestDispatcher("registration.jsp");        
			}		                                                           
		}
		
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}

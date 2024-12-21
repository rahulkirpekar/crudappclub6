package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateStudentServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("request.getParameter(\"rno\") : " + request.getParameter("rno"));

		System.out.println("request.getParameter(\"name\") : " +request.getParameter("name"));
		System.out.println("request.getParameter(\"std\") : " + request.getParameter("std"));
		System.out.println("request.getParameter(\"marks\") : "  +request.getParameter("marks"));
		
		int rno = Integer.parseInt(request.getParameter("rno"));
		String name = request.getParameter("name");
		int std = Integer.parseInt(request.getParameter("std"));
		int marks = Integer.parseInt(request.getParameter("marks"));
		
		StudentBean sbean = new StudentBean(rno, name, std, marks);
		
		System.out.println("sbean : " + sbean);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.updateStudent(sbean, rno);
		
		RequestDispatcher rd = null;
		
		if (rowsAffected > 0 ) 
		{
			rd = request.getRequestDispatcher("ListStudentServlet");
		} else 
		{
			rd = request.getRequestDispatcher("registration.html");
		}		
		rd.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}

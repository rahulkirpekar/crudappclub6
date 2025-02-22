package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteCookieByServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cookie c[] = request.getCookies();
		
		for (Cookie cookie : c) 
		{
			System.out.println(cookie.getName()+"--" + cookie.getValue());
			
			if (cookie.getValue().equals("RahulKirpekar")) 
			{
				Cookie cookie1 = new Cookie("userName", "");
				response.addCookie(cookie1);
				System.out.println("RahulKirpekar User Cookie Deleted");
			}
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}

package com.royal.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
/**
 * 
 * Filter:-
-------

 user---request----->webserver---webcontainer(servlet/jsp/resource)

	A filter in a servlet is used to preprocess and post-process requests before they reach the servlet or after the servlet generates a response. It is primarily used for logging, authentication, authorization, input validation, compression, etc.


 * 
 * 
 */
public class TestFilter extends HttpFilter implements Filter {
       
	public void init(FilterConfig fConfig) throws ServletException 
	{
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		// TODO Auto-generated method stub
		// place your code here
		
		// Pre-Filtering--request
		System.out.println("TestFilter : Pre-Fitering--doFilter()");
		// pass the request along the filter chain
		chain.doFilter(request, response);

		// 	Post-Filtering--response
		System.out.println("TestFilter : Post-Fitering--doFilter()");
	}
	public void destroy() 
	{
	}
}

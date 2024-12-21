package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditStudentServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int rno = Integer.parseInt(request.getParameter("rno"));
		
		StudentDao dao = new StudentDao();
		
		Object object =	dao.getStudentByRno(rno);
		
		if (object instanceof StudentBean ) 
		{
			StudentBean sbean = (StudentBean)object;
			
			out.print("<h3>Edit Student Registration Page</h3>                       ");
			out.print("<form action='UpdateStudentServlet' method='post'>       ");
			out.print("	<table>                                                 ");
			out.print("		<input type='hidden' name='rno' value="+sbean.getRno()+" >      ");
			out.print("		<tr>                                                ");
			out.print("			<td>Rno </td>                                  ");
			out.print("			<td><input type='text' name='rno' value="+sbean.getRno()+" disabled> </td>      ");
			out.print("		</tr>                                               ");
			
			out.print("		<tr>                                                ");
			out.print("			<td>Name </td>                                  ");
			out.print("			<td><input type='text' name='name' value="+sbean.getName()+"> </td>       ");
			out.print("		</tr>                                               ");
			out.print("		<tr>                                                ");
			out.print("			<td>Std</td>                                    ");
			out.print("			<td><input type='text' name='std' value="+sbean.getStd()+"> </td>        ");
			out.print("		</tr>                                               ");
			out.print("		<tr>                                                ");
			out.print("			<td>Marks</td>                                  ");
			out.print("			<td><input type='text' name='marks' value="+sbean.getMarks()+"> </td>      ");
			out.print("		</tr>                                               ");
			out.print("		<tr>                                                ");
			out.print("			<td></td>                                       ");
			out.print("			<td><input type='submit' value='Update'> </td>                 ");
			out.print("		</tr>                                               ");
			out.print("	</table>                                                ");
			out.print("</form>													");
		} else 
		{
			RequestDispatcher rd = request.getRequestDispatcher("ListStudentServlet");
			rd.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
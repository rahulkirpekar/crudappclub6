<?xml version="1.0" encoding="UTF-8" ?>

<%@page import="com.royal.bean.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Student List Page</title>
</head>
<body>
	<h3>Student List Page</h3>

	<%
		ArrayList<StudentBean> list = (ArrayList<StudentBean>)request.getAttribute("list");
	%>
  <table border='1'>              
		<tr>                
				<td>Rno</td>    
				<td>Name</td>   
				<td>Std</td>    
				<td>Marks</td>  
<!-- 				<td>Profile Pic</td>   -->
				<td>Action</td>  
		</tr>

 <%
 	for(int i = 0 ; i < list.size() ;i++)
 	{
 		StudentBean s = list.get(i);
 %>
		<tr>                
				<td><%=s.getRno() %></td>    
				<td><%=s.getName() %></td>   
				<td><%=s.getStd() %></td>    
				<td><%=s.getMarks() %></td>  
<!-- 				<td><IMG alt="Profile Pic" src="resource/watch.jpeg" width="20%" height="20%" /> </td>   -->
				<td><a href='EditStudentServlet?rno=<%=s.getRno()%>'>EDIT</a> | <a href='DeleteStudentServlet?rno=<%=s.getRno()%>'>DELETE</a></td>  
		</tr>
<%} %>		
   </table>

</body>
</html>
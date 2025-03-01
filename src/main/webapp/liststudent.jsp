<?xml version="1.0" encoding="UTF-8" ?>

<%@page import="com.royal.bean.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Student List Page</title>
</head>

<body>
    <div style="text-align: right; margin-bottom: 20px;">
        <form action="logoutServlet" method="post" style="display: inline;">
            <button type="submit" style="padding: 10px 15px; background-color: #f44336; color: white; border: none; border-radius: 5px; cursor: pointer;">
                Logout
            </button>
        </form>
    </div>

    <h3>Student List Page</h3>

    <%
    	
        ArrayList<StudentBean> list = (ArrayList<StudentBean>) request.getAttribute("list");
    %>
    <table border='1'>
        <tr>
            <td>Rno</td>
            <td>Name</td>
            <td>Std</td>
            <td>Marks</td>
            <td>Action</td>
        </tr>

        <%
            for (int i = 0; i < list.size(); i++) {
                StudentBean s = list.get(i);
        %>
            <tr>
                <td><%= s.getRno() %></td>
                <td><%= s.getName() %></td>
                <td><%= s.getStd() %></td>
                <td><%= s.getMarks() %></td>
                <td>
                    <a href='EditStudentServlet?rno=<%= s.getRno() %>'>EDIT</a> | 
                    <a href='DeleteStudentServlet?rno=<%= s.getRno() %>'>DELETE</a>
                </td>
            </tr>
        <%
            }
        %>
    </table>
</body>
</html>

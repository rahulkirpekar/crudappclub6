<?xml version="1.0" encoding="UTF-8" ?>

<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="Rahul Kirpekar"/>
	
 	<p>Welcome, <c:out value="${name}" />!</p>
 	
 	
 	<c:set var="email" value="rahul@example.com" />
 	
 	
 	Email: <c:out value="${email}" />
 
 
	  <c:set var="age" value="10" />
	 <c:if test="${age >= 18}">
	    <p>You are eligible to vote.</p>
	 </c:if>
	 
 <%
    List<String> courses = Arrays.asList("Java", "Spring", "Hibernate");
    request.setAttribute("courseList", courses);
 %>


	 <c:forEach var="course" items="${courseList}">
	    <p>Course: ${course}</p>
	 </c:forEach> 
 
</body>
</html>

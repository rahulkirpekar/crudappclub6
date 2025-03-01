<?xml version="1.0" encoding="UTF-8" ?>

<%@ page errorPage="error.jsp" %>


<%@taglib uri="" prefix="c" %>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp" %>

	
		<%
		
			int ans = 10/2; 
			
			out.print("ans : " + ans);
			
			%>

	<%@include file="footer.jsp" %>

</body>
</html>

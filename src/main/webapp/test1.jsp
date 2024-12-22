<?xml version="1.0" encoding="UTF-8" ?>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
<body>

	<%!
		int getCube(int no)
		{
			return (no*no*no);
		}
	 %>

	<%
		for(int i = 1 ; i <= 10 ; i++)
		{
			out.print(5 +" * " + i +" = " + (5*i)+"<br>");
		}
	%>

	Addition : <%=getCube(2)%>


</body>
</html>

<?xml version="1.0" encoding="UTF-8" ?>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Test of JSTL</title>
</head>
	<body>
		<c:forEach var="j" begin="1" end="3">
    		Item <c:out value="${j}" /> <br/>
		</c:forEach>
		
	</body>
</html>

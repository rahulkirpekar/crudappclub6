<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>
	<h3>Student Registration Page</h3>
	<form action="InsertStudentServlet" method="post">
		<table>
			<tr>
				<td>Name </td>
				<td><input type="text" name="name" value='${sbean.name}'> </td>
				<td>${nameErr}</td>
				
			</tr>
			<tr>
				<td>Std</td>
				<td><input type="text" name="std" value='${sbean.std}'> </td>
				<td>${stdErr}</td>
				
			</tr>
			<tr>
				<td>Marks</td>
				<td><input type="text" name="marks" value='${sbean.marks}'> </td>
				<td>${marksErr}</td>
				
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"> </td>
				<td> </td>
			</tr>
		</table>
	</form>

</body>
</html>
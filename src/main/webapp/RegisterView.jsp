<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="RegisterController">
		<table>
			<tr>
				<td>Reg Number</td>
				<td><input type="text" name="regno"></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="custname"></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td>Account Balance</td>
				<td><input type="text" name="accbalance"></td>
			</tr>
			<tr>
				<td><input type="submit" value="RegisterHere"></td>
			</tr>
			
		</table>
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/login" id="form1" name="form1" method="post">
		<div>
			<span>User Name:</span><input type="text" id="txtUsername"
				name="txtUsername" />
		</div>
		<div>
			<span>User Password:</span><input type="password" name="txtPassword"
				id="txtPassword" />
		</div>
		<div>
			<span style="color:red;">
				<%
					out.print(request.getAttribute("errMessage")==null ? "" : request.getAttribute("errMessage"));
				%>
			</span>
		</div>
		<input type="submit" id="btnSubmit" value="Submit" />
	</form>
</body>
</html>
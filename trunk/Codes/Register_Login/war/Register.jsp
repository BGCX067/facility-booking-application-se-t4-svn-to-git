<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="/template/header.jsp"%>
</head>
<body>
	<div class="page">
		<div class="header">
			<div class="title">
				<h1>Facility Booking System</h1>
			</div>
			<div class="loginDisplay"></div>

			<div class="clear hideSkiplink"></div>
		</div>
		<div class="main">
			<div class="box" style="text-align:center;">
				<form action="/register" id="form1" name="form1" method="post">
					<div class="input">
						<span>User Name:</span>
						<input type="text" id="txtUsername"
							name="txtUsername" />
					</div>
					<div class="input">
						<span>User Password:</span>
						<input type="password"
							name="txtPassword" id="txtPassword" />
					</div>
					<div>
						<%
							out.print(request.getAttribute("errMessage") == null ? "" : request
									.getAttribute("errMessage"));
						%>
					</div>
					<input type="submit" id="btnSubmit" value="Submit" />
				</form>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<div class="footer"></div>
</body>
</html>
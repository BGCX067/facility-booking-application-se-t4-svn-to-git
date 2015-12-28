<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.se_app.model.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ include file="/template/header.jsp"%>
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
			<div Style="margin-top: 30px;">
				<div style="float: left; width: 200px; margin:40px 0px;">
					<div style="display: <% out.print(request.getSession().getAttribute("loginedUser")==null ? "block" : "none"); %>">
						<form method="post" action="/login">
							<span>Username</span> <input type="text" ID="txtUsername"
								name="txtUsername" /> <br /> <span>Password</span> <input
								type="password" ID="txtPassword" name="txtPassword" />
							<div>
								<span style="color: red;">
									<% 	out.print(request.getAttribute("errMessage") == null ? "" : request.getAttribute("errMessage"));%>
								</span>
							</div>
							<br />
							<div>
								<a href="/register">Register a new member</a>
							</div>
							<br /> <input type="submit" id="btnLogin" name="btnLogin"
								value="Login" />
						</form>
					</div>
					<div Style="text-align: center; display: <% out.print(request.getSession().getAttribute("loginedUser")==null ? "none" : "block"); %>">
						<div>
							<img ID="imgUser" src="/images/user_male.png" />
						</div>

						<span>
						<%
							User user = (User)request.getSession().getAttribute("loginedUser");
							if (user!=null)
								out.print(user.getUserName());
						%></span>
						<hr />
						<div class="LeftMenu">
							<ul style="list-style: none;">
								<li> <a
									href="./NewShipment.aspx"><span>New Booking</span></a></li>
								<li>
									<a href="./TrackPackage.aspx"><span>View My Booking</span></a></li>
								<li>
									<a href="./PackageHistory.aspx"><span>View Notification</span></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div style="padding-left: 240px;">
					<h2>Welcome to Facility booking system 2012</h2>

					<br />
					<hr />
					<div>
						
						<p>Facility Boooking system 2012 from SMU.</p>
					</div>
				</div>

			</div>
		</div>
		<div class="clear"></div>
	</div>
	<div class="footer"></div>

</body>
</html>
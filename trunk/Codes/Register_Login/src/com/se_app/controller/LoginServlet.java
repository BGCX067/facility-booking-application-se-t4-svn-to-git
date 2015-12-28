package com.se_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.api.datastore.Entity;
import com.se_app.common.Util;
import com.se_app.dao.UserDAO;
import com.se_app.model.User;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		String errMessage = "";

		String username = req.getParameter("txtUsername");
		String password = req.getParameter("txtPassword");
		if ("".equals(username)) {
			errMessage = "Invalid Username";
			req.setAttribute("errMessage", errMessage);
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}

		UserDAO dao = new UserDAO();
		Entity entity = dao.getUser(username);
		User user = null;
		if (entity == null) {
			errMessage = "Invalid Username";
			req.setAttribute("errMessage", errMessage);
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
			return;
		}

		user = new User(entity);

		if (!user.getPassword().equals(password)) {
			errMessage = "Invalid password";
			req.setAttribute("errMessage", errMessage);
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
			return;
		}
		
		HttpSession session = req.getSession(true);
		session.setAttribute("loginedUser", user);
		
		resp.sendRedirect("/index.jsp");
		//resp.getWriter().println("Welcome, " + user.getUserName());

//		Iterable<Entity> lst = dao.getAllUsers();
//		resp.getWriter().println(Util.writeJSON(lst));

	}

	
}

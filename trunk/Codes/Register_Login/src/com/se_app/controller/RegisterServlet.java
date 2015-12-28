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
public class RegisterServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {		
		req.getRequestDispatcher("/register.jsp").forward(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.getWriter().println("here do post");
		String username = req.getParameter("txtUsername");
		String password = req.getParameter("txtPassword");
		resp.getWriter().println(username);

		UserDAO dao = new UserDAO();

		User u = new User(new Entity("User", username));

		u.setUserName(username);
		u.setPassword(password);
		u.setDescription("default");

		dao.insertUser(u.getEntity());

		resp.getWriter().println("Finish");
		
		HttpSession session = req.getSession(true);
		session.setAttribute("loginedUser", u);
		
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
		
//		Iterable<Entity> lst = dao.getAllUsers();
//		resp.getWriter().println(Util.writeJSON(lst));

	}

	private void getRequestData() {

	}
}

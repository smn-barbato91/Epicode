package it.epicode.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = request.getParameter("userName");
		String pass = request.getParameter("password");
		StringBuilder f = new StringBuilder(user);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		if (pass.equals(f.reverse().toString())) {

			out.println("<p> Benvenuto " + user + "</p>");
		} else {
			out.println("<p> Username o password non validi </p>");

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

package it.epicode.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConversionServlet")
public class ConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tipoSorgente = request.getParameter("daGradi");
		String tipoDestinazione = request.getParameter("aGradi");
		String temperatura = request.getParameter("valore");
		double tempDouble = Double.parseDouble(temperatura);
		double result = 0;
		if (tipoSorgente.equalsIgnoreCase("celsius")) {
			if (tipoDestinazione.equalsIgnoreCase("kelvin")) {
				result = tempDouble + 273;
			}
		}
//		System.out.println("La temperatura di " + tempDouble + " gradi " + tipoSorgente + " corrisponde a " + result
//				+ " gradi" + tipoDestinazione);
		PrintWriter pv = response.getWriter();
		response.setContentType("text/html");
		pv.println("<p> La temperatura di " + tempDouble + " gradi " + tipoSorgente + " corrisponde a " + result
				+ " gradi " + tipoDestinazione + "</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
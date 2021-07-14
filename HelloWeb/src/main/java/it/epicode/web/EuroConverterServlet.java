package it.epicode.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EuroConverterServlet")
public class EuroConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String sommaSorgente = request.getParameter("daEuro");
		String tipoDestinazione = request.getParameter("aValuta");
		double valSorgente = 0;

		try {
			 valSorgente = Double.parseDouble(sommaSorgente);
		} catch(NumberFormatException ne) {
			pw.println("<h1>Devi inserire un numero nel campo di testo</h1>");
			return;
		}
		
		double result = 0;
		
		
		if(tipoDestinazione.equals("dollaro")) {
			result = valSorgente * 1.18;
		} else if(tipoDestinazione.equals("bitcoin")) {
			result = valSorgente * 0.000021;
		} else if(tipoDestinazione.equals("yenGiapponese")) {
			result = valSorgente * 130.00;
		}
		
		
		
		pw.println("<p>Il valore della conversione e' "+ result + " </p>");
		
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

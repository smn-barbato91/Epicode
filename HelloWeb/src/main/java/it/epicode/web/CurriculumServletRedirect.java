package it.epicode.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CurriculumServletRedirect")
public class CurriculumServletRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String redirect = request.getParameter("redirect");
		
		
		
		
		if(redirect != null && redirect.equals("1")){
					
//		if ("1".equals(redirect)) {
			response.sendRedirect("forms/esercizioCv.html");
		} else {
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			pw.println("<html>");
			pw.println("<head>");
			pw.println(" <title>Curriculum vitae</title>");
			pw.println(" <meta name = \"Description\" content = \"Questo e' il mio curriculum\" />");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<h1>Curriculum vitae - Mario Rossi Web developer & programmatore</h1>");
			pw.println("<h2>Curriculum vitae:</h2>");
			pw.println("<ul>");
			pw.println("<li><b>Nome:</b> Mario</li>");
			pw.println("<li>  <b> Cognome:</b> Rossi </li>");
			pw.println("<li>  <b>Data di nascita</b>: 22-10-1983 </li>");
			pw.println("</ul> ");
			pw.println("<b> Su di me:</b>");
			pw.println(
					"<blockquote>\"Sembra sempre impossibile, finche' non viene fatto\".(Nelson Mandela) </blockquote>");
			pw.println("<h3>Presentazione</h3>");
			pw.println("<I>");
			pw.println("Lavoro come consulente e formatore in qualità di libero\r\n"
					+ "		professionista secondo il motto \"Fai della tua passione un lavoro e\r\n"
					+ "		non lavorerai nemmeno per 1 giorno\". Collabora con strutture pubbliche\r\n"
					+ "		e private trattando il tema del riconoscimento, valutazione e\r\n"
					+ "		certificazione delle competenze professionali, sia come docente in\r\n"
					+ "		percorsi per esperti di certificazione, sia come consulente per\r\n"
					+ "		agenzie formative accreditate, Regioni, Province. ");
			pw.println("</I> ");
			pw.println("<h3>Formazione</h3> ");
			pw.println("<p>	Diploma: scientifico</p> ");
			pw.println("<p>Conseguito nel 2001 con votazione 100/100 presso l'istituto Righi</p> ");
			pw.println("<h3>Master Web Deploy</h3> ");
			pw.println("</body></html>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

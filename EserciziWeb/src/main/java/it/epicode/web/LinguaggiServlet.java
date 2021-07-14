package it.epicode.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LinguaggiServlet")
public class LinguaggiServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<title>Linguaggi</title>");
		    out.println("</head>");
		    out.println("<body>");
		    out.println("<h3>L'elenco dei linguaggi di programmazione che conosci è:</h3>");
		    String[] elencoLinguaggi = request.getParameterValues("elencoLinguaggi");
		    for(int i=0; i<elencoLinguaggi.length; i++) {
		    	if(elencoLinguaggi[i].equals("HTML")) 
		    		out.print("[HTML non è un linguaggio di programmazione ma di markup!]");
		    	else
		    		out.print(elencoLinguaggi[i]);
		    	out.println("<br />");
		    }
		    out.println("</body>");
		    out.println("</html>");
	}
}
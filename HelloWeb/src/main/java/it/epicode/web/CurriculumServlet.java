package it.epicode.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CurriculumServlet")
public class CurriculumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
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
			pw.println(
					"<p>Conseguito nel 2006 presso l'academy W3point. Riconosciuto in via ufficiale per crediti formativi.</p> ");
			pw.println("<h3>Competenze</h3> ");
			pw.println("<h4>Conoscenze tecniche:</h4>");
			pw.println("<p>Le conoscenze nel mio bagaglio tecnico sono le seguenti:</p> ");
			pw.println("<ol> ");
			pw.println("<li>HTML</li> ");
			pw.println("<li>CSS</li> ");
			pw.println("<li>Javascript/Typescript</li>");
			pw.println("<li>Angular.js</li>");
			pw.println("</ol> ");
			pw.println("<h4>Conoscenze operative:</h4> ");
			pw.println("<ul> ");
			pw.println("<li>Sviluppo web: <I>dal PSD all'HTML, sviluppo di template per CMS</I></li> ");
			pw.println(
					"<li>Ottimizzazione CSS:<I> pulizia di codice inusato, minify e verifica compatibilità</I></li>");
			pw.println("<h3>Contatti personali</h3>");
			pw.println("<ul>");
			pw.println("<li>Email: contatti@epicode.it</li>");
			pw.println("<li>Telefono: 338-10203040</li>");
			pw.println("<li>PEC: mariorossi@pec.it</li>");
			pw.println("</ul><br><br> ");
			pw.println("<footer>");
			pw.println("<p>Autorizzo il trattamento dati secondo il decreto vigente</p>");
			pw.println("<p>Copyright ©2021 - Tutti i diritti riservati</p>");
			pw.println("</footer> ");
			pw.println("</body></html>");

		}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Linguaggi</title>
</head>
<body>
<h3>L'elenco dei linguaggi di programmazione che conosci è:</h3>
<%
String[] elencoLinguaggi = request.getParameterValues("elencoLinguaggi");
for(int i=0; i<elencoLinguaggi.length; i++) {
	if(elencoLinguaggi[i].equals("HTML")) 
		out.print("[HTML non è un linguaggio di programmazione ma di markup!]");
	else
		out.print(elencoLinguaggi[i]);
	out.println("<br />");
}
%>
</body>
</html>
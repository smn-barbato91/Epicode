<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dati Persona</title>
</head>
<body>
<%
String nome = request.getParameter("nome");
String cognome = request.getParameter("cognome");
String anno = request.getParameter("anno");
String mese = request.getParameter("mese");
%>
<p>Il nome � <%=nome %> </p><hr>
<p>Il cognome �  <%=cognome %> </p><hr>
<p>L'anno di nascita � <%=anno %> </p><hr>
<p>Il mese di nascita � <%=mese %> </p><hr>
</body>
</html>
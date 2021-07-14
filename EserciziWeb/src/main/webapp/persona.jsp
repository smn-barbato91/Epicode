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
<p>Il nome è <%=nome %> </p><hr>
<p>Il cognome è  <%=cognome %> </p><hr>
<p>L'anno di nascita è <%=anno %> </p><hr>
<p>Il mese di nascita è <%=mese %> </p><hr>
</body>
</html>
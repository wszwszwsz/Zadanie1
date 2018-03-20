<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="service.Instalment"%>
<%
List<Instalment> raport =  (ArrayList<Instalment>) request.getAttribute("raport");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Rozliczenie rat kredytu </h1>
<table>
	<tr>
		<th>numer raty</th>
		<th>Kwota Kapitału </th>
		<th>Kwota odsetek</th>
		<th>Opłaty stałe</th>
		<th>Całkowita kwota raty </th> 
	</tr>
<%
    for (int i=0; raport.size()>i; i++ ) {
        %>
        <TR>
	        <TD><%= raport.get(i).getId() %></TD>
	        <TD><%= raport.get(i).getKwotaKapitalu() %></TD>
	    	<TD><%= raport.get(i).getKwotaOdsetek() %></TD>
	    	<TD><%= raport.get(i).getOplataStala() %></TD>
	    	<TD><%= raport.get(i).getCalkowitaKwotaRaty() %></TD>
    	</TR>
  	   <%
    }
    %>	

</table>
</body>
</html>


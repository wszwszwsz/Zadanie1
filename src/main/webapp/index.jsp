<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BANK</title>
</head>
<body>
		<h1> Witamy w banku, prosze wypelnic formularz kredytowy </h1>
	
	<form action="kredyt" method="POST">
		<label>Kwota kredytu:<input type="number" id="kwotaKredytu" name="kwotaKredytu" /></label>
		<label>Ilosc rat:<input type="number" id="iloscRat" name="iloscRat" /></label>
		
		<label>Oprocentowanie: <input type="number" name="oproc" id="oproc" size="3" class="input" value="5" /></label>
	  
		<label>Oplata stala:<input type="number" id="oplataStala" name="oplataStala" /></label>
		<label>Rodzaj rat:
			     <select  name="rodzaj">
           		    <option value="Stala">Stala</option>
           	     	<option value="Malejaca">Malejaca</option>
			     </select>
		</label>
		<input type="submit" value="wyslij"/>	
	</form>
</body>
</html>
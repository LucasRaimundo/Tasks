<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lunar Acessorios</title>
</head>
<body>

<h1> Faça seu login abaixo:</h1>

<form action="/" method="POST">
<span style = "color:red"> ${msg}  </span>
 Login: <input type="text" name="login">
 Senha:  <input type="password" name="senha">
 <input type="submit" value="logar">	
 </form>
</body>
</html>
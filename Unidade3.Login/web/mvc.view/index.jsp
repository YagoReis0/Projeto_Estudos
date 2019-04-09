<%-- 
    Document   : index
    Created on : 28/01/2019, 19:43:11
    Author     : Senac
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/Unidade3.Login/mvc.css/loginSTYLE.css"
        <title>Login Banco de Dados</title>
    </head>
    <body>
        <center>
            <h2>Bem Vindo ao Sistema de Vendas e-Commerce</h2>
            <br>
            <% SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm"); %>
            <h1><%= formatter.format(new Date()) %></h1>
            <img src="/Unidade3.Login/mvc.imagens/jsp-1.jpg" width="40%" height="40%">
            <br>
            
            <img src="/Unidade3.Login/mvc.imagens/signbot.gif" style="width: 20%; height: auto">
            <form action="/Unidade3.Login/mvc.view/login.jsp" method="post"><b>
                    <input type="submit" value="LOGIN"
                </b>
            </form>
        </center>
    </body>
</html>

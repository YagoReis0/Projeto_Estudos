<%-- 
    Document   : resultado
    Created on : 12/02/2019, 21:39:05
    Author     : Senac
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="DAO.Conexao"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.CarrosBEANS"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Veículos</title>
        <%
            String categoria = (String) request.getAttribute("categoria");
            String fabricante = (String) request.getAttribute("fabricante");
            Conexao conect = new Conexao();
            ResultSet rs = conect.veiculosListar(categoria, fabricante);
       %>
    </head>
    <body>        
        <fieldset style="background-color: white; margin-left: 10%; margin-right: 10%; border: 1px">
            <h2>Veículos disponíveis para locação:</h2>
            <br>
            <table border="2" cellpadding="5">
                <thead>
                    <tr><td colspan="10" style="text-align: center; align-content: center; font-size: 14pt">Fabricante: <b><div style="color: red; font-size: 16pt"><%= fabricante %></div></b></td></tr>
                    <tr style="background-color: gray; text-align: center"><td>VEICULO</td><td>MOTOR</td><td>ArCONDICIONADO</td><td>CAMBIO</td><td>GPS</td><td>COMBUSTIVEL</td><td>BANCOS</td><td colspan="3">OPCIONAIS</td></tr>
                </thead>
                <tbody>
                    <%
                       while(rs.next()){
                    %>
                    <tr>
                        <td> <%=rs.getString("Veiculo") %> </td>
                        <td> <%=rs.getString("Motor") %> </td>
                        <td> <%=rs.getString("ArCond") %> </td>
                        <td> <%=rs.getString("Cambio") %> </td>
                        <td> <%=rs.getString("GPS") %> </td>
                        <td> <%=rs.getString("Combustivel") %> </td>
                        <td> <%=rs.getString("Bancos") %> </td>
                        <td> <%=rs.getString("Opcionais1") %> </td>
                        <td> <%=rs.getString("Opcionais2") %> </td>
                        <td> <%=rs.getString("Opcionais3") %> </td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
            <br><br>
            <a href="selecao.jsp">Nova Pesquisa</a>
        </fieldset>       
    </body>
</html>

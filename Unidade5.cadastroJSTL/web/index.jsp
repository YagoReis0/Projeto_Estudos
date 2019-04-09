<%-- 
    Document   : index
    Created on : 20/03/2019, 20:32:17
    Author     : Senac
--%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <sql:setDataSource 
            var="ds" 
            driver="com.mysql.cj.jdbc.Driver" 
            url="jdbc:mysql://localhost:3306/webcadastro?autoReconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC"
            user="root"
            password="root"
            scope="session"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Exemplo JSTL - Cadastro Cliente</h1>
    </center>
    
    <sql:query var="estado" dataSource="${ds}">
        SELECT * FROM estados
    </sql:query>
    <form style="margin-left: 15%; margin-right: 15%" action="gravaCliente.jsp" method="POST">
        <hr>
        Nome <br>   <input type="text" maxlength="35" name="nome" size="40" autofocus><br><br>
        CPF <br>    <input type="text" minlength="14" maxlength="14" size="20" name="cpf"><br><br>
        RG <br>     <input type="text" maxlength="15" size="20"  name="rg"><br><br>
        
        Estado <br> <select name="estado">
            <c:forEach var="listagem" items="${estado.rows}">
                <option value="${listagem.SIGLA}"><c:out value="${listagem.NOME}"/></option>               
            </c:forEach>
               </select><br><br>
               
        Telefone <br> <input type="text" name="tel" minlength="8" size="20" maxlength="14"><br><br>
        E-Mail <br> <input type="text" name="email" size="40" maxlength="25"><br><br>
        <hr>
        <input type="submit" value="OK"> <input type="reset" value="Cancelar">
    </form>
    </body>
</html>

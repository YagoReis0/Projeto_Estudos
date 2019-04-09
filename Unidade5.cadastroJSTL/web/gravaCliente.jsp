<%-- 
    Document   : gravaCliente
    Created on : 20/03/2019, 20:33:02
    Author     : Senac
--%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        
        <c:catch var="ex">
        <sql:update var="ResultProdutos" dataSource="${ds}"> 
            INSERT INTO clientes( nome, cpf, rg, telefone, email,estado) 
            values('${param.nome}','${param.cpf}','${param.rg}','${param.tel}'
                    ,'${param.email}','${param.estado}')
        </sql:update>
                <h1>Gravação executada com sucesso!</h1>
        </c:catch>
                <hr>
                <a href="index.jsp"><input type="button" value="Voltar"></a>
    </body>
</html>

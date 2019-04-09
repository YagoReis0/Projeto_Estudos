<%-- 
    Document   : login
    Created on : 28/01/2019, 20:18:15
    Author     : Senac
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script>
            function runScript(e) {
                if(e.keyCode === 13){
                    validate();
                }
            }
        </script>
        <title>JSP Page - Login</title>
    </head>
    <body>
        <font face="arial">
        <div id="alert">
            <c:if test="${msg != null}">
                <p style="color: red">${msg}</p>
            </c:if>
        </div>
        <center>
            <br>
            <img src="/Unidade3.Login/mvc.imagens/login.jpg">
            <br><br>
            <form action="/Unidade3.Login/ServletLOGIN" method="post">
                <table border="1">
                    <tr>
                        <td align="center"><b>Login:</b></td>
                        <td align="left"><input type="text" name="login" maxlength="10" placeholder="User" 
                            required autofocus></td>
                    </tr>
                    <tr>
                        <td align="center"><b>Senha:</b></td>
                        <td align="left"><input type="password" name="senha" maxlength="10" placeholder="Password" 
                            required autofocus onkeypress="return runScript(event)"></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" value="Verificar Usuário">
                            <input type="reset" value="Limpar Dados">
                        </td>
                    </tr>
                </table>
            </form>
        </center>
    </body>
</html>

<%-- 
    Document   : check
    Created on : 28/01/2019, 21:01:06
    Author     : Senac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <script type="text/javascript">
            var ss = -1;
            function atualizaContador(futuro){
                ss = (ss===-1) ? futuro : ss;
                var faltam = "Você será redirecionado em " + ss + " segundo.";
                if (ss > 0) {
                    document.getElementById("contador").innerHTML = faltam;
                    ss--;
                    setTimeout(atualizaContador,1000);
                }
            }
    </script>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="10, url=principal.jsp"
        <title>JSP Page - Login via BD</title>
    </head>
    <body onload="atualizaContador(10)">
        <center>
            <% request.getParameter("usuarioLogado"); %>
            <h3><b>"Login feito com sucesso"</b></h3>
            
            <br><br>
            <img src="/Unidade3.Login/mvc.imagens/tenor.gif" style="width: 25%; height: auto">
            <br>
            
            <div id="contador"></div>
            
        </center>
    </body>
</html>

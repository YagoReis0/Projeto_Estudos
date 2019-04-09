<%-- 
    Document   : selecao
    Created on : 12/02/2019, 21:08:59
    Author     : Senac
--%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript">
            var nacional = new Array("Volkswagem", "Fiat", "Chevrolet", "Ford");
            var importado = new Array("Kia", "Jac", "Audi", "Mercedes", "Jaguar");
            var nenhum = new Array("Nenhum");
            
            function loadList(v){
                var listaEscolhida = eval(v);
                document.selecao.fabricante.options.length = listaEscolhida.length;
                for(i=0; i<listaEscolhida.length; i++){
                    document.selecao.fabricante.options[i] = new Option(listaEscolhida[i], listaEscolhida[i]);
                }
            }
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Veículos</title>
    </head>
    <body>
        <fieldset style="background-color: white; margin-left: 10%; margin-right: 10%; border: 1px">
        
        <h3 style="text-align: center">Seleção de Veículo</h3>
        <br>
        <form name="selecao" action="ServletCarros" method="post">
            
            <b>Categoria: </b>
            <select name="categoria" onchange="loadList(this.value)" size="1">
                <option value="nenhum" selected>Nenhum</option>
                <option value="nacional">Nacional</option>
                <option value="importado">Importado</option>
            </select>
            <br>
            
            <span id="estado"><br>
                <b>Fabricante: </b>
                <select name="fabricante" size="1">
                    <option value="nenhum" selected>Nenhum</option>
                </select>
            </span>
            
            <br><br><br>
            <input type="submit" value="Pesquisar">
        </form>
        </fieldset>
    </body>
</html>

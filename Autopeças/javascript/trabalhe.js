function enviado(){
    var nomes, mails, cpfs, civil, ceps, enderecos, num, cels, ress
    nome=document.getElementById("nome").value;
    mails=document.getElementById("mail").value;
    cpfs=document.getElementById("cpf").value;
    civil=document.getElementById("selecao").value;
    ceps=document.getElementById("cep").value;
    enderecos=document.getElementById("endereco").value;
    num=document.getElementById("numero").value;
    cels=document.getElementById("cel").value;
    ress=document.getElementById("res").value;
    if (nome!="" && mails!="" && cpfs!="" && civil!="n/a" && ceps!="" && enderecos!="" && num!=""){
        if (cels!="") {
            document.getElementById("msgfim").innerHTML="<div class='alert alert-success alert-dismissible'><button type='button' class='close' data-dismiss='alert'>&times;</button>O seu Formúlario foi enviado para o analise. Enviaremos um e-mail de resposta o mais breve possivel.</div>";  
            document.getElementById("nome").value="";
            document.getElementById("mail").value="";
            document.getElementById("cpf").value="";
            document.getElementById("selecao").value="n/a";
            document.getElementById("cep").value="";
            document.getElementById("endereco").value="";
            document.getElementById("numero").value="";
            document.getElementById("cel").value="";
            document.getElementById("res").value="";
        } else if (ress!=""){
            document.getElementById("msgfim").innerHTML="<div class='alert alert-success alert-dismissible'><button type='button' class='close' data-dismiss='alert'>&times;</button>O seu Formúlario foi enviado para o analise. Enviaremos um e-mail de resposta o mais breve possivel.</div>";   
            document.getElementById("nome").value="";
            document.getElementById("mail").value="";
            document.getElementById("cpf").value="";
            document.getElementById("selecao").value="";
            document.getElementById("cep").value="";
            document.getElementById("endereco").value="";
            document.getElementById("numero").value="";
            document.getElementById("cel").value="";
            document.getElementById("res").value="";
        }
    } else {
        document.getElementById("msgfim").innerHTML="<div class='alert alert-danger alert-dismissible'><button type='button' class='close' data-dismiss='alert'>&times;</button>Por favor, preencha as abas obrigatórias!</div>";    
    }
}
    
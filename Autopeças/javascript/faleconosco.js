function enviado(){
    var nomes, mails, selecoes;
    nomes=document.getElementById("nome").value;
    mails=document.getElementById("mail").value;
    selecoes=document.getElementById("selecao").value;
    if (nomes==""){
        document.getElementById("1").innerHTML="<div class='alert alert-danger alert-dismissible'><button type='button' class='close' data-dismiss='alert'>&times;</button>Digite seu nome! Obrigatorio</div>";   
    }else if (mails==""){
        document.getElementById("2").innerHTML="<div class='alert alert-danger alert-dismissible'><button type='button' class='close' data-dismiss='alert'>&times;</button>Digite o seu E-mail! Obrigatorio</div>"; 
    }else if (selecoes=="n/a"){
        document.getElementById("3").innerHTML="<div class='alert alert-danger alert-dismissible'><button type='button' class='close' data-dismiss='alert'>&times;</button>Selecione o estado que está! Obrigatorio</div>"; 
    }else{
        document.getElementById("msgfim").innerHTML="<div class='alert alert-success alert-dismissible'><button type='button' class='close' data-dismiss='alert'>&times;</button>Analisaremos o seu comentário com atenção. Obrigado</div>";
        document.getElementById("nome").value="";
        document.getElementById("mail").value="";
        document.getElementById("selecao").value="";
        document.getElementById("comentario").value="";
    }

}
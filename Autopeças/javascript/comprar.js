function pague(){
    var qnts, totais;
    totais=parseFloat;
    qnts=document.getElementById("qnt").value;
    totais=qnts*450;
    document.getElementById("total").value=totais.toFixed(2);
}
function comprar(){
    var totaiss, cpfs, endereco;
    totaiss=document.getElementById("total").value;
    cpfs=document.getElementById("cpf").value;
    endereco=document.getElementById("cep").value;
   
     if (totaiss > 0 && cpfs!="" && endereco!=""){
        document.getElementById("msgfim").innerHTML="<div class='alert alert-success alert-dismissible'><button type='button' class='close' data-dismiss='alert'>&times;</button>Compra Realizada com sucesso!</div>";
    } else{
        document.getElementById("msgfim").innerHTML="<div class='alert alert-danger alert-dismissible'><button type='button' class='close' data-dismiss='alert'>&times;</button>Dados invalidos!</div>"; 
    }
}
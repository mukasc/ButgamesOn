
    function verificaNome(valor){
        if((!isNaN(valor)) || (valor=="")){
            document.getElementById('Enviar').disabled = true; // desabil
            document.getElementById('erronome').innerHTML = "Insira um nome.";
        }else{
            document.getElementById('Enviar').disabled = false; // habili
            document.getElementById('erronome').innerHTML = "";
        }
    }

    function verificaLogin(valor){
        if((!isNaN(valor)) || (valor=="")){
            document.getElementById('Enviar').disabled = true; // desabil
            document.getElementById('errologin').innerHTML = "Insira um login.";
        }else{
            document.getElementById('Enviar').disabled = false; // habili
            document.getElementById('errologin').innerHTML = "";
        }
    }
    function verificaSenha(valor){
        if((!isNaN(valor)) || (valor=="")){
            document.getElementById('Enviar').disabled = true; // desabil
            document.getElementById('errosenha').innerHTML = "Insira uma senha.";
        }else{
            document.getElementById('Enviar').disabled = false; // habili
            document.getElementById('errosenha').innerHTML = "";

        }
    }
    function verificaCSenha(valor){
        if((!isNaN(valor)) || (valor=="")){
            document.getElementById('Enviar').disabled = true; // desabil
            document.getElementById('erroCsenha').innerHTML = "Insira a mesma senha.";
        }else{
            document.getElementById('Enviar').disabled = false; // habili
            document.getElementById('erroCsenha').innerHTML = "";

        }
    }
    function verificaEmail(valor){
        if((!isNaN(valor)) || (valor=="")){
            document.getElementById('Enviar').disabled = true; // desabil
            document.getElementById('erroemail').innerHTML = "Insira um Email.";
        }else{
            document.getElementById('Enviar').disabled = false; // habili
            document.getElementById('erroemail').innerHTML = "";

        }
    }
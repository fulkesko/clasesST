function obtener() {
    let nom = document.getElementById("Usuario").value;
    let pass = document.getElementById("pass").value;
    console.log(nom + "----" + pass);
    $.post("validar.php", {name: nom, password: pass}, 
        function(data){ 
            console.log(data);
            if (data == "true") {
                window.location = "bienvenido.php";
            }
            if (data == "false") {
                $("#error").html("ERROR EN SUS CREDENCIALES BB");
            }
            
    });
}
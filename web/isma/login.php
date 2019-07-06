<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <title>Document</title>
</head>
<body>
       
        <h2>usuario:</h2>
        <input type="text"  id="usu"><br>
        <h2>contraseña</h2>
        <input type="password" id="pass"><br> <br>
        <button onclick="ver()">ingresar</button>
    </body>

    <script>
    function ver(){
        var nom = document.getElementById("usu").value;
        console.log(nom);
    /*
        let valor_c = nom.value;
        var pass = document.getElementById("pass");
        let valor_b = pass.value;
/*
        $.ajax({
            method: "POST", 
            url: "validar.php",
            data: {nom: valor_c, pass: valor_b },
            success: function(data) {
                if (data == "1") {
                    window.location = "inicioUsuario.php";
                } if (data == "2") {
                    window.location = "inicioDocente.php";
                } if (data == "3") {
                    window.location = "inicioAdmin.php";
                }else{
                    alert("No se puede");
                }
                alert(data);
            }
        });
        */
    }
    </script>
</body>
</html>
<?php
require_once 'conexion.php';
require_once 'data.php';


if(isset($_POST["user"]) && isset($_POST["pass"])) {
    $user = $_POST["user"];
    $pass = $_POST["pass"];
    $con = new Conexion();
    $data = new Data($con->getConexion());
    $existe = $data->isUsuarioValido($user,$pass);
    if($existe) {

        header("Location: sistema.php?sesion=correcta&user=$user");
    } else {
        header("Location: index.php?error=noExiste");
    }
}




?>
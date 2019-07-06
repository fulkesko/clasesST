<?php

require_once 'conexion.php';
require_once 'data.php';

if(isset($_GET["id"])){
    $id = $_GET["id"];
    $user = $_GET["user"];
    $con = new Conexion();
    $data = new Data($con->getConexion());
    $data->eliminarById($id);
    header("Location: sistema.php?sesion=correcto&user=$user");

}
?>
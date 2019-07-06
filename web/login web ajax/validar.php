<?php
require_once 'conexion.php';
require_once 'data.php';

$nom = isset($_POST["name"]) ? $_POST["name"] : "";
$pass = isset($_POST["password"]) ? $_POST["password"] : "";
 
if($nom != "" && $pass != ""){
   
    $con = new Conexion();
    $data = new Data($con->getConexion());
    $existe = $data->isUsuarioValido($nom,$pass);
    if($existe == true){
        echo "true";
    }
    if($existe == false){
        echo "false";
    }
}
?>
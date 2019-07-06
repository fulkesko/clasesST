<?php
$host = "localhost";
$user = "root";
$passwd = "";
$db = "examen1web";

$database = new mysqli($host,$user,$passwd,$db);
if($database->connect_error){
    die("Error Conexión!".$database->connect_error);
}

$user = isset($_POST["name"])? $_post["name"] : null; 
$pass = isset($_POST["pass"])? $_post["name"] : null;

$sql = "SELECT usuario.tipo_usuario_id_fk AS 'existe' FROM usuario WHERE nombre =$user AND pass =$pass";

$rs = $database->query($sql);

while ($fila = $rs->fetch_assoc()) {
    $existe = $fila["existe"];
    if($existe == "1"){
        echo "1";
    }if ($existe == "2") {
        echo "2";
    }if ($existe =="3") {
        echo "3";
    }else{
        echo "0";
    }
}
?>
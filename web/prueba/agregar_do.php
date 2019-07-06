<?php
require_once 'conexion.php';
require_once 'data.php';
//paten: pate, marca:marc, color:col, ano:anio
$paten = isset($_POST["paten"]) ? $_POST["paten"] : "";
$anio = isset($_POST["ano"]) ? $_POST["ano"] : "";

if($paten != "" && $anio != ""){
    $con = new Conexion();
    $data = new Data($con->getConexion());
    $marca = $_POST["marca"];
    $color = $_POST["color"];
    $guardar = $data->agregar($paten,$marca,$color,$anio);
}   
?>
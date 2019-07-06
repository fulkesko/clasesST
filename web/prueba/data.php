<?php
require_once 'conexion.php';

class Data {
    private $con;

    public function __construct($conexion){
        $this->con = $conexion;
    }

    public function buscarTabla(){
        $sql = "select Automovil.patente as 'Patente',
                    Marca.nombre_marca as 'Marca',
                    Color.nombre_color as 'Color',
                    Automovil.agno as 'Anio' from automovil
                    INNER JOIN marca ON Automovil.id_marca = marca.id_marca
                    INNER JOIN color ON Automovil.id_color = color.id_color;";
        $rs = $this->con->query($sql);
        $arr = [];
        while($fila = $rs->fetch_assoc()){
            $arr[] = $fila;
        }
        return $arr;
    }
    public function buscarMarca(){
        $sql= "select nombre_marca as marca from marca";
        $rs = $this->con->query($sql);
        $arr=[];
        while($fila = $rs->fetch_assoc()){
            $arr[] = $fila;

        }
        return $arr;
    }
    public function buscarColor(){
        $sql= "select nombre_color as color from color;";
        $rs = $this->con->query($sql);
        $arr=[];
        while($fila = $rs->fetch_assoc()){
            $arr[] = $fila;

        }
        return $arr;
    }

    public function agregar($patente,$marca,$color,$anio){
        $sql= "INSERT INTO Automovil VALUES('$patente',(SELECT id_marca FROM marca WHERE nombre_marca = '$marca'),(SELECT id_color FROM color WHERE nombre_color = '$color'),'$anio')";
        $rs = $this->con->query($sql);
        echo "agregado";

    }

}


?>
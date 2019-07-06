<?php
require_once 'conexion.php';

class Data {
    private $con;

    public function __construct($conexion){
        $this->con = $conexion;
    }

    public function isUsuarioValido($nickname,$passwd){
        $sql = "SELECT COUNT(*) AS 'existe' 
                    FROM usuario 
                    WHERE nom = '$nickname' AND pass = '$passwd'";
        $rs = $this->con->query($sql);
        
        if($fila = $rs->fetch_assoc()){
            $existe = $fila["existe"];
            if($existe == "1"){
                return true;
            }
        }
        return false;
    }

}


?>
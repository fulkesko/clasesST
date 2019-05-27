<?php
include_once "file_handler.php";

class ReservacionPelicula extends FileHandler {

    public function __construct(){
        //parent acceder a la otra coxina clase
        parent::__construct();
    }
    public function generarReserva($pelicula, $nombre_persona){
       //$hoy = date("Y-m-d H:i:s"); | fecha, pelicula, nombre
       parent::appendContent(date("d-m-y H:i:s"), $pelicula, $nombre_persona);
       
    }
    public function obtenerReserva($num,$linea){
        $list = parent::getContentFromFile();
        for ($i=$linea; $i < sizeof($list) ; $i++) { 
            $texto = explode("|",$list[$i]);
            return($texto[$num]);
        }
    }
    public function existePelicula($nombrePelicula){
        $list = $this->getContentFromFile();
        
        //obtengo lista y la recorro hasta el final 
        for ($i=0; $i < sizeof($list) ; $i++) { 
            $texto = explode("|",$list[$i]);
            //(strcasecmp ($cadena1 , $cadena2 ) == 0)
            if(strcasecmp($texto[1],$nombrePelicula) == 0){
                return true;
            }
        }
    
    }
    
}


?>
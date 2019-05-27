<?php
class FileHandler {
    private $COLUMN_SEPARATOR = "|";
    public $file_rute = "";

    public function __construct(){
        $this->file_rute = "registros_de_peliculas.txt";
        $file = fopen($this->file_rute,"r");
        
        fclose($file);
    }

    public function getContentFromFile(){
        $file = fopen($this->file_rute,"r");
        $arre = array();
        
        //mientras no este al final del archivo
        while(!feof($file)){
            $lin = fgets($file,4096);
            if($lin != ""){
                $arre[] = $lin;
            }
        }
        fclose($file);
        return $arre;
    }
    
    public function appendContent($fecha, $pelicula, $nombrePersona){
        $file = fopen($this->file_rute,"a");
        //fecha | pelicula | nombre
        $lin = $fecha . $this->COLUMN_SEPARATOR . $pelicula . $this->COLUMN_SEPARATOR . $nombrePersona;
        fwrite($file,$lin.PHP_EOL);
       
        fclose($file);

    }

}


?>
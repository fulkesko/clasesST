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
                    WHERE nickname = '$nickname' AND passwd = SHA2('$passwd',0)";
        $rs = $this->con->query($sql);
        if($fila = $rs->fetch_assoc()){
            $existe = $fila["existe"];
            if($existe == "1"){
                return true;
            }
        }
        return false;
    }

    public function getListaComentarios(){
        $sql = "SELECT tablon.id ,tablon.txt, usuario.nickname, tablon.fecha 
                FROM tablon
                INNER JOIN usuario on tablon.usuario_id_fk = usuario.id";

        $rs = $this->con->query($sql);
        $arr = [];
        while($fila = $rs->fetch_assoc()){
            $arr[] = $fila;
        }
        return $arr;

    }

    public function eliminarById($id){
        $sql = "DELETE FROM tablon WHERE id = $id";
        $this->con->query($sql);
    }

    public function actualizarById($id, $texto){
        $sql = "UPDATE tablon SET txt='$texto' WHERE id='$id'";
        $this->con->query($sql);
    }
    public function ingresarComentario($texto, $nickname){
        $sql = "INSERT INTO tablon VALUES (NULL,'$texto' ,NOW() , (SELECT id FROM usuario WHERE nickname = '$nickname'))";
        $this->con->query($sql);
    }
}
//MAIN
/*
$con = new Conexion();
$data = new Data($con->getConexion());

$lista = $data->getListaComentarios();
echo "<pre>";
foreach($lista as $fila){
    echo $fila["txt"] . " ";
    echo $fila["nickname"] . " ";
    echo $fila["fecha"] . " <br>";
}
echo "</pre>";

*/


?>
<?php 
    require_once("reservacion_pelicula.php");
    $o = new ReservacionPelicula();
    $c = 1;
    $b = 0;
    $pelicula = isset($_GET["pelicula"]) ? $_GET["pelicula"] : NULL;
    $nombre = isset($_GET["nombre"]) ? $_GET["nombre"] : NULL;
    $texto = "bg-dark";
    //alabado sean los apuntes 
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>App Reservaciones películas</title>
    <link rel="stylesheet" href="css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</head>
<body>
    <h1 class="text-center">App Reservaciones películas</h1>
        <hr><!--cambiar el div-->
             <?php 
             //registrar
                if($pelicula != NULL && $nombre != NULL){
                     $comp = $o->existePelicula($pelicula);
                     if ($comp == true) {
                        echo "<div class='p-3 mb-2 bg-warning text-white' >Error en el ingreso, pelicula ya existe en el registro  </div>";
                    }
                     if($comp == false){
                         $o->generarReserva($pelicula,$nombre);
                         echo "<div class='p-3 mb-2 bg-success text-white' >Registros agregados exitosamente:  </div>";
                    }
                }else{
                    echo "<div class='p-3 mb-2 bg-dark text-white' >Bienvenido:  </div>";
                }
        ?>
        
    <hr>
    <h2 class="bg-light text-dark rounded">Formulario Películas</h2>
    <form action="index.php" method="get">
        <div class="form-group">
            <label for="idPelicula">Película</label>
            <input type="text"class="form-control"  name="pelicula" id="idPelicula">
        </div>
        <div class="form-group">
            <label for="idNombre">Nombre persona</label>
            <input type="text"class="form-control"  name="nombre" id="idNombre">
        </div>
        <input class="btn btn-primary btn-lg btn-block" type="submit" value="Registrar reservación">
    
    </form>
   
    <hr>
    <h2 class="bg-light text-dark rounded">Películas Reservadas</h2>
    <table class="table  table-light">
        <thead class="thead-dark">
            <tr>
                <th scope="col">#</th> <!-- Numero/conteo de registro -->
                <th scope="col">Fecha Registro</th>
                <th scope="col">Pelicula</th>
                <th scope="col">Nombre Persona</th>
            </tr>
        </thead>
        <tbody>
            <!--ciclo para generar filas-->
            <?php 
            if (trim(filesize($o->file_rute)) != 0){
            $lista = $o->getContentFromFile();
                for ($fila=1; $fila <= sizeof($lista) ; $fila++) { 
                    echo "<tr>";
                    echo "<th scope='row'> $c </th>";
                    
                    for ($colu=0; $colu < 3 ; $colu++) { 
                        $a = $o-> obtenerReserva($colu,$b);
                        echo "<td>$a</td>";
                    }
                    $b = $b + 1;
                    $c = $c + 1;
                    echo "</tr>";
                }
            }
            ?>
        </tbody>
    </table>
    
</body>
</html>
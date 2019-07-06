<?php 
$user = $_GET["user"];
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>nuevo comentario</title>
</head>
<body>
    <?php
    
    echo  "<form action='crear.php'>";
    echo  "<textarea name='texto' cols='30' rows='10'></textarea>";
    echo  "<input type='hidden' name='user' value=".$user.">";
    echo  "<button type='submit'>enviar</button>";
    echo  "</form>";
    ?>
</body>
</html>
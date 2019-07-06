function agregar() {
    console.log("cargando formulario");
    $("#contenido").load('formulario.php');
}
function obtener() {
    let pate = $("#patente").val();
    let marc = $("#marca").val();
    let col = $("#color").val(); 
    let anio = $("#anio").val();
    if(pate == ""){
        console.log("nada");
    }else{
        
    
        $.post("agregar_do.php",{paten: pate, marca:marc, color:col, ano:anio})
    }
}
function verlista() {
    console.log("cargando lista");
    $("#contenido").load("lista.php");
}
function sumar(){
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value);

    let result = (num1 + num2);
    document.getElementById("resul").value = result;
}
function restar(){
    var num1 = parseInt(document.getElementById("num1").value);
    var num2 = parseInt(document.getElementById("num2").value);

    var result = (num1 - num2);
    document.getElementById("resul").value = result;
}
function multi(){
    var num1 = parseInt(document.getElementById("num1").value);
    var num2 = parseInt(document.getElementById("num2").value);

    var result = (num1 * num2);
    document.getElementById("resul").value = result;
}
function divi(){
    var num1 = parseInt(document.getElementById("num1").value);
    var num2 = parseInt(document.getElementById("num2").value);

    if(num2 != 0){
        var result = (num1 / num2);
        document.getElementById("resul").value = result;
    }else{
        alert("Numero no definido")
    }

}
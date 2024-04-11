<?php

// include_once "Other.php";
// incluir otros archivos para hacer uso de su contenido

// include incluye la info de X archivo que se llama (si tiene un error lo notifica pero la ejecucion del programa sigue)
// - LO CARGA EN MEMORIA y lo mantiene asi porque index lo mantiene llamado

// require requiere la info de X archivo que se llama (si tiene un error lo notifica y para la ejecucion del programa)
// - LO CARGA EN MEMORIA y lo mantiene asi porque index lo mantiene llamado

// hacen lo mismo pero cambia el tema del error

// include_once  se include una sola vez - lo llama, lo carga en memoria, usa lo que tenga que usar y cuando se deja de usar index.php se descarga de memoria
// require_once  se requiere una sola vez - lo llama, lo carga en memoria, usa lo que tenga que usar y cuando se deja de usar index.php se descarga de memoria

//example:
// include_once "Other.php"; se hace asi

echo $mensaje;

echo "<br>";




//FUNCIONES
// si hay una funcion en este archivo y otra llamada igual en otro archivo (ej: Other.php) da prioridad a las funciones del mismo archivo
// IMPORTANTE NO SE PUEDE REDECLARAR FUNCIONES (hacer 2 veces lo mismo), 2 opciones: o no redeclaro o no incluyo/requiero el archivo con esa funcion

function sum ($num1, $num2) : string{

    $result = $num1 + $num2;

    return $result;
}

$rta = sum(14, 6);

echo $rta;

function saludar(){
    echo "hola soy la funcion saludar";
}

echo "<br>";

saludar();

// partes de una funcion:
// declaracion de la funcion con la palabra reservada [function]
// nombre de la funcion, se escribe en minuscula
// parametros entre parentesis
// adicionalemnte:
// a posterior de los parentesis puedo decirle con : que tipo de dato quiero que la funcion me devuelva (int, float, string, double, boolean, array, object, null)
// si especifico el tipo de dato que quiero que la funcion me devuelva TENGO QUE PONER return SI O SI, si no especifico el tipo de dato puedo O NO poner return

//lo de abajo se lee: che funcion te voy a dar X cantidad de datos, no se cuantos van a ser si 4, 10, 200
function sum2(...$num){

    $sum = 0;


    //lo de abajo se lee: a todos los datos de $num los vas a identificar como $key, y a cada uno de los datos se suman (+) y se asigna el valor (=)
    //por ende es +=
    foreach ($num as $key){
        $sum += $key;
    }

    return $sum;

}

echo "<br>";

$randNumbers = sum2(14, 10, 80, 120);

echo $randNumbers;

?>
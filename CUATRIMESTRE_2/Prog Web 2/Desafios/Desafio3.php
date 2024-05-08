<?php 
//ejercicio con constantes
define('PI', 3.1416);

$radio = 5;

$area = PI * $radio^2;

echo $area;



//ejercicio con operadores

$numero1 = 10;
$numero2 = 20;

$suma = $numero1 + $numero2;
$resta = $numero1 - $numero2;
$multi = $numero1 * $numero2;
$division = $numero1 / $numero2;
$modulo = $numero1 % $numero2;

echo $suma;
echo $resta;
echo $multi;
echo $division;
echo $modulo;


//ejercicio de if elses

$numeroIf = 10;

if ($numeroIf > 0) {
    $mensaje = 'El numero es positivo';
} elseif ($numeroIf < 0) {
    $mensaje = 'El numero es negativo';
} else {
    $mensaje = 'El numero es cero';
}
echo $mensaje;


//ejercicio de switch

$dia = 6;

switch ($dia) {
    case 1:
        $mensajeSwitch = 'Lunes';
        break;
    case 2:
        $mensajeSwitch = 'Martes';
        break;
    case 3:
        $mensajeSwitch = 'Miercoles';
        break;
    case 4:
        $mensajeSwitch = 'Jueves';
        break;
    case 5:
        $mensajeSwitch = 'Viernes';
        break;
    case 6:
        $mensajeSwitch = 'Sabado';
        break;
    case 7:
        $mensajeSwitch = 'Domingo';
        break;
    default:
        $mensajeSwitch = 'No es un dia de la semana';
        break;
}

echo $mensajeSwitch;


//ejercicio de loops

$i = 0;

while ($i < 10) {
    echo $i . '<br>';
    $i++;
}
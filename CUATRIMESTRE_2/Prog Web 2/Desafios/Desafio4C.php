<?php 

$numeros = array(3, 4, 10, 22);

$cantidadElementos = count($numeros);
echo $cantidadElementos . "<br>";

$sumaElementos = array_sum($numeros);
echo $sumaElementos . "<br>";


$promedio = $sumaElementos / $cantidadElementos;
echo $promedio . "<br>";

$maximo = max($numeros);
$minimo = min($numeros);

echo $maximo . "<br>";
echo $minimo . "<br>";
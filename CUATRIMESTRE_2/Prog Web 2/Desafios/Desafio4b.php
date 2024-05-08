<?php 

$colores = array('rojo', 'verde', 'azul', 'amarillo');

echo $colores[0];

echo $colores[3];

//con array_search

$elemento1 = array_search("rojo", $colores);

$elemento2 = array_search("amarillo", $colores);

echo 'con array_search, 1: ' . $elemento1 . '<br>' . '2:'. $elemento2;


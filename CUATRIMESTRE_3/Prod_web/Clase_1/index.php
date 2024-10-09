<?php

require_once 'clase.php';

// $estufa = new Estufa(); //objeto sin parametros

$estufa = new Estufa('Atma', 1, false); //objeto con parametros

$estufa->marca = "Whirlpool";

$estufa->potencia = 3;

$estufa->encenderEstufa();

if ($estufa->encendida){
    echo "Estufa encendida correctamente en el nivel: {$estufa->potencia}";
}
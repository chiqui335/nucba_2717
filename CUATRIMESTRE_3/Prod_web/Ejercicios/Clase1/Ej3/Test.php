<?php

require_once '../Ej1/Personaje.php';
require_once '../Ej3/TestPersonajes.php';

$batman = new Personaje('Batman', 80, 90);

$superman = new Personaje('Superman', 100, 75);

$resultado = TestPersonaje::simularMultPelea($batman, $superman, 4);


echo '<pre>';

var_dump($resultado);

exit();
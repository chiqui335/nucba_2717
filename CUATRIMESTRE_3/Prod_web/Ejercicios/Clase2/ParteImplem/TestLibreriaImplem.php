<?php
require 'LibreriaInterface.php';
require 'Libreria.php';

// Establecemos el texto a través de setTexto
Libreria::setTexto("Este es un texto de ejemplo para procesar");

// Contamos las palabras del texto
echo "Número de palabras: " . Libreria::contarPalabras() . "<br>";

// Cortamos el texto a 10 caracteres
echo "Texto cortado: " . Libreria::cortarTexto(10) . "<br>";
?>
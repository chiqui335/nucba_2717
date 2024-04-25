<?php

//se inicia la sesion
session_start();


//se comienza a guardar info en la supervariable SESSION
$_SESSION["nombre"] = "Pablo"; 
$_SESSION["apellido"] = "cano";
$_SESSION["email"] = "Pablo.cano@gmail.com";

echo "hola " . $_SESSION["nombre"] . " " . $_SESSION["apellido"] . "<br>"; //se concatena con . (punto) en vez de +

echo "recuerden el email: " . $_SESSION["email"] . "<br>";


echo "<pre>";
print_r($_SESSION);
"</pre>";

echo "<br>";


echo '<a href="cierre.php">CERRAR SESION</a>';


// session_destroy(); //se limpia la info de la supervariable SESSION
<?php

session_start();

if (isset($_SESSION['usuario'])) {
    $usuario = $_SESSION['usuario'];
    echo 'Bienvenido ' . $usuario . '!';

    if (isset($_COOKIE['colorFondo'])) {
        $colorFondo = $_COOKIE['colorFondo'];
    } else {
        $colorFondo = "#FFFFFF"; //color blanco
    }
    echo "<form action='Color.php' method='POST'>";
    echo "<label for='color'>Elige un color de fondo:</label>";
    echo "<input type='color' name='color' value='$colorFondo'>";
    echo "<input type='submit' value='Guardar'>";
    echo "</form>";

    echo "<style>body { background-color: $colorFondo; }</style>";
} else {
    header('Location: index.php');
    exit();
}
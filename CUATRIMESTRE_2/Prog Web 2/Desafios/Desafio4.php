<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Funcion de saludar</title>
</head>
<body>
    <h1>Saludador</h1>
    <form method="post" action="">
        <label for="nombre">Ingrese su nombre:</label>
        <input type="text" id="nombre" name="nombre" required>
        <button type="submit">Convertir</button>
    </form> 


<?php 

//Ejercicio sobre Funciones Definidas por el usuario


$nombre = $_POST["nombre"];

function saludar($nombre) {
    echo 'Hola ' . $nombre;
}

saludar($nombre);
?>
</body>
</html>


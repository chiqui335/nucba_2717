<?php

if(isset($_POST['color'])) {
    // Obtener el color seleccionado por el usuario
    $colorFondo = $_POST['color'];

    // Almacenar el color de fondo en una cookie por 1 hora
    setcookie('colorFondo', $colorFondo, time() + 3600, '/');

    // Redireccionar de vuelta a la página de bienvenida
    header("Location: BienvenidaDesafio6.php");
    exit();
} else {
    echo "Hubo un error al procesar el formulario.";
}

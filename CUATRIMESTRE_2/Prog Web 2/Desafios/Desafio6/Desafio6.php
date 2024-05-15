<?php

session_start();

if (isset($_POST['usuario']) && isset($_POST['contraseña'])) {
    $usuarioValido = "franco";
    $contraValida = "1234";


    if ($_POST['usuario'] == $usuarioValido && $_POST['contraseña'] == $contraValida) {

        $_SESSION ['usuario'] = $_POST ['usuario'];
        header('location: BienvenidaDesafio6.php');
        exit();

    } else {
        echo "Usuario o contraseña incorrectos.";
    }
    
} else {
    echo "Hubo un error al procesar el formulario.";
}

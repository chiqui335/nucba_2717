<?php

session_start();

if (isset($_POST['nombre']) && isset($_POST['apellido']) && isset($_POST['email']) && isset($_POST['contraseña'])) {
    
    if (!empty($_POST['nombre']) && !empty($_POST['apellido']) && !empty($_POST['email']) && !empty($_POST['contraseña'])){

        if (filter_var($_POST['email'], FILTER_VALIDATE_EMAIL)){

            $emailRegistrado = false;
            
            if(!$emailRegistrado){
                $_SESSION ['usuario'] = $_POST ['nombre'];
                header('location: BienvenidaDesafio5.php');
                exit();

            } else {
                echo "El correo electrónico ya está registrado.";
            }
        } else {
            echo "El correo electrónico no es válido.";
        }
    } else {
        echo "Por favor, complete todos los campos.";
    }
} else {
    echo "Hubo un error al procesar el formulario.";
}
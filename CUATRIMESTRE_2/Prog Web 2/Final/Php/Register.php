<?php

session_start();

require 'connections.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST'){
    if(isset($_POST['username']) && $_POST['username'] != null && isset($_POST['password']) && $_POST['password'] != null && isset($_POST['email']) && $_POST['email'] != null){

        $username = htmlspecialchars(trim(stripslashes($_POST['username'])));
        $password = htmlspecialchars(trim(stripslashes($_POST['password']))); 
        $email = htmlspecialchars(trim(stripslashes($_POST['email'])));

    } elseif (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        echo "El correo ingresado no es válido. Por favor, verifica el correo ingresado.";
    } else {
        echo "Error, todos los campos son requeridos. Por favor, verifica los datos ingresados.";
    }
}
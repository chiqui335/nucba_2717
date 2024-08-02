<?php

session_start();
require 'Connections.php';

if($_SERVER['REQUEST_METHOD'] == 'POST'){
    if(isset($_POST['username']) && $_POST['username'] != null && isset($_POST['password']) && $_POST['password'] != null){
        $username = trim(stripslashes($_POST['username']));
        $password = trim(stripslashes($_POST['password'])); 

        $username = htmlspecialchars($username);
        
        // consulta SQL para verificar el usuario
        $sql = "SELECT * FROM user WHERE username =?";

        $stmt = mysqli_prepare($con, $sql);
        mysqli_stmt_bind_param($stmt, "s", $username);
        mysqli_stmt_execute($stmt);
        $result = mysqli_stmt_get_result($stmt);

        if (mysqli_num_rows($result) > 0) {
            $user = mysqli_fetch_assoc($result); 

            if(password_verify($password, $user['password'])){
                $_SESSION['username'] = $username;

                echo "Inicio de sesión exitoso. Bienvenido, " . $username . "!";

                //redirijo al inicio
                header("Location: home.php");
                exit();
            } else {
                $error = "Contraseña incorrecta.";
            } 
        } else {
            echo "Nombre de usuario no encontrado. Por favor, registra una cuenta.";
        }

        
    }
}

mysqli_close($con);
?>



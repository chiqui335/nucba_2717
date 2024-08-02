<?php

session_start();

require 'Connections.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST'){
    if(isset($_POST['username']) && $_POST['username'] != null && isset($_POST['password']) && $_POST['password'] != null && isset($_POST['email']) && $_POST['email'] != null){

        $username = trim(stripslashes($_POST['username']));
        $password = trim(stripslashes($_POST['password'])); 
        $email = trim(stripslashes($_POST['email']));

        $username = htmlspecialchars($username);
        $email = htmlspecialchars($email);

    } elseif (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        echo "El correo ingresado no es válido. Por favor, verifica el correo ingresado.";

    } else {
        // verifico si el usuario esta en la BD
        $sql = "SELECT * FROM user WHERE username = ? OR email = ?";
        $stmt = mysqli_prepare($con, $sql);
        mysqli_stmt_bind_param($stmt, "ss", $username, $email);
        mysqli_stmt_execute($stmt);
        $result = mysqli_stmt_get_result($stmt);

        if (mysqli_num_rows($result) > 0) {
            echo "El nombre de usuario o el correo electrónico ya están en uso.";
        } else {
            // inserto los datos en la BD
            $sql = "INSERT INTO user (username, email, password) VALUES (?,?,?)";
            $stmt = mysqli_prepare($con, $sql);
            mysqli_stmt_bind_param($stmt, "sss", $username, password_hash($password, PASSWORD_DEFAULT), $email);
            
            // Verifico si esta todo bien
            if (mysqli_stmt_execute($stmt)) {
                echo "El registro se ha completado correctamente. Ahora puedes <a href='login.html'>iniciar sesión</a>.";
            } else {
                echo "error: " . mysqli_stmt_error($stmt);
            }
        }
    }
}

mysqli_close($con);
?>

// echo "Error, todos los campos son requeridos. Por favor, verifica los datos ingresados.";



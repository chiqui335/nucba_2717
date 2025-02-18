<?php

session_start();

if ($_SERVER['REQUEST_METHOD'] == 'POST') {

    require_once 'Database.php';

    // Obtener los datos enviados
    $username = $_POST['username'];
    $password = $_POST['password'];

    // Verificar campos vacíos
    if (empty($username) || empty($password)) {
        echo "Por favor, ingresa un nombre de usuario y contraseña.";
        exit;
    }

    function sanitize($input) {
        global $conn; // Usar la variable global de la conexión
        $input = trim($input);    // Eliminar espacios en blanco
        $input = stripslashes($input);    // Eliminar barras invertidas
        $input = htmlspecialchars($input, ENT_QUOTES, 'UTF-8'); // Evitar inyección de HTML/JavaScript
        $input = $conn->real_escape_string($input);    // Prevenir inyección SQL
        return $input;
    }

    // Consulta para obtener la contraseña hasheada
    $query = "SELECT * FROM user WHERE username = ?";
    
    $stmt = $conn->prepare($query);
    $stmt->bind_param("s", $username);
    $stmt->execute();
    
    $result = $stmt->get_result();

    // Verificar si el usuario existe
    if ($result->num_rows > 0) {
        $user = $result->fetch_assoc();
        
        // Verificar la contraseña ingresada contra el hash
        if (password_verify($password, $user['password'])) {
            // Iniciar sesión
            $_SESSION['id'] = $user['id'];
            $_SESSION['username'] = $user['username'];
            $_SESSION['role'] = $user['role'];

            // Redirigir según el rol
            if ($user['role'] == 'administrador') {
                // vista de administrador
                header("Location: administrador.php");
            } elseif ($user['role'] == 'psicologo') {
                //vista de psicologo
                header("Location: psicologo.php");
            } else {
                // vista de paciente
                header("Location: paciente.php");
            }
            exit;
        } else {
            echo "Contraseña incorrecta.";
        }
    } else {
        echo "Usuario no encontrado.";
    }

    // Cerrar la conexión
    $stmt->close();
    $conn->close();
} else {
    header('Location: login.html');  // Redirigir si no se accede mediante POST
    exit;
}

?>


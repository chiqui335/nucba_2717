<?php
include 'db.php';

session_start();

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (isset($_POST['user']) && !empty(trim($_POST['user'])) && isset($_POST['password']) && !empty(trim($_POST['password']))) {

        //sanitize data
        $username = trim($_POST['user']);
        $hashedPassword = password_hash($password, PASSWORD_DEFAULT);

        //prevent sql injection
        $username = htmlspecialchars($username);

        //prepare sql statement
        $sql = "SELECT id, password, role FROM usuarios WHERE username = ?";
        $stmt = $conn->prepare($sql);
        $stmt->bind_param("ss", $username, $hashedPassword);
        $stmt->execute();
        $stmt->store_result();

        if ($stmt->num_rows > 0) {
            //get user details
            $stmt->bind_result($id, $role, $hashedPassword);
            $stmt->fetch();

            //check password
            if (password_verify($password, $hashedPassword)) {
                //set session variables
                $_SESSION['id'] = $id;
                $_SESSION['username'] = $username;
                $_SESSION['role'] = $role;

                if ($role == 'admin') {
                    header("location: admin.php");
                } else {
                    header("location: paciente.php");
                }
                exit();
    } else {
        echo "Contraseña incorrecta.";
    }
} else {
    echo "Usuario no encontrado.";
}
    }
}
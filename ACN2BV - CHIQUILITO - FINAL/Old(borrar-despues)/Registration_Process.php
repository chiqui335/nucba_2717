<?php

require_once 'Database.php';

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    // Obtener datos del formulario
    $username = trim($_POST['username']);
    $email = trim($_POST['email']);
    $password = trim($_POST['password']);
    $role = trim($_POST['role']);
    $matricula = isset($_POST['matricula']) ? trim($_POST['matricula']) : null;
    $os = isset($_POST['OS']) ? trim($_POST['OS']) : null;
    $cro_credencial = isset($_POST['cro_credencial']) ? trim($_POST['cro_credencial']) : null;
    $fecha_nacimiento = isset($_POST['fecha_nacimiento']) ? trim($_POST['fecha_nacimiento']) : null;
    $telefono = isset($_POST['telefono']) ? trim($_POST['telefono']) : null;
    $direccion = isset($_POST['direccion']) ? trim($_POST['direccion']) : null;
    $especialidad = isset($_POST['especialidad']) ? trim($_POST['especialidad']) : null;

    // Validar entrada
    $username = stripslashes($username);
    $email = stripslashes($email);
    $password = stripslashes($password);
    $role = stripslashes($role);
    $matricula = stripslashes($matricula);
    $os = stripslashes($os);
    $cro_credencial = stripslashes($cro_credencial);
    $fecha_nacimiento = stripslashes($fecha_nacimiento);
    $telefono = stripslashes($telefono);
    $direccion = stripslashes($direccion);
    $especialidad = stripslashes($especialidad);

    $username = htmlspecialchars($username);
    $email = htmlspecialchars($email);
    $role = htmlspecialchars($role);
    $matricula = htmlspecialchars($matricula);
    $os = htmlspecialchars($os);
    $cro_credencial = htmlspecialchars($cro_credencial);
    $fecha_nacimiento = htmlspecialchars($fecha_nacimiento);
    $telefono = htmlspecialchars($telefono);
    $direccion = htmlspecialchars($direccion);
    $especialidad = htmlspecialchars($especialidad);

    // Crear el hash de la contraseña
    $passwordhash = password_hash($password, PASSWORD_DEFAULT);

    // Verificar si el nombre de usuario o el correo ya están en uso
    $stmt = $conn->prepare("SELECT * FROM user WHERE username = ? OR email = ?");
    $stmt->bind_param("ss", $username, $email);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($result->num_rows > 0) {
        echo "El nombre de usuario o el correo electrónico ya está en uso.";
        exit();
    } else {
        // Insertar el nuevo usuario en la tabla 'user'
        $stmt = $conn->prepare("INSERT INTO user (username, email, password, role) VALUES (?, ?, ?, ?)");
        $stmt->bind_param("ssss", $username, $email, $passwordhash, $role);
        $stmt->execute();

        // Obtener el ID del nuevo usuario registrado
        $user_id = $stmt->insert_id;

        // Insertar en la tabla correspondiente según el rol
        if ($role === 'psicologo') {
            // Insertar datos del psicólogo
            $stmt = $conn->prepare("INSERT INTO psicologo (id_user, especialidad, matricula) VALUES (?, ?, ?)");
            $stmt->bind_param("iss", $user_id, $especialidad, $matricula);
            $stmt->execute();
        } elseif ($role === 'paciente') {
            // Insertar datos del paciente
            $stmt = $conn->prepare("INSERT INTO paciente (id_user, fecha_nacimiento, telefono, direccion, OS, cro_credencial) VALUES (?, ?, ?, ?, ?, ?)");
            $stmt->bind_param("isssss", $user_id, $fecha_nacimiento, $telefono, $direccion, $os, $cro_credencial);
            $stmt->execute();
        }

        echo "Usuario registrado con éxito.";
    }

    // Cerrar conexión
    $conn->close();
    $stmt->close();
}
?>



// METODOS ANTIGUOS

public function isUserExists($username, $email) {

if (!($this->db instanceof mysqli)) {
    die("Error: Conexión a la base de datos no válida.");
}

$stmt = $this->db->prepare("SELECT * FROM user WHERE username = ? OR email = ?");


if ($stmt) {
    $stmt->bind_param("ss", $username, $email);
    $stmt->execute();
    $result = $stmt->get_result();
    var_dump($result); // Ver el resultado
    echo $stmt->error; // Mostrar errores de la consulta
    $stmt->close();
} else {
    echo $this->db->error; // Mostrar errores en la preparación del statement
}



// $stmt->bind_param("ss", $username, $email);
// $stmt->execute();
// $result = $stmt->get_result();

$exists = $result->num_rows > 0;
$stmt->close();

return $exists;
}
<?php


//ya esta pasado
require_once 'Database.php';
require_once 'User.php';
require_once 'Paciente.php';
require_once 'Profesional.php';

$db = new Database();
$conn = $db->getConnection();


if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    
    $id = null;
    // Obtener datos del formulario (esto que vaya directo no en una funcion)
    $username = trim($_POST['username']);
    $email = trim($_POST['email']);
    $password = trim($_POST['password']);
    $role = trim($_POST['role']);
    $nombre = trim($_POST['nombre']);
    $apellido = trim($_POST['apellido']);

    $matricula = isset($_POST['matricula']) ? trim($_POST['matricula']) : null;
    $OS = isset($_POST['OS']) ? trim($_POST['OS']) : null;
    $nro_credencial = isset($_POST['cro_credencial']) ? trim($_POST['cro_credencial']) : null;
    $fecha_nacimiento = isset($_POST['fecha_nacimiento']) ? trim($_POST['fecha_nacimiento']) : null;
    $telefono = isset($_POST['telefono']) ? trim($_POST['telefono']) : null;
    $direccion = isset($_POST['direccion']) ? trim($_POST['direccion']) : null;
    $especialidad = isset($_POST['especialidad']) ? trim($_POST['especialidad']) : null;

    // sanitizar entrada
    $username = htmlspecialchars(stripslashes($username));
    $email = htmlspecialchars(stripslashes($email));
    $password = htmlspecialchars(stripslashes($password));
    $nombre = htmlspecialchars(stripslashes($nombre));
    $apellido = htmlspecialchars(stripslashes($apellido));

    $role = htmlspecialchars(stripslashes($role));

    $matricula = htmlspecialchars(stripslashes($matricula));
    $OS = htmlspecialchars(stripslashes($OS));
    $nro_credencial = htmlspecialchars(stripslashes($nro_credencial));
    $fecha_nacimiento = htmlspecialchars(stripslashes($fecha_nacimiento));
    $telefono = htmlspecialchars(stripslashes($telefono));
    $direccion = htmlspecialchars(stripslashes($direccion));
    $especialidad = htmlspecialchars(stripslashes($especialidad));


    // Crear el hash de la contraseña
    $passwordhash = password_hash($password, PASSWORD_DEFAULT);


    if ($role == 'paciente') {
        $user = new Paciente($username, $passwordhash, $email, $role, $conn, $fecha_nacimiento, $telefono, $direccion, $OS, $nro_credencial, $nombre, $apellido);
    } else {
        $user = new Profesional($username, $passwordhash, $email, $role, $conn, $especialidad, $matricula, $nombre, $apellido); //REVISAR PARA DEJARLO IGUAL QUE PARA PACIENTE
    }

    $exist = $user->isUserExists($username, $email);

    if ($exist) {
        echo "User already exists";
    }

    $user_id = $user->insertUser($username, $email, $passwordhash, $role);

    if ($role == 'paciente') {
        $user->insertarDatosPaciente($user_id, $fecha_nacimiento, $telefono, $direccion, $OS, $nro_credencial, $nombre, $apellido);
    } else {
        $user->insertarDatosProfesional($user_id, $especialidad, $matricula, $role, $nombre, $apellido);
    }

}
?>


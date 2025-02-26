<?php
session_start();
if (!isset($_SESSION['role']) || $_SESSION['role'] !== 'paciente') {
    header('Location: login.php');
    exit();
}

if (!isset($_SESSION['id'])) {
    echo "No se ha encontrado el ID del paciente en la sesión.";
    exit();
}

include 'Database.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST' && isset($_POST['confirmar_turno'])) {
    $id_paciente = $_SESSION['id'];
    $id_profesional = $_POST['profesional_id'];
    $fecha_hora = $_POST['fecha_hora'];
    $especialidad = $_POST['especialidad'];

    // Obtener el nombre del profesional
    $sql_prof = "SELECT nombre FROM profesional WHERE id = ?";
    $stmt_prof = $conn->prepare($sql_prof);
    $stmt_prof->bind_param("i", $id_profesional);
    $stmt_prof->execute();
    $stmt_prof->bind_result($profesional);
    $stmt_prof->fetch();
    $stmt_prof->close();

    // Insertar el turno en la base de datos
    $sql = "INSERT INTO turno (id_paciente, id_profesional, fecha_hora, nombre_y_apellido_profesional, especialidad) VALUES (?, ?, ?, ?, ?)";
    $stmt = $conn->prepare($sql);
    $stmt->bind_param("iisss", $id_paciente, $id_profesional, $fecha_hora, $profesional, $especialidad);
    
    if ($stmt->execute()) {
        echo "Turno confirmado exitosamente.";
        header("Location: panel_de_control.php");
    } else {
        echo "Error al confirmar el turno.";
    }

    $stmt->close();
    $conn->close();
}
?>

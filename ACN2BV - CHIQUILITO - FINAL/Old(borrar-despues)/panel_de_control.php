<?php
session_start();

if (!isset($_SESSION['role']) || $_SESSION['role'] !== 'paciente') {
    header('Location: login.php');
    exit();
}

include 'Database.php'; // Archivo para la conexión a la base de datos
include 'User.php'; 

$user_id = $_SESSION['id'];

// Eliminar turno si se hace clic en "Cancelar turno"
if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['action']) && $_POST['action'] === 'eliminar') {
    if (isset($_POST['turno_id']) && is_numeric($_POST['turno_id'])) {
        $turno_id = intval($_POST['turno_id']);

        $sql = "DELETE FROM turno WHERE id = ?";
        $stmt = $conn->prepare($sql);
        $stmt->bind_param("i", $turno_id);

        if ($stmt->execute()) {
            $_SESSION['message'] = "El turno ha sido eliminado correctamente.";
        } else {
            $_SESSION['message'] = "Error al intentar eliminar el turno.";
        }

        $stmt->close();
    } else {
        $_SESSION['message'] = "ID de turno inválido.";
    }
}

// Primera consulta: obtener el ID del paciente
$sql2 = "SELECT id FROM paciente WHERE id_user = ?";
$stmt2 = $conn->prepare($sql2);
$stmt2->bind_param("i", $user_id);
$stmt2->execute();
$result2 = $stmt2->get_result();

if ($result2->num_rows > 0) {
    $row = $result2->fetch_assoc();
    $id_paciente = $row['id'];

    // Segunda consulta: obtener turnos asociados al paciente
    $sql = "
    SELECT 
        t.id, 
        t.fecha_hora, 
        t.estado, 
        t.nombre_y_apellido_profesional AS profesional, 
        t.especialidad
    FROM turno t
    WHERE t.id_paciente = ?
";

    $stmt = $conn->prepare($sql);
    $stmt->bind_param("i", $id_paciente);
    $stmt->execute();
    $result = $stmt->get_result();
} else {
    echo 'No se encontró un paciente asociado al usuario.';
    $result = null; // Para evitar errores si $result se usa en el HTML
}



?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Panel de Control</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1>Mis Turnos</h1>
        
        <!-- Botón para agregar un nuevo turno -->
        <a href="agregar_turno.php" class="btn btn-success mb-3">Agregar Turno</a>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Fecha y hora</th>
                    <th>Profesional</th>
                    <th>Especialidad</th>
                    <th>Estado</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <?php if ($result && $result->num_rows > 0) { ?>
                    <?php while ($row = $result->fetch_assoc()) { ?>
                        <tr>
                            <td><?= htmlspecialchars($row['fecha_hora']); ?></td>
                            <td><?= htmlspecialchars($row['profesional']); ?></td>
                            <td><?= htmlspecialchars($row['especialidad']); ?></td>
                            <td><?= htmlspecialchars($row['estado']); ?></td>
                            <td>
                                <form method="POST" style="display:inline;">
                                    <input type="hidden" name="turno_id" value="<?= $row['id']; ?>">
                                    <input type="hidden" name="action" value="eliminar">
                                    <button type="submit" class="btn btn-danger">Cancelar turno</button>
                                </form>
                                <form action="reprogramar_turno.php" method="GET" style="display:inline;">
                                    <input type="hidden" name="turno_id" value="<?= $row['id']; ?>">
                                    <button type="submit" class="btn btn-primary">Reprogramar turno</button>
                                </form>
                                <form action="confirmar_turno.php" method="POST" style="display:inline;">
                                    <input type="hidden" name="turno_id" value="<?= htmlspecialchars($row['id']); ?>">
                                    <button type="submit" class="btn btn-success">Confirmar turno</button>
                                </form>
                            </td>
                        </tr>
                    <?php } ?>
                <?php } else { ?>
                    <tr>
                        <td colspan="5" class="text-center">No se encontraron turnos.</td>
                    </tr>
                <?php } ?>
            </tbody>
        </table>
    </div>
</body>
</html>

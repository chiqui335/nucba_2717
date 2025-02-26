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


//OTRO VERSION 2


<?php
session_start();
if (!isset($_SESSION['role'])) {
    header('Location: login.php');
    exit();
}

include 'Database.php'; 
include 'User.php'; 

$user_id = $_SESSION['id'];
$role = $_SESSION['role'];

//REVISAR ESTE CODIGO (es una refactorizacion de lo de arriba):
if ($role === 'paciente') {
    $sql2 = "SELECT id FROM paciente WHERE id_user = ?";
    $stmt2 = $conn->prepare($sql2);
    $stmt2->bind_param("i", $user_id);
    $stmt2->execute();
    $result2 = $stmt2->get_result();

    if ($result2->num_rows > 0) {
        $row = $result2->fetch_assoc();
        $id_paciente = $row['id'];

        // obtener los datos de profesional desde la tabla profesional
        $sql = "SELECT t.id, t.fecha_hora, t.estado, 
               CONCAT(p.nombre, ' ', p.apellido) AS profesional, 
               p.especialidad
        FROM turno t
        JOIN profesional p ON t.id_profesional = p.id
        WHERE t.id_paciente = ?";
                    
        $stmt = $conn->prepare($sql);
        $stmt->bind_param("i", $id_paciente);
    } else {
        echo 'No se encontró un paciente asociado al usuario.';
        $stmt = null;
    }
}


// Si es médico, psicólogo o kinesiólogo, obtener sus turnos con los pacientes
elseif (in_array($role, ['medico', 'psicologo', 'kinesiologo'])) {
    $sql2 = "SELECT id FROM profesional WHERE id_user = ?";
    $stmt2 = $conn->prepare($sql2);
    $stmt2->bind_param("i", $user_id);
    $stmt2->execute();
    $result2 = $stmt2->get_result();

    if ($result2->num_rows > 0) {
        $row = $result2->fetch_assoc();
        $id_profesional = $row['id'];

        $sql = "SELECT t.id, t.fecha_hora, t.estado, 
       CONCAT(p.nombre, ' ', p.apellido) AS 'profesional', 
       p.especialidad
FROM turno t
JOIN profesional p ON t.id_profesional = p.id
WHERE t.id_paciente = ?";
        $stmt = $conn->prepare($sql);
        $stmt->bind_param("i", $id_profesional);
    } else {
        echo 'No se encontró un profesional asociado al usuario.';
        $stmt = null;
    }
} else {
    echo "Rol no válido.";
    exit();
}

if ($stmt) {
    $stmt->execute();
    $result = $stmt->get_result();
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mis Turnos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1>Mis Turnos</h1>

        <?php if ($role === 'paciente') { ?>
            <a href="agregar_turno.php" class="btn btn-success mb-3">Agregar Turno</a>
        <?php } ?>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Fecha y hora</th>
                    <th>Estado</th>
                    <?php if ($role === 'paciente') { ?>
                        <th>Profesional</th>
                        <th>Especialidad</th>
                    <?php } else { ?>
                        <th>Nombre Paciente</th>
                        <th>Apellido Paciente</th>
                        <th>Obra Social</th>
                        <th>N° Credencial</th>
                    <?php } ?>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <?php if ($result && $result->num_rows > 0) { ?>
                    <?php while ($row = $result->fetch_assoc()) { 
    // print_r($row);  // Para ver exactamente qué devuelve
    // echo "Profesional: " . $row['profesional'] . "<br>"
                        ?>

                        <tr>
                            <td><?= htmlspecialchars($row['fecha_hora']); ?></td>
                            <td><?= htmlspecialchars($row['estado']); ?></td>

                            <?php if ($role === 'paciente') { ?>
                                <td><?= htmlspecialchars($row['profesional']); ?></td>
                                <td><?= htmlspecialchars($row['especialidad']); ?></td>
                            <?php } else { ?>
                                <td><?= htmlspecialchars($row['nombre_paciente']); ?></td>
                                <td><?= htmlspecialchars($row['apellido_paciente']); ?></td>
                                <td><?= htmlspecialchars($row['obra_social']); ?></td>
                                <td><?= htmlspecialchars($row['nro_credencial']); ?></td>
                            <?php } ?>

                            <td>
                                <form method="POST" style="display:inline;">
                                    <input type="hidden" name="turno_id" value="<?= $row['id']; ?>">
                                    <input type="hidden" name="action" value="cancelar">
                                    <button type="submit" class="btn btn-danger">Cancelar turno</button>
                                </form>
                                <?php if ($role === 'paciente') { ?>
                                    <form action="reprogramar_turno.php" method="GET" style="display:inline;">
                                        <input type="hidden" name="turno_id" value="<?= $row['id']; ?>">
                                        <button type="submit" class="btn btn-primary">Reprogramar turno</button>
                                    </form>
                                    <form action="confirmar_turno.php" method="POST" style="display:inline;">
                                        <input type="hidden" name="turno_id" value="<?= $row['id']; ?>">
                                        <button type="submit" class="btn btn-success">Confirmar turno</button>
                                    </form>
                                <?php } ?>
                            </td>
                        </tr>
                    <?php } ?>
                <?php } else { ?>
                    <tr>
                        <td colspan="<?= $role === 'paciente' ? '5' : '7'; ?>" class="text-center">No se encontraron turnos.</td>
                    </tr>
                <?php } ?>
            </tbody>
        </table>
    </div>
</body>
</html>

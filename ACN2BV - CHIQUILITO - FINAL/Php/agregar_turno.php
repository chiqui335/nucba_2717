<?php
session_start();
if (!isset($_SESSION['role']) || $_SESSION['role'] !== 'paciente') {
    header('Location: login.php');
    exit();
}

include 'Database.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST' && isset($_POST['buscar_profesionales'])) {
    $fecha = $_POST['fecha'];
    $hora = $_POST['hora'];
    $especialidad = $_POST['especialidad'];

    // Buscar profesionales disponibles en la base de datos
    $sql = "SELECT p.id, p.nombre 
            FROM profesional p
            INNER JOIN turno t ON p.id = t.id_profesional
            WHERE p.especialidad = ? 
            AND NOT EXISTS (
                SELECT 1 FROM turno WHERE id_profesional = p.id AND fecha_hora = ?
            )";

    $stmt = $conn->prepare($sql);
    $fecha_hora = $fecha . ' ' . $hora;
    $stmt->bind_param("ss", $especialidad, $fecha_hora);
    $stmt->execute();
    $result = $stmt->get_result();
    $profesionales_disponibles = $result->fetch_all(MYSQLI_ASSOC);

    $stmt->close();
    $conn->close();
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Turno</title>
</head>
<body>
    <div>
        <h1>Buscar Profesionales Disponibles</h1>
        <form method="POST" action="agregar_turno.php">
            <div>
                <label for="fecha">Fecha</label>
                <input type="date" name="fecha" required>
            </div>
            <div>
                <label for="hora">Hora</label>
                <select name="hora" required> 
                    <?php
                    for ($h = 0; $h < 24; $h++) {
                        for ($m = 0; $m < 60; $m += 30) {
                            $hour = str_pad($h, 2, "0", STR_PAD_LEFT);
                            $minute = str_pad($m, 2, "0", STR_PAD_LEFT);
                            $time = "$hour:$minute";
                            echo "<option value=\"$time\">$time</option>";
                        }
                    }
                    ?>
                </select>
            </div>
            <div>
                <label for="especialidad">Especialidad</label>
                <input type="text" name="especialidad" required>
            </div>
            <button type="submit" name="buscar_profesionales">Buscar Profesionales</button>
        </form>
    </div>

    <?php if (isset($profesionales_disponibles)): ?>
        <div>
            <h2>Profesionales Disponibles</h2>
            <form method="POST" action="confirmar_turno.php">
                <input type="hidden" name="fecha_hora" value="<?= htmlspecialchars($fecha_hora) ?>">
                <input type="hidden" name="especialidad" value="<?= htmlspecialchars($especialidad) ?>">
                <select name="profesional_id" required>
                    <?php foreach ($profesionales_disponibles as $profesional): ?>
                        <option value="<?= $profesional['id'] ?>"><?= htmlspecialchars($profesional['nombre']) ?></option>
                    <?php endforeach; ?>
                </select>
                <button type="submit" name="confirmar_turno">Confirmar Turno</button>
            </form>
        </div>
    <?php endif; ?>
</body>
</html>


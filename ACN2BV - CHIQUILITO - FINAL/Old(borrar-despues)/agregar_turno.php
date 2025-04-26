<!-- agregar_turno.php -->
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

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $fecha = $_POST['fecha'];
    $hora = $_POST['hora'];
    $profesional = $_POST['profesional'];
    $especialidad = $_POST['especialidad'];


    // $sql_check = "SELECT id FROM paciente WHERE id = ?";
    // $stmt_check = $conn->prepare($sql_check);
    // $stmt_check->bind_param("i", $_SESSION['id']);
    // $stmt_check->execute();
    // $stmt_check->store_result();
    
    // if ($stmt_check->num_rows == 0) {
    //     echo "El paciente con ID " . $_SESSION['id'] . " no existe en la base de datos.";
    //     exit();
    // }
    
    // $stmt_check->close();

    $fecha_hora = $fecha . ' ' . $hora;


    // Obtener el id_paciente a partir de id_user
    $sql_check = "SELECT id FROM paciente WHERE id_user = ?";
    $stmt_check = $conn->prepare($sql_check);
    $stmt_check->bind_param("i", $_SESSION['id']);
    $stmt_check->execute();
    $stmt_check->store_result();

    // Obtener el id del paciente
    $stmt_check->bind_result($id_paciente);
    $stmt_check->fetch();
    $stmt_check->close();


    // Verificar si el profesional existe en la base de datos
    $sql_profesional_check = "SELECT id FROM profesional WHERE nombre = ?";
    $stmt_profesional_check = $conn->prepare($sql_profesional_check);
    $stmt_profesional_check->bind_param("s", $profesional);
    $stmt_profesional_check->execute();
    $stmt_profesional_check->store_result();

    if ($stmt_profesional_check->num_rows == 0) {
        echo "El profesional '$profesional' no existe en la base de datos.";
        exit();
    }

    // Obtener el id del profesional
    $stmt_profesional_check->bind_result($id_profesional);
    $stmt_profesional_check->fetch();
    $stmt_profesional_check->close();


    // Insertar nuevo turno en la base de datos
    $sql = "INSERT INTO turno (id_paciente, id_profesional, fecha_hora, nombre_y_apellido_profesional, especialidad) VALUES (?, ?, ?, ?, ?)";
    $stmt = $conn->prepare($sql);
    $stmt->bind_param("iisss", $id_paciente, $id_profesional, $fecha_hora, $profesional, $especialidad);
    
    if ($stmt->execute()) {
        echo "Turno agregado exitosamente.";
        header("Location: panel_de_control.php");
    } else {
        echo "Error al agregar el turno.";
    }

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
        <h1>Agregar Nuevo Turno</h1>
        <form method="POST" action="agregar_turno.php">
            <div>
                <label for="fecha">Fecha</label>
                <input type="date" name="fecha" required>
            </div>
            <div>
                <label for="hora">Hora</label>
                <select name="hora" id="hora" required> 
                    <?php //AGREGAR FUNCIONALIDAD
                    // Generamos las opciones de hora en intervalos de 30 minutos
                    for ($h = 0; $h < 24; $h++) {
                        for ($m = 0; $m < 60; $m += 30) {
                            // Formateamos la hora y los minutos para que siempre tenga 2 dígitos
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
                <label for="profesional">Profesional</label>
                <input type="text" name="profesional" required>
            </div>
            <div>
                <label for="especialidad">Especialidad</label>
                <input type="text" name="especialidad" required>
            </div>
            <button type="submit">Agregar Turno</button>
        </form>
    </div>
</body>
</html>

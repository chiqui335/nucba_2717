<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "desafio5";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

//consulta para obtener todas las entradas
$sql = "SELECT id, titulo, contenido, categoria, autor, fecha FROM entradas";
$result = $conn -> query($sql);

if ($result->num_rows > 0) {
    // Mostrar cada entrada
    while($row = $result->fetch_assoc()) {
        echo "ID: " . $row["id"]. " - Título: " . $row["titulo"]. " - Autor: " . $row["autor"]. " - Fecha: " . $row["fecha"]. "<br>";
        echo "Categoría: " . $row["categoria"] . "<br>";
        echo "Contenido: " . $row["contenido"] . "<br><br>";
    }
} else {
    echo "No se encontraron entradas.";
}

$conn->close();
?>
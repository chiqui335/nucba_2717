<?php
// index.php
session_start(); // Inicia la sesión si la necesitas para manejo de usuarios.

?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
    <link rel="stylesheet" href=""> <!-- Opcional: Vincula un archivo CSS -->
</head>
<body>
    <header>
        <h1>Bienvenido a Mi Aplicación</h1>
        <nav>
            <ul>
                <li><a href="index.php">Inicio</a></li>
                <li><a href="about.php">Sobre Nosotros</a></li>
                <li><a href="contact.php">Contacto</a></li>
                <?php if (isset($_SESSION['user'])): ?>
                    <li><a href="logout.php">Cerrar Sesión</a></li>
                <?php else: ?>
                    <li><a href="./Html/Login.html">Iniciar Sesión</a></li>
                <?php endif; ?>
                <li><a href="./Html/Register.html">Registro</a></li>
            </ul>
        </nav>
    </header>

    <main>
        <h2>Inicio</h2>
        <p>Este es el contenido principal de la página de inicio.</p>
        <?php if (isset($_SESSION['user'])): ?>
            <p>¡Hola, <?= htmlspecialchars($_SESSION['user']); ?>! Bienvenido de nuevo.</p>
        <?php else: ?>
            <p>Inicia sesión para acceder a más funciones.</p>
        <?php endif; ?>
    </main>

    <footer>
        <p>&copy; 2024 Mi Aplicación. Todos los derechos reservados.</p>
    </footer>
</body>
</html>

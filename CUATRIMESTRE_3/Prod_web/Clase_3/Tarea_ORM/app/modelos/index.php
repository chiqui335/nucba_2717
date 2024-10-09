<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="pj" href="modelos/Personaje.php">
    <link rel="cnx" href="modelos/Cnx.php">
    <title>Document</title>
</head>
<body>
<h2>Crear Nuevo Personaje</h2>
    <form action="crear_personaje.php" method="post">
        <label for="nombre">Nombre:</label><br>
        <input type="text" id="nombre" name="nombre" required><br><br>
        
        <label for="ataque">Ataque:</label><br>
        <input type="number" id="ataque" name="ataque" required><br><br>
        
        <label for="defensa">Defensa:</label><br>
        <input type="number" id="defensa" name="defensa" required><br><br>

        <label for="curar">Curar personaje</label>
        <input type="checkbox" name="curar" id="curar"><br><br>
        
        <input type="submit" value="Crear Personaje">
    </form>

    <div>
        <h3>Personajes Creados:</h3>
        <?php
            include'modelos/Cnx.php';
            $cnx = new Cnx();
            $personajes = $cnx->getPersonajes();
    </div>
</body>
</html>
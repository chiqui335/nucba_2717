<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        
        <input type="submit" value="Crear Personaje">
    </form>
</body>
</html>
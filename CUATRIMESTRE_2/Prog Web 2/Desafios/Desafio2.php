<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conversor de Temperatura</title>
</head>
<body>
    <h1>Conversor de Temperatura</h1>
    <form method="post" action="">
        <label for="celsius">Ingrese la temperatura en Celsius:</label>
        <input type="text" id="celsius" name="celsius" required>
        <button type="submit">Convertir</button>
    </form>

    <?php

        // Obtener la temperatura ingresada por el usuario
        $celsius = $_POST["celsius"];

        // Convertir la temperatura a Fahrenheit
        $fahrenheit = $celsius * 9/5 + 32;

        // Determinar si la temperatura es fría, templada o caliente
        if ($celsius < 10) {
            $temperatura = 'fría';
        } elseif ($celsius >= 10 && $celsius <= 25) {
            $temperatura = 'templada';
        } else {
            $temperatura = 'caliente';
        }

        // Mostrar resultados
        echo "<p>La temperatura ingresada es $celsius °C.</p>";
        echo "<p>La temperatura convertida es $fahrenheit °F.</p>";
        echo "<p>La temperatura ingresada es $temperatura.</p>";
    
    ?>
</body>
</html>

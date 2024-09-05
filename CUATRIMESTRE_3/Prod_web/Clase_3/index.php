<?php

require_once 'modelos/Conexion.php';

$conn = new PDO(
    //datos de la db
    //nombre del que se conecta a la db (no usuario de applicacion)
    //contraseña
    'mysql:host=localhost;dbname=clase3;charset=utf8',
    'root',
    ''
);

//lo de arriba nos devuelve un objeto para la base de datos

//por lo tanto deberia hacerse en un try catch por si falla que salte una exception

//(si quiero testear usar uno solo de los bloques)  

try {
    $conn = new PDO(
        //datos de la db
        //nombre del que se conecta a la db (no usuario de applicacion)
        //contraseña
        'mysql:host=localhost;dbname=clase3;charset=utf8',
        'root',
        ''
    );

    $conn2 = new PDO(
        'mysql:host=localhost;dbname=clase3;charset=utf8',
        'root',
        ''
    );

    $conn3 = new PDO(
        'mysql:host=localhost;dbname=clase3;charset=utf8',
        'root',
        ''
    );

    //si utilizo conexion.php (para usar singleton) puedo ponerlo asi:
    $conn = Conexion::getInstance(); //uso una misma conexion para distintas queries
    $conn2 = Conexion::getInstance();
    $conn3 = Conexion::getInstance();
    //las 3 conexiones apuntan a la misma unidad de memoria (private static $db = null de conexion.php)
    //es la misma conexion de manera referenciada
} catch (PDOException $e){
    echo "Connection failed: ". $e->getMessage(); //print del msg de error con getMessage()
    exit(); //salgo de la conexion
}

//hago mi consulta
$consulta = $conn->query('
    SELECT id, nombre, ataque, defensa, vidas 
    FROM personajes
');

$defensa = $_POST['defensa'];

//rehacemos la consulta teniendo en cuenta la seguridad
$consulta = $conn->prepare('
    SELECT id, nombre, ataque, defensa, vidas 
    FROM personajes
    WHERE defensa = :defensa
');

//bindvalue lo que hace es que si encuentra caracteres maliciosos los elimina
$consulta->bindValue(':defensa', $defensa);

$consulta->execute();

while($fila = $consulta->fetch()){
    echo '<pre>';
    var_dump($fila);

    echo "{$fila['id']} - {$fila['nombre']} <br>";
}



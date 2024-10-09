<?php

require_once 'modelos/Conexion.php';

try {
    $conn = Conexion::getInstance();
        
} catch (PDOException $e){
    echo "Connection failed: ". $e->getMessage(); //print del msg de error con getMessage()
    exit(); //salgo de la conexion
}

Conexion::close();

//ORM objeto relacion mapeo (Object Relational Mapping)

<?php

require_once 'modelos/Cnx.php';
require_once 'modelos/Personaje.php';

try {
    // $personaje = Personaje::crear('chapulin', 30, 25);
        
    // echo "se creo un pj con el id: {$personaje->getId()}"; //si o si tiene que ir entre {}

    //para buscar un pj
    // $personaje = Personaje::buscar(2);// busco el pj con id 2
    // if ($personaje) {
    //     echo "Se recupero el registro del personaje: {$personaje->getNombre()}";
    //     $personaje->setNombre('hulk'); //le cambio el nombre
    //     $personaje->modificar(); //llamo al metodo para modificar el nombre del registro con ID 2
    //     echo "Se modifico el registro del personaje: {$personaje->getNombre()}";
    //     $personaje->curar();
    //     echo "{$personaje->getNombre()} esta curado";
    // } else{
    //     echo "No se encontro el personaje"; 

    $personaje = Personaje::todos(); // me devuelve un array de OBJETOS
    foreach($personajes as $personaje){
        
    }
} catch (PDOException $e){
    echo "Connection failed: ". $e->getMessage(); //print del msg de error con getMessage()
    exit(); //salgo de la conexion
}

Conexion::close();

//ORM objeto relacion mapeo (Object Relational Mapping)
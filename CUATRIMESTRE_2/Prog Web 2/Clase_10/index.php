<?php

// almaceno en variables los parametros para conectarnos a la database (db)
$servidor = "localhost"; //servidor
$usuario = "root";  //usuario del motor de la db
$password = ""; //contraseña del usuario
$database = "davinci"; //database
$port = "3306";

//me conecto a la db: 

$conexion = mysqli_connect($servidor, $usuario, $password, $database, $port); //los primeros 4 datos son obligatorios sino no se conecta 

//verifico si la conexion fue exitosa
if($conexion){
    echo "conexion exitosa <br>";
} else {
    echo "no se pudo conectar:  <br>" . mysqli_connect_error(); //en la version 7 no te describia el error, en la version 8 si
}

// //conecto a la db pero como un objeto (ORIENDADO A OBJETOS)
// $conexion = new mysqli($servidor, $usuario, $password, $database, $port);

// if($conexion->connect_error){
//     die("error en la conexion" . mysqli_connect_error());
// } else {
//     echo "conexion exitosa";
// }

//conectar pero con PDO



// // TRY CATCH SE USA PARA MANEJAR EXCEPCIONES ESPECIFICAMENTE
// try { 
//     $conexion = new PDO("mysql:host=$servidor; dbname= $database", $usuario, $password);

//     //se establece un modo error EN CASO QUE PDO genere una excepcion
//     $conexion->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

//     echo "conexion exitosa";

// } catch (PDOException $e) { //pdoexception maneja mejor el mostrar la info cuando hay una excepción
//     echo "Error: " . $e->getMessage();
// }

//Consulto la tabla alumnos

$consulta = "SELECT * FROM alumnos";

$resultado = mysqli_query($conexion, $consulta);

if(mysqli_num_rows($resultado) > 0){
    // se hace algo
    while( $row = mysqli_fetch_assoc($resultado)){
        echo "Name: " . $row['Name']. "Type". $row['Type'] ."Null". $row['Null'] . "<br>";
    }
} else {
    echo "No se encontraron registros en la tabla"; 
}

//PROBAR CON LA DB EXAMENES DE BASE DE DATOS 1

?>
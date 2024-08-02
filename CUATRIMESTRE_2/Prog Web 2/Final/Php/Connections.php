<?php

    $server = "localhost";
    $user = "root";
    $pass = "root";
    $database = "web2_db";


    //creo la conexion a la db
    $con = new mysqli($server, $user, $pass, $database);

    //pruebo la conexion 
    if ($con->connect_error){
        die("Connection failed: " . $con->connect_error);
    } else {
        echo "Connected successfully";
    }


    
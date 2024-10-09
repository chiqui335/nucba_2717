<?php

if ($_SERVER ["REQUEST_METHOD"] == "POST") {
    
    //datos que se envían por POST
    $name = trim($_POST['name']);
    $atk = $_POST['atk'];
    $def = $_POST['def'];

    $char = [
        'name' => $name,
        'atk' => $atk,
        'def' => $def
    ];

    //almacenar el pj en la sesion
    if (!isset($_SESSION['characters'])){
        $_SESSION['characters'] = [];
    }
    $_SESSION['characters'][] = $char;
    

}
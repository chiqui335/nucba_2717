<?php

echo "hola";

if ($_SERVER ["REQUEST_METHOD"] == "POST" ){ //es conveniente que la info que viene por post se almacene en una variable
    $variableEdad = $_POST["edad"];
}

$_POST;
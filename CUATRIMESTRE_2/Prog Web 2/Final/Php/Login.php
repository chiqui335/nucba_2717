<?php

session_start();
require 'connections.php';

if($_SERVER['REQUEST_METHOD'] == 'POST'){
    if(isset($_POST['username']) && $_POST['username'] != null && isset($_POST['password']) && $_POST['password'] != null){
        $username = htmlspecialchars(trim(stripslashes($_POST['username'])));
        $password = htmlspecialchars(trim(stripslashes($_POST['password']))); 

        

    }
}



<?php

class Cnx
{

    private static ?PDO $db = null;
    
    private function __construct()
    {
        //
    }

    public static function getInstance():?PDO
    {
        if(is_null(self::$db)){
            self::$db = new PDO('mysql:host=localhost;dbname=clase3;charset=utf8;port=3306', 'root', '');
        }
        return self::$db;
    }

    public static function close():void
    {
        self::$db = null;
    }


}
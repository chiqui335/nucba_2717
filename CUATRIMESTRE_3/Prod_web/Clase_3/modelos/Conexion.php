<?php

class conexion {

    private static $db = null; //aca se guarda la conexion a la DB

    private function __construct()
    {
        
    }

    //metodo estatico para getear una instancia, devuelve un PDO (una clase PDO)
    public static function getInstance():PDO{
        if ( is_null(self::$db) ){
            //si $db es = a null se crea una nueva conexion
            self::$db = new PDO(
                'mysql:host=localhost;dbname=db_prueba', 
                'root', 
                '');
        } // "else" no se crea una nueva conexion porque ya hay una
        return self::$db; // se retorna el objeto
    }

    //metodo para liberar la memoria
    public static function close():void{
        self::$db = null;
    }

}
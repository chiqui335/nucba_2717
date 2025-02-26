<?php

class Database {
    private static $instance = null;
    private $conn;
    private $host = 'localhost';
    private $user = 'root';
    private $password = '';
    private $dbname = 'pw2_db';

    private function __construct() {
        $this->conn = new mysqli($this->host, $this->user, $this->password, $this->dbname, 3306);

        if ($this->conn->connect_error) {
            die("Conexión fallida: " . $this->conn->connect_error);
        }
    }

    public static function obtenerInstancia() {
        if (self::$instance == null) {
            self::$instance = new Database();
        }
        return self::$instance;
    }

    public function obtenerConexion() {
        return $this->conn;
    }
}

// se usa getInstance() en cada script
?>


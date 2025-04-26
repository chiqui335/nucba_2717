<?php
class Profesional extends User {
    private $especialidad;
    private $matricula;

    public function __construct($username, $password, $email, $role, $db, $especialidad, $matricula, $nombre, $apellido){
        parent::__construct($username, $password, $email, $role, $db, $nombre, $apellido);

        $this->especialidad = $especialidad;
        $this->matricula = $matricula;
    }

    public function getEspecialidad(){
        return $this->especialidad;
    }

    public function setEspecialidad($especialidad){
        $this->especialidad = $especialidad;
    }

    public function getMatricula(){
        return $this->matricula;
    }

    public function setMatricula($matricula){
        $this->matricula = $matricula;
    }

    //metodos/funciones de profesional

    
}

?>
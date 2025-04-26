<?php
class Paciente extends User {
    private $fecha_nacimiento;
    private $telefono;
    private $direccion;
    private $OS;
    private $nro_credencial;

    public function __construct($username, $password, $email, $role, $db, $fecha_nacimiento, $telefono, $direccion, $OS, $nro_credencial, $nombre, $apellido) {
        parent::__construct($username, $password, $email, $role, $db, $nombre, $apellido);

        $this->fecha_nacimiento = $fecha_nacimiento;
        $this->telefono = $telefono;
        $this->direccion = $direccion;
        $this->OS = $OS;
        $this->nro_credencial = $nro_credencial;
    }

    // Getters y setters de paciente
    public function getFechaNacimiento() {
        return $this->fecha_nacimiento;
    }

    public function setFechaNacimiento($fecha_nacimiento) {
        $this->fecha_nacimiento = $fecha_nacimiento;
    }

    public function getTelefono() {
        return $this->telefono;
    }

    public function setTelefono($telefono) {
        $this->telefono = $telefono;
    }

    public function getDireccion() {
        return $this->direccion;
    }

    public function setDireccion($direccion) {
        $this->direccion = $direccion;
    }

    public function getOS() {
        return $this->OS;
    }

    public function setOS($OS) {
        $this->OS = $OS;
    }

    public function getNroCredencial() {
        return $this->nro_credencial;
    }

    public function setNroCredencial($nro_credencial) {
        $this->nro_credencial = $nro_credencial;
    }


    //metodos/funciones de paciente
    public function getDatosPaciente() {
        $sql = "SELECT * FROM paciente";
        $result = $this->db->query($sql);
        
        $data = [];
        
        if ($result->num_rows > 0) {
            while($row = $result->fetch_assoc()) {
                $data[] = $row;
            }
        }
        return $data;
    }
}


?>
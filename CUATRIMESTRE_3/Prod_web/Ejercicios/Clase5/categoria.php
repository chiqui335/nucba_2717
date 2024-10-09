<?php

class categoria {
    private $conn;

    public function __construct($conn) {
        $this->conn = $conn;
    }

    public function guardarCategoria($nombre) {
        $sql = "INSERT INTO categoria (nombre) VALUES (?)";
        $stmt = $this->conn->prepare($sql);
        $stmt->bind_param("s", $nombre);

        if ($stmt->execute()){
            return "categoría creada con exito";
        } else{
            return "Error al crear la categoría: ". $this->conn->error;
        }
    }

    public function actualizarCategoria($id, $nombre){
        $sql = "UPDATE categoria SET nombre=? WHERE id=?";
        $stmt = $this->conn->prepare($sql);
        $stmt->bind_param("si", $nombre, $id);
        
        if ($stmt->execute()) {
            return "categoría actualizada con éxito.";
        } else {
            return "Error al actualizar la categoría: " . $this->conn->error;
        }
    }

    public function borraCategoria($id) {
        $sql = "DELETE FROM categoria WHERE id=?";
        $stmt = $this->conn->prepare($sql);
        $stmt->bind_param("i", $id);

        if ($stmt->execute()) {
            return "categoría borrada con éxito.";
        } else {
            return "Error al borrar la categoría: ". $this->conn->error;
        }
    }

    public function listarCategoria(){
        $sql = "SELECT * FROM entradas";
        $result = $this->conn->query($sql);

        $entrada = [];
        if ($result->num_rows > 0) {
            while($row = $result->fetch_assoc()) {
                $entrada[] = $row;
            }
        }
        return $entrada;
    }

    public function obtenerCategoriaPorId($id){
        $sql = "SELECT * FROM categoria WHERE id = ?";
        $stmt = $this->conn->prepare($sql);
        $stmt->bind_param("i", $id);
        $stmt->execute();
        $result = $stmt->get_result();

        if ($result->num_rows > 0){
            return $result->fetch_assoc();
        } else {
            return null;
        }
    }

}
<?php

class Entrada {
    private $conn;

    public function __construct($conn) {
        $this->conn = $conn;
    }

    public function guardarEntrada($titulo, $contenido, $categoria, $autor) {
        $sql = "INSERT INTO entradas (titulo, contenido, categoria, autor) VALUES (?, ?, ?, ?)";
        $stmt = $this->conn->prepare($sql);
        $stmt->bind_param("ssss", $titulo, $contenido, $categoria, $autor);

        if ($stmt->execute()){
            return "entrada creada con exito";
        } else{
            return "Error al crear la entrada: ". $this->conn->error;
        }
    }

    public function actualizarEntrada($id, $titulo, $contenido, $categoria, $autor){
        $sql = "UPDATE entradas SET titulo=?, contenido=?, categoria=?, autor=? WHERE id=?";
        $stmt = $this->conn->prepare($sql);
        $stmt->bind_param("ssssii", $titulo, $contenido, $categoria, $autor, $id);
        
        if ($stmt->execute()) {
            return "Entrada actualizada con éxito.";
        } else {
            return "Error al actualizar la entrada: " . $this->conn->error;
        }
    }

    //borrar una entrada por id
    public function borraEntrada($id) {
        $sql = "DELETE FROM entradas WHERE id=?";
        $stmt = $this->conn->prepare($sql);
        $stmt->bind_param("i", $id);

        if ($stmt->execute()) {
            return "Entrada borrada con éxito.";
        } else {
            return "Error al borrar la entrada: ". $this->conn->error;
        }
    }

    //mostrar las entradas
    public function listarEntrada(){
        $sql = "SELECT id, titulo, contenido, categoria, autor, fecha FROM entradas";
        $result = $this->conn->query($sql);

        $entrada = [];
        if ($result->num_rows > 0) {
            while($row = $result->fetch_assoc()) {
                $entrada[] = $row;
            }
        }
        return $entrada;
    }

    
    public function obtenerEntradaPorId($id){
        $sql = "SELECT * FROM entradas WHERE id = ?";
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
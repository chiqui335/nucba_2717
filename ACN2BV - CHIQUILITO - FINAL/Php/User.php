<?php
class User {

    protected $username;
    protected $password;
    protected $email;
    protected $role;
    protected $db;
    protected $nombre;
    protected $apellido;

    //constructor
    public function __construct($username, $password, $email, $role, $db, $nombre, $apellido) {

        $this->username = $username;
        $this->password = $password;
        $this->email = $email;
        $this->role = $role;
        $this->db = $db;
        $this->nombre = $nombre;
        $this->apellido = $apellido;
    }

    // getters and setters

    // public function getId() {
    //     return $this->id;
    // }

    public function getUsername() {
        return $this->username;
    }

    public function setUsername($username) {
        $this->username = $username;
    }

    public function getPassword() {
        return $this->password;
    }

    public function setPassword($password) {
        $this->password = $password;
    }

    public function getEmail() {
        return $this->email;
    }

    public function setEmail($email) {
        $this->email = $email;
    }
    
    public function getRole() {
        return $this->role;
    }

    public function setRole($role) {
        $this->role = $role;
    }


    // Métodos ////////////////////////////
    public function sanitizar($input) {
        global $conn; // Usar la variable global de la conexión
        $input = trim($input);    // Eliminar espacios en blanco
        $input = stripslashes($input);    // Eliminar barras invertidas
        $input = htmlspecialchars($input, ENT_QUOTES, 'UTF-8'); // Evitar inyección de HTML/JavaScript
        $input = $conn->real_escape_string($input);    // Prevenir inyección SQL
        return $input;
    }

    private function startSession($user) {
        session_start();
        $_SESSION['id'] = $user['id'];
        $_SESSION['username'] = $user['username'];
        $_SESSION['role'] = $user['role'];
    }


    
    public function login($username, $password) {
        // Consulta para obtener la contraseña hasheada
        $query = "SELECT * FROM user WHERE username = ?";
        
        $stmt = $this->db->prepare($query);
        $stmt->bind_param("s", $username);
        $stmt->execute();
        
        $result = $stmt->get_result();

        // Verificar si el usuario existe
        if ($result->num_rows > 0) {
            $user = $result->fetch_assoc();

            // Verificar la contraseña ingresada contra el hash
            if (password_verify($password, $user['password'])) {
                $this->startSession($user);
                $this->redirectUser($user['role']);
            } else {
                return "Contraseña incorrecta.";
            }
        } else {
            return "Usuario no encontrado.";
        }

        $stmt->close(); // Cerrar el statement
        return null; // Retorno vacío si no hay errores
    }
    
    private function redirectUser($role) {
        switch ($role) {
            case 'administrador':
                header("Location: administrador.php");
                break;
            case 'profesional':
                header("Location: Profesional.php");
                break;
            default:
                header("Location: paciente.php");
                break;
        }
        exit;
    }

    //verificar si el user no esta en la db
    public function isUserExists($username, $email) {
        if (!($this->db instanceof mysqli)) {
            die("Error: Conexión a la base de datos no válida.");
        }   
    
        $stmt = $this->db->prepare("SELECT * FROM user WHERE username = ? OR email = ?");
        if ($stmt) {
            $stmt->bind_param("ss", $username, $email);
            $stmt->execute();
            $result = $stmt->get_result();
            
            if ($result) {
                $exists = $result->num_rows > 0;
                $stmt->close();
                return $exists;
            } else {
                echo "Error en get_result: " . $stmt->error;
            }
            $stmt->close();
        } else {
            echo "Error en prepare: " . $this->db->error;
        }
    
        return false;
    }
    

    //se inserta el user solo si no esta en la base de datos
    public function insertUser($username, $email, $password, $role) {
        $stmt = $this->db->prepare("INSERT INTO user (username, email, password, role) VALUES (?, ?, ?, ?)");
        $stmt->bind_param("ssss", $username, $email, $password, $role);
        $stmt->execute();
        
        $user_id = $stmt->insert_id;
        $stmt->close();

        echo "Usuario registrado con éxito.";
        return $user_id;
    }



    //insertar datos del paciente en la db
    public function insertarDatosPaciente($user_id, $fecha_nacimiento, $telefono, $direccion, $OS, $nro_credencial, $nombre, $apellido) {
        $stmt = $this->db->prepare(
            "INSERT INTO paciente (id_user, fecha_nacimiento, telefono, direccion, OS, nro_credencial, nombre, apellido) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

        $stmt->bind_param("isssssss", $user_id, $fecha_nacimiento, $telefono, $direccion, $OS, $nro_credencial, $nombre, $apellido);
        $stmt->execute();
        $stmt->close();
    }

    //insertar datos del psicologo en la db CAMBIAR EL NOMBRE DE LA TABLA DE PSICOLOGO A PROFESIONAL
    public function insertarDatosProfesional($user_id, $especialidad, $matricula, $role, $nombre, $apellido) {
        // Determinar el tipo basado en el rol
        $tipo = '';
        if ($role === 'psicologo') {
            $tipo = 'Psicólogo';
        } elseif ($role === 'medico') {
            $tipo = 'Médico';
        } elseif ($role === 'kinesiologo') {
            $tipo = 'Kinesiólogo';
        } else {
            // Manejo de error o asignación de un valor por defecto
            $tipo = 'Otro';
        }
    
        // Preparar e insertar los datos en la base de datos
        $stmt = $this->db->prepare(
            "INSERT INTO profesional (id_user, especialidad, matricula, tipo, nombre, apellido) VALUES (?, ?, ?, ?, ?, ?)"
        );
        
        $stmt->bind_param("isssss", $user_id, $especialidad, $matricula, $tipo, $nombre, $apellido);
        $stmt->execute();
        $stmt->close();
    }

    public function getTurnos($id_paciente) {
        $query = "SELECT * FROM turno WHERE id_paciente = ?";
        $stmt = $this->db->prepare($query);
        $stmt->bind_param("i", $id_paciente);
        $stmt->execute();
        $result = $stmt->get_result();
    
        $data = [];
        
        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()) {
                $data[] = $row;
            }
        }
        
        return $data;
    }
    
    // REVISAR
    // public function cancelarTurno($turno_id) {

    //     $sql = "UPDATE turno SET estado = 'cancelado' WHERE id = ? AND id_profesional = ?";
    //     $stmt = $this->db->prepare($sql);
    //     $stmt->bind_param("ii", $turno_id, $this->id);


    // }
    
    
    
}

?>

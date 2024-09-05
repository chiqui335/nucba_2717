<?php

class Personaje
{

    private ?int $id;
    private string $nombre;
    private int $ataque;
    private int $defensa;
    private int $vidas;

    private function __construct(string $nombre, int $ataque, int $defensa, int $vidas=3, int $id=null)
    {
        $this->id = $id;
        $this->nombre = $nombre;
        $this->ataque = $ataque;
        $this->defensa = $defensa;
        $this->vidas = $vidas;
    }

    public function getId():?int
    {
        return $this->id;
    }

    public function getNombre():string
    {
        return $this->nombre;
    }

    public function getVidas():int
    {
        return $this->vidas;
    }

    public function getAtaque():int
    {
        return $this->ataque;
    }

    public function getDefensa():int
    {
        return $this->defensa;
    }

    public function getAtaqueRand():int
    {
        return rand(0, $this->ataque);
    }

    public function getDefensaRand():int
    {
        return rand(0, $this->defensa);
    }

    public function setNombre(string $nombre):void
    {
        $this->nombre = $nombre;
    }

    public function setAtaque(int $ataque):void
    {
        $this->ataque = $ataque;
    }

    public function setDefensa(int $defensa):void
    {
        $this->defensa = $defensa;
    }

    public function restarVida():void
    {
        $this->vidas--;
    }

    public function curar():void
    {
        $this->vidas = 3;
    }

    private function atacar(Personaje $enemigo):bool
    {
        if($this->getAtaqueRand() > $enemigo->getDefensaRand()){
            $enemigo->restarVida();
            return true;
        }else{
            return false;
        }
    }

    private function defender(Personaje $enemigo):bool
    {
        if($this->getDefensaRand() >= $enemigo->getAtaqueRand()){            
            return true;
        }else{
            $this->restarVida();
            return false;
        }
    }

    public function pelear(Personaje $enemigo):bool
    {
        if(rand(1, 2) == 1){
            return $this->atacar($enemigo);
        }else{
            return $this->defender($enemigo);
        }
    }

    //funcion para meter pjs a la DB
    public static function crear(string $nombre, int $ataque, int $defensa, int $vidas=3):Personaje
    {
        $cnx = Cnx::getInstance(); //geteo la instancia cnx
        $consulta = $cnx->prepare(' 
            INSERT INTO personajes(nombre, ataque, defensa, vidas)
            VALUES(:nombre, :ataque, :defensa, :vidas)
        '); //preparo la consulta sql
        //inyecto para que sea pas seguro con bindvalue
        $consulta->bindValue(':nombre', $nombre);
        $consulta->bindValue(':ataque', $ataque);
        $consulta->bindValue(':defensa', $defensa);
        $consulta->bindValue(':vidas', $vidas);
        $consulta->execute();
        return new Personaje($nombre, $ataque, $defensa, $vidas, $cnx->lastInsertId()); //devuelve el objeto con el ultimo ID que se inserto
    }

    public static function buscar(int $id):?Personaje //devuelve el objeto personaje
    {
        $cnx = Cnx::getInstance();
        //Preparamos la consulta.
        $consulta = $cnx->prepare('
            SELECT id, nombre, ataque, defensa, vidas
            FROM personajes
            WHERE id = :id
        ');
        //Inyectamos las variables.
        $consulta->bindValue(':id', $id);
        //Ejecutamos la consulta.
        $consulta->execute();
        $fila = $consulta->fetch(PDO::FETCH_ASSOC); //Nos devuelve una sola fila en forma de array asociativo
        // var_dump($fila); para ver que me devuelve la fila
        if($fila){
            return new Personaje($fila['nombre'], $fila['ataque'], $fila['defensa'], $fila['vidas'], $fila['id']);
        }else{
            return null;
        }
    }

    public static function todos():array //devuelve todos los datos en un array asociativo
    {
        $cnx = Cnx::getInstance();
        $consulta = $cnx->query('
            SELECT id, nombre, ataque, defensa, vidas
            FROM personajes
        ');
        $personajes = []; //array vacio auxiliar
        while($fila = $consulta->fetch(PDO::FETCH_ASSOC)){ //aca se especifica el array asociativo
            $personajes[] = new self($fila['nombre'], $fila['ataque'], $fila['defensa'], $fila['vidas'], $fila['id']);
            //en cada vuelta le agrego una nueva posicion en el array con los datos que encuentra

            //otra forma de hacerlo: 
                //array_push(personajes, new self($fila['nombre'], $fila['ataque'], $fila['defensa'], $fila['vidas'], $fila['id']));
        }
        return $personajes;
    }

    public function modificar():void //NO ES STATIC PORQUE SI SE LLAMA DESDE EL OBJETO
    {
        $cnx = Cnx::getInstance();
        $consulta = $cnx->prepare('
            UPDATE personajes 
            SET
                nombre = :nombre,
                ataque = :ataque,
                defensa = :defensa,
                vidas = :vidas
            WHERE id = :id
        ');// TODO LO QUE PUEDA VENIR DE UN FORMULARIO SE PONE CON : 
        $consulta->bindValue(':nombre', $this->nombre);
        $consulta->bindValue(':ataque', $this->ataque);
        $consulta->bindValue(':defensa', $this->defensa);
        $consulta->bindValue(':vidas', $this->vidas);
        $consulta->bindValue(':id', $this->id);
        $consulta->execute();
    }

}
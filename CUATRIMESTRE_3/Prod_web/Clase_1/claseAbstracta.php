<?php

abstract class Mascota{
    protected string $name;

    public function __construct(string $name){
        $this->name = $name;
    }

    public function jugar():void{
        echo "{$this->name} esta jugando";
    }
}

class gato extends Mascota {
    public function maullar():void{
        echo "{$this->name} esta maullando";
    }
}

class perro extends Mascota {
    public function ladrar():void{
        echo "{$this->name} esta ladrando";
    }
}
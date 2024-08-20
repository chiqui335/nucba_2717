<?php

class Personaje {
    private String $nombre;
    private int $ataque;
    private int $defensa;
    private int $vidas;

    public function __construct($nombre, $ataque, $defensa) {
        $this->nombre = $nombre;
        $this->ataque = $ataque;
        $this->defensa = $defensa;
        $this->vidas = 3;
    }

    public function getNombre(): string{
        return $this->nombre;
    }

    public function getVidas(): int{
        return $this->vidas;
    }

    public function getAtaqueRand(): int{
        return rand(0, $this->ataque);
    }

    public function getDefRand(): int{
        return rand(0, $this->defensa);
    }

    public function restarVida():void{
        $this->vidas--;
        echo "se ha restado una vida a " . $this->nombre . "<br>    ";
    }

    public function curar(): void{
        $this->vidas = 3;
    }

    private function atacar(Personaje $enemigo): bool{
        if($this->getAtaqueRand() > $enemigo -> getDefRand()){
            $enemigo->restarVida();
            return true;
        } else {
            return false;
        }
    }

    
    private function defender(Personaje $enemigo){
        if ($this->getDefRand() >= $enemigo->getAtaqueRand()){
            echo "El personaje {$this->nombre} ha defendido <br>";
            return true;
        } else {
            echo "El personaje {$this->nombre} ha recibido ataque <br>";
            $this->restarVida();
            return false;
        }
    }

    public function pelear(Personaje $enemigo): bool{
        $rand = rand(1,2);

        if($rand == 1){
            return $this->atacar($enemigo);
        } else {
            return $this->defender($enemigo);
        }
    }
}
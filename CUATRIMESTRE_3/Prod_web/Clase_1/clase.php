<?php

class Estufa{
    //Propiedades/atributos
    private String $marca;
    private int $potencia;
    private bool $encendida;

    //pueden ser public, private o protected RECOMENDABLE QUE TANTO EN JAVA COMO EN PHP PRIVATE O PROTECTED

    //Metodos
    public function encenderEstufa():void { //function: le digo que es una funcion y el void es el return
        $this->encendida = true; //esto seria como el this.encendida EN JAVA
                                 //la flecha -> funciona como el punto .  
    }   

    public function apagarEstufa():void { 
        $this->encendida = false;
    }

    // public function __construct() { //Esto es lo que seria un constructor EN JAVA
    //     echo "Se creó un objeto de tipo estufa";
    // }

    // EN PHP NO HAY SOBRECARGA DE METODO NI DE CONSTRUCTOR
    // EN PHP HAY UN SOLO CONSTRUCTOR


    // SI NO SE USA, PHP AUTOMATICAMENTE LE ASIGNA LOS VALORES DE LOS ATRIBUTOS EN NULL
    // public function __construct($marca = null, $potencia = null, $encendida = null) pasaria ESTO

    // SIEMPRE SE RECOMIENDA USAR UN CONSTRUCTOR CON PARAMETROS
    public function __construct(string $marca, int $potencia, bool $encendida) { //Esto es lo que seria un constructor EN JAVA
        echo "Se creó un objeto de tipo estufa";
    }

    //En caso de querer algo "por defecto" se le da el valor en el mismo consructor
    //EJEMPLO: public function __construct(string $marca, int $potencia, bool $encendida=false)
    //En el ejemplo digo "si no me pones el parametro $encendida voy a dejarlo en false por defecto"
    
    public function setMarca (string $marca){ // tener cuidado con los setter, aca por ejemplo es ilogico cambiar la marca de la estufa xd
        $this->marca = $marca;
    }

    public function getMarca (): string{ //el return es un string
        return $this->marca;
    }

    public function setPotencia (int $potencia){
        if ($potencia > 4 && $potencia < 6){
            $this->potencia = $potencia;
        }
    }

    public function getPotencia (): int{ //el return es un int
        return $this->potencia;
    }

    public function setEncendida (bool $encendida){
        $this->encendida = $encendida;
    }

    public function getEncendida (): bool{ //el return es un boolean
        return $this->encendida;
    }
}
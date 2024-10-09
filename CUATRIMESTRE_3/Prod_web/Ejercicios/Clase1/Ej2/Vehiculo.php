<?php

abstract class Vehiculo {
    private int $cant_ruedas;
    private int $cant_puertas;

    public function __construct(int $cant_ruedas, int $cant_puertas){
        $this->cant_ruedas = $cant_ruedas;
        $this->cant_puertas = $cant_puertas;
    }

    
}
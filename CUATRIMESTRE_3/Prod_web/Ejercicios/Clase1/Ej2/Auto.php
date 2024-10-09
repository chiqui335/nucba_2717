<?php

class Auto extends Vehiculo {

    public function __construct(int $cant_puertas) {
        parent::__construct(4, $cant_puertas);
    }
}
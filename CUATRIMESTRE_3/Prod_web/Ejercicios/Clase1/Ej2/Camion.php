<?php

class Camion extends Vehiculo{

    public function __construct(int $cant_ruedas)
    {
        parent::__construct($cant_ruedas, 2);
    }
}
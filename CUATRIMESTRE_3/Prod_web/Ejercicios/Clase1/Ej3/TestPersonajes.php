<?php

require_once '../Ej1/Personaje.php';

class TestPersonaje {

    public static function simularPelea(Personaje $personaje1, Personaje $personaje2) {
        
        while ($personaje1->getVidas() > 0 && $personaje2->getVidas() > 0) {
            $personaje1->pelear($personaje2);
            if($personaje2->getVidas() > 0) {
                $personaje2->pelear($personaje1);
            }
        }

        //operador ternario si pj1 tiene mas de 0 vidas es true -> pj1 "else" -> pj2
        return $personaje1->getVidas() > 0 ? $personaje1 : $personaje2;  
    }

    public static function simularMultPelea(Personaje $personaje1, Personaje $personaje2, int $intentos):array {
        $winPj1 = 0;
        $winPj2 = 0;

        for ($i = 0; $i < $intentos; $i++) {
            $personaje1->curar();
            $personaje2->curar();

            $winner = self::simularPelea($personaje1, $personaje2);
            
            if ($winner === $personaje1) {
                $winPj1++;
            } else {
                $winPj2++;
            }
        }

        //calculo %
        $porcentajeWinPj1 = ($winPj1/$intentos) * 100;
        $porcentajeWinPj2 = ($winPj2/$intentos) * 100;        

        return [
            'peleas ganadas por PJ1' => $winPj1,
            'peleas ganadas por PJ2' => $winPj2,
            'porcentaje de victorias de PJ1' => $porcentajeWinPj1,
            'porcentaje de victorias de PJ2' => $porcentajeWinPj2,
        ];
    }

}
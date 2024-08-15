<?php

$pj1 = new Personaje("Pike", 80, 60);
$pj2 = new Personaje("Swordman", 60, 80);

for ($i = 0; $i < 3; $i++){

    $pj1->pelear($pj2);

}

if ($pj1->getVidas() > $pj2->getVidas()){
    echo "Ganador: ". $pj1->getNombre();
} else if ($pj1->getVidas() < $pj2->getVidas()){
    echo "Ganador: ". $pj2->getNombre();
} else {
    echo "Empate!";
}
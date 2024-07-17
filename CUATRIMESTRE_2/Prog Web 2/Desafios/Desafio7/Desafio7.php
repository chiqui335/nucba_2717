<?php


$notas = array(

    "e1" => "20",
    "e2" => "40",
    "e3" => "60",
    "e4" => "80",
    "e5" => "100",
);

$sum = array_sum($notas);
$count = count($notas);
$prom = $sum/$count;

echo $prom
?>
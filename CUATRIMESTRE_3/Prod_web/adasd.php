<?php

class Cliente{
    
public function documentoExistente(int $nroCliente): bool{
    //se verifica si el nroCliente existe en la base de datos
}
public function crear()
{
    //...
    if ($this->documentoExistente($this->nroCliente)) {
        throw new Exception("El número de cliente {$this->documento} ya está registrado.");
    }
    //...
}

try {
    $cliente1 = new Cliente(111222333, 'Mirtha Le petit', 'mirtha.lepetit@davinci.edu.ar');
    $cliente2 = new Cliente(989875754, 'Lionel Meza', 'lio.meza@davinci.edu.ar');
    $cliente3 = new Cliente(111222333, 'Hércules Rockefeller', 'hercules.rockefeller@davinci.edu.ar');
    
    $cliente1->crear();
    $cliente2->crear();
    $cliente3->crear();

    $cliente1->notificarCliente();
    $cliente2->notificarCliente();
    $cliente3->notificarCliente();

} catch (Exception $e) {
    echo $e->getMessage();
}
}

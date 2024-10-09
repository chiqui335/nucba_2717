<?php
	$cliente1 = new Cliente(111222333, 'Mirtha Le petit', 'mirtha.lepetit@davinci.edu.ar');
	$cliente2 = new Cliente(989875754, 'Lionel Meza', 'lio.meza@davinci.edu.ar');
	$cliente3 = new Cliente(111222333, 'Hércules Rockefeller', 'hercules.rockefeller@davinci.edu.ar');
	
	$cliente1->crear();
	$cliente2->crear();
	$cliente3->crear();
	
	$cliente1->notificarCliente();
	$cliente2->notificarCliente();
	$cliente3->notificarCliente();

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



	class Instrumento
	{
	    private string $nombre;
	    private int $cantidad_cuerdas;
	    public function __construct(string $nombre, int $cantidad_cuerdas)
	    {
	        $this->nombre = $nombre;
	        $this->cantidad_cuerdas = $cantidad_cuerdas;
	    }
	}

    class Guitarra extends Instrumento{

        public function __construct(string $nombre){
            parent::__construct($nombre, 6);
        }
    }

    class Flauta extends Instrumento{
        public function __construct(string $nombre){
            parent::__construct($nombre, 0);
        }
    }

    class Piano extends Instrumento{
        public function __construct(string $nombre, int $cantidad_cuerdas){
            parent::__construct($nombre, $cantidad_cuerdas);
        }
    }

    try {
        $pdo = new PDO('mysql:host=localhost;dbname=test;charset=utf8', 'root', '');
        $pdo->query('SELECT id, nombre FROM personas');
    }catch(PDOException $e){
        echo $e->getMessage();
    }



    


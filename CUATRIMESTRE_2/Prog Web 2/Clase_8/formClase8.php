<?php
//verifico que se este mandando la info de los input mediante post

if($_SERVER['REQUEST_METHOD'] == 'POST'){
    echo "se esta mandando por post <br>";

    if(isset($_POST['usuario']) && $_POST['usuario'] != null && isset($_POST['password']) && $_POST['password'] != null){
        // echo "se cargo el usuario <br>";

        //con trim saco los espacios (comentar estas 2 lineas si se testea)
        $clase8Usuario = trim($_POST['usuario']);
        $clase8Password = trim($_POST['password']); 

        //con stripslashes saco las barras diagonales (comentar estas 2 lineas si se testea)
        $sinBarraUsuario = stripslashes($clase8Usuario);
        $sinBarraPassword = stripslashes($clase8Password);

        //se puede combinar asi:
        $clase8Usuario = trim(stripslashes($_POST['usuario']));
        $clase8Password = trim(stripslashes($_POST['password'])); 

        //el htmlspecialchars lse agrega comillas (" o ') si detecta caracteres especiales
        //esto es para evitar la inyeccion de scripts
        $usuarioFinal = htmlspecialchars($clase8Usuario);
        $passwordfinal = htmlspecialchars($clase8Password);

        echo 'user: ' . $usuarioFinal . '<br>';
        echo 'pass: ' . $passwordfinal . '<br>';

        $dato1 = 12;
        $datoEscapado = htmlspecialchars($dato1);

        // var_dump($dato1);

        // echo '<br>';

        // var_dump($datoEscapado);


    } else {
        echo "usuario vacio <br>";
    }

}

// echo '<pre>';
// var_dump($_SERVER); // con esto puedo ver TODA LA INFO DEL SERVER
// echo '<pre>';
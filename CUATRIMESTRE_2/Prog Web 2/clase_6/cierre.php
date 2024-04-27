<?php

session_start();

session_destroy(); //destruye TODAS las sesiones abiertas

// 1° cierre de sesion voluntario
// 2° cierre por inactividad
// 3° cierre por cambio de privilegios

header('Location: i.html');

exit();
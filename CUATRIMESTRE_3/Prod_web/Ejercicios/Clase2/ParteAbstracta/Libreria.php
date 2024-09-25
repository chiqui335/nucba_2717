<?php

abstract class Libreria extends LibreriaAbs {
    public static function contarPalabras() {
        if (isset(self::$texto)) {
            return str_word_count(self::$texto);
        }
        return 0;
    }

    public static function setTexto($texto) {
        self::$texto = $texto;
    }

    public static function cortarTexto($longitud) {
        if (isset(self::$texto)) {
            return substr(self::$texto, 0, $longitud);
        }
        return 0;
    }
} 
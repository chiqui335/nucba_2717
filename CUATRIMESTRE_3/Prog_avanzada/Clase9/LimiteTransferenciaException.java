package CUATRIMESTRE_3.Prog_avanzada.Clase9;

//excepcion personalizada (NO verificada)

public class LimiteTransferenciaException extends RuntimeException {
    public LimiteTransferenciaException(String message) {
        super(message);
    }
}

package CUATRIMESTRE_3.Prog_avanzada.Clase9;

//excepcion personalizada (verificada)
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}

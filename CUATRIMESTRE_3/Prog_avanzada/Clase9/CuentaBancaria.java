package CUATRIMESTRE_3.Prog_avanzada.Clase9;

public class CuentaBancaria {
    private double saldo;
    private static final double LIMITE_TRANSFERENCIA = 10000;
        //esto es una constante (por el final), pertenece a la clase

    public CuentaBancaria (double saldo){
        this.saldo = saldo;
    }

    public void Depositar(double cantidad){
        saldo += cantidad;
        System.out.println("Deposito de " + cantidad + " realizado con exito, nuevo saldo: " + saldo);
    }

    public void Retirar(double cantidad)throws SaldoInsuficienteException{
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("saldo insuficiente. saldo actual: " + saldo);
        }
        saldo -= cantidad;
        System.out.println("Retiro de " + cantidad + " realizado con exito, nuevo saldo: " + saldo);
    }

    public void transferir(double cantidad) throws SaldoInsuficienteException, LimiteTransferenciaException{
        if (cantidad > LIMITE_TRANSFERENCIA) {
            throw new LimiteTransferenciaException("Limite de transferencia excedido de " + LIMITE_TRANSFERENCIA);
        }
        Retirar(cantidad);
        System.out.println("Transferencia de " + cantidad + " realizada con exito, nuevo saldo: " + saldo);
    }
        // LAS RUNTIMEEXCEPTION NO SON VERIFICABLES EL PROGRAMA SE HACE CARGO, LAS OTRAS (las definidas por mi) SI SON VERIFICABLES

}

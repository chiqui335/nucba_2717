package CUATRIMESTRE_2.POO.Modelo_parcial2;

public class Reserva {
    private int id;
    private String fechaEntrada;
    private String fechaSalida;
    private String tipoHabitacion;
    private Cliente cliente;


    //Constructor reserva
    public Reserva(){
        
    }

    public Reserva(int id, String fechaEntrada, String fechaSalida, String tipoHabitacion, Cliente cliente){
        this.id = id;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipoHabitacion = tipoHabitacion;
        this.cliente = cliente;
    }

    //setters y getters

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaSalida(){
        return fechaSalida;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    public String getTipoHabitacion(String tipoHabitacion) {
        return tipoHabitacion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente setCliente(){
        return cliente;
    }

    

}

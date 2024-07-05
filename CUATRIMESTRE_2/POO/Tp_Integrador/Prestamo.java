package CUATRIMESTRE_2.POO.Tp_Integrador;


public class Prestamo {
    private String idLibro;
    private String numSocio;
    private String date;

    Prestamo (String idLibro, String numSocio, String date){
        this.idLibro = idLibro;
        this.numSocio = numSocio;
        this.date = date;
    }

    //setters
    public void setIdLibro(String idLibro){
        this.idLibro = idLibro;
    }

    public void setNumSocio(String numSocio){
        this.numSocio = numSocio;
    }

    public void setDate(String date){
        this.date = date;
    }


    //getters
    public String getIdLibro() {
        return idLibro;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public String getDate() {
        return date;
    }

    
}

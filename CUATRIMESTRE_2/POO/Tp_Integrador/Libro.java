package CUATRIMESTRE_2.POO.Tp_Integrador;

public class Libro {
    private int id;
    private String name;
    private String author;
    private boolean available;
    private String localizacion;


    public Libro(int id, String name, String author, boolean available) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.available = available;
        // this.localizacion = localizacion;
    }

    //getters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //setters
    public void setLocalizacion(String localizacion){
        this.localizacion = localizacion;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isAvailable(){
        return available;
    }

    public String getLocalizacion(){
        return localizacion;
    }

    public void prestar(){
        this.available = false;
    }

}


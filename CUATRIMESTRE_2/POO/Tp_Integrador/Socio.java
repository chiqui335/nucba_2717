package CUATRIMESTRE_2.POO.Tp_Integrador;

public class Socio {
    private int id;
    private String name;
    private String address;
    private int numberOfBooks;
    // private boolean moreThan10Books;

    public Socio(int id, String name, String address, int numberOfBooks) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numberOfBooks = numberOfBooks;
    }

    //setters

    public void setNumeroSocio(int numeroSocio) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.name = name;
    }

    public void setDireccion(String direccion) {
        this.address = address;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    //getters
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }


    public void prestarLibro(Libro libro){
        if(this.getNumberOfBooks() >=10 ){
            System.out.println("Tenes el máximo del ibros a prestar");
        } else {
            if (libro.isAvailable()) {
                System.out.println("Se realizará el prestamo del libro ");
                libro.setAvailable(false);
				this.setNumberOfBooks(this.getNumberOfBooks()+1);
            } else {
                System.out.println("Libro no disponible");
            }
        }
    }

    
}

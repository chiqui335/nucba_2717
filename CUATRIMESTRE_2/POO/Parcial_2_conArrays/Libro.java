package CUATRIMESTRE_2.POO.Parcial_2_conArrays;

public class Libro {
    private int id;
    private String nombre;
    private String tipo;
    private String editorial;
    private int año;
    private Autor autor;

    // Constructor predeterminado

    public Libro() {
        this.id = 0;
        this.nombre = "desconocido";
        this.tipo = "desconocido";
        this.editorial = "desconocida";
        this.año = 0;
        this.autor = null;
    }

    // Constructor con parametros
    public Libro(int id, String nombre, String tipo, String editorial, int año, Autor autor) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.año = año;
        this.autor = autor;
    }

        public int getId(){
            return id;
        }

        public void setId(int id){
            this.id = id;
        }

        // Getter para nombre
        public String getNombre() {
            return nombre;
        }
    
        // Setter para nombre
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        // Getter para tipo
        public String getTipo() {
            return tipo;
        }
    
        // Setter para tipo
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        // Getter para editorial
        public String getEditorial() {
            return editorial;
        }
    
        // Setter para editorial
        public void setEditorial(String editorial) {
            this.editorial = editorial;
        }
    
        // Getter para año
        public int getAño() {
            return año;
        }
    
        // Setter para año
        public void setAño(int año) {
            this.año = año;
        }
    
        // Getter para autor
        public Autor getAutor() {
            return autor;
        }
    
        // Setter para autor
        public void setAutor(Autor autor) {
            this.autor = autor;
        }

        public String toString() {
            return "Datos Libro: " + '\n' +
                    "nombre= " + nombre + '\n' +
                    "tipo= " + tipo + '\n' +
                    "editorial= " + editorial + '\n' +
                    "año=" + año + '\n' +
                    autor;
        }
        
}

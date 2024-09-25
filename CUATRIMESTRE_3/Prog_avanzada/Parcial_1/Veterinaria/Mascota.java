package CUATRIMESTRE_3.Prog_avanzada.Parcial_1.Veterinaria;

import java.time.LocalDate;


public abstract class Mascota {
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected double peso;
    protected String especie;

    public Mascota(){
        // Constructor vacío para herencia y creación de objetos de tipo Mascota.
        this.nombre = "";
        this.fechaNacimiento = LocalDate.now();
        this.peso = 0.0;
        this.especie = "";
    }

    public Mascota(String nombre, LocalDate fechaNacimiento, double peso, String especie) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.especie = especie;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    //getters
    public String getEspecie(){
        return especie;
    }


    // public void datosMascota() {
    //     Scanner scM = new Scanner(System.in);

    //     System.out.println("Ingrese los datos de la mascota");
    //     System.out.println("Nombre de la mascota: ");
    //     String nombreMascota = scM.nextLine(); //probar si funciona asi
    //     this.setNombre(nombreMascota);

    //     System.out.println("Peso de la mascota (en kg): ");
    //     double pesoMascota = scM.nextInt();
    //     this.setPeso(pesoMascota);
    //     scM.nextLine();

    //     System.out.println("Fecha de nacimiento de la mascota (formato yyyy-MM-dd): ");
    //     LocalDate fechaNacimientoMascota = leerFechaNacimiento(scM);
    //     this.setFechaNacimiento(fechaNacimientoMascota);

    //     datosEspeficicos(scM);
    // }

    //public abstract void datosEspeficicos(Scanner scM);

    //recomendacion abstract
    public abstract String cuidadosRecomendacion();


    @Override
    public String toString() {
        return "Datos de la Mascota" + "\n" +
                "Nombre:" + nombre + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Peso: " + peso + "\n" +
                "Especie: " + especie + "\n" +
                "Recomendaciones de " + cuidadosRecomendacion() + "\n";
    }
}

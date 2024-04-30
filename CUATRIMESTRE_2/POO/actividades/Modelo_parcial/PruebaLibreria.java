package CUATRIMESTRE_2.POO.actividades.Modelo_parcial;

public class PruebaLibreria {
    public static void main(String[] args) {

        Autor A1 = new Autor();
        A1.setApellido("Cortazar");
        A1.setEmail("cortazar@gmail.com");
        A1.setFechaNacimiento("26-08-1914");
        A1.setNombre("julio");
        A1.setSexo("Hombre");

        Editorial E1 = new Editorial();
        E1.setCuit("20256678986");
        E1.setDireccion("Av. Santa Fe 2800");
        E1.setEmail("Elateneo@gmail.com");
        E1.setLocalidad("CABA");
        E1.setNombre("El Ateneo");
        E1.setTelefono("011-47503285");

        Libro L1 = new Libro();
        L1.setAutor(A1);
        L1.setAñoPublicacion(1963);
        L1.setCosto(10500.0);
        L1.setEditorial(E1);
        L1.setNombreLibro("Rayuela");
        L1.setNroEjemplares(500);

        // System.out.println("Datos del autor " + A1.getNombre() + " " +
        // A1.getApellido() + ": " + "\n" +
        // "Email: " + A1.getEmail() + "\n" +
        // "Fecha de nacimiento: " + A1.getFechaNacimiento() + "\n" +
        // "Sexo: " + A1.getSexo() + "\n" +
        // "Email: " + A1.getEmail() +
        // "\n" + E1);

        System.out.println(L1.toString()); // Hace algo parecido a lo de arriba
        System.out.println("------------------------------------------------");
        System.out.println(E1); // se puede escribir tambien asi
        System.out.println("------------------------------------------------");
        System.out.println(A1);
    }
}

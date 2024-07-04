package CUATRIMESTRE_2.POO.actividades.PRACTICA.Prac_Sem_10.Ej1;

public class CustomerTest {

    public static void main(String[] args) {

        Address address1 = new Address("123 Main St", "Cityville", "Stateville", "12345");
        Address address2 = new Address("456 Elm St", "Townsville", "Stateville", "54321");

        Customer c1 = new Customer(1, "John Doe", address1, 123456789, "john.doe@example.com", 'A', 1000.0);
        Customer c2 = new Customer(2, "Jane Smith", address2, 987654321, "jane.smith@example.com", 'B', 2000.0);

        System.out.println("Información del Cliente 1:");
        System.out.println(c1.toString());
        System.out.println();

        System.out.println("Información del Cliente 2:");
        System.out.println(c2.toString());
    }

}

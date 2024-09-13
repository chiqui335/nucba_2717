package CUATRIMESTRE_3.Prog_avanzada.Clase8;


import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        List<Persona> listaPersonas = new ArrayList<>(); //arraylist es un tipo de lista (es una interfaz)
        // el limite del arraylist es la RAM de la pc, siempre se guarda un poco de memoria de mas
        // uso el array normal cuando quiero limitar la memoria
        // es redimensionable

        Persona pepe = new Persona("pepe", "argento");

        listaPersonas.add(new Persona("anna", "garcia"));
        listaPersonas.add(new Persona("rodrigo", "marquez"));
        listaPersonas.add(new Persona("raul", "rodriguez"));
        listaPersonas.add(new Persona("lucrecia", "fernandez"));
        listaPersonas.add(new Persona("maria", "ferrari"));
        listaPersonas.add(new Persona("marcos", "lomachenco"));
        
        System.out.println("Personas en la lista: ");

        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        System.out.println("\nsegunda persona en la lista: " + listaPersonas.get(4));

        String nombreBuscado = "lucrecia";

        Persona personaEncontrada = null;

        for (Persona persona : listaPersonas) {
            if (persona.getNombre().equals(nombreBuscado)) {
                personaEncontrada = persona;
                break;
            }
        }

        System.out.println("\npersonaEncontrada: " + nombreBuscado + ": " + (personaEncontrada != null ? personaEncontrada : "No encontrada"));
            //los : es un else

        listaPersonas.remove(2);

        System.out.println("\nLista despues de borrar a la 3er persona: ");

        listaPersonas.forEach(System.out::println);
            //una forma de hacerle foreach a la lista que brinda el import


        Persona personaBuscada = new Persona("gabo", "fieltre");

        boolean contiene = listaPersonas.contains(personaBuscada);
            //forma del impor para saber si la lista contiene algo
        
        System.out.println("\nContiene la persona " + personaBuscada.getNombre() + "? " + contiene);

        //convertir lista a array:
        Persona[] arrayPersonas = listaPersonas.toArray(new Persona[0]);
        System.out.println("\nArray de personas: ");
        for (Persona persona : arrayPersonas) {
            System.out.println(persona);
        }

        System.out.println("\nTamaño de la lista antes de limpiarla: " + listaPersonas.size());

        listaPersonas.clear();
        System.out.println("\nTamaño de la lista despues de limpiarla: " + listaPersonas.size());


        //ejemplo de linked list:

        List<String> tareas = new LinkedList<>();

        tareas.add("estudiar");
        tareas.add("entrenar");

        System.out.println("lista tareas: ");
        for (String tarea : tareas) {
            System.out.println(tarea);
        }
    }
}

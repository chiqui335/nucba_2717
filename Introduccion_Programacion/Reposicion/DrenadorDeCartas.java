package Introduccion_Programacion.Reposicion;
import java.util.Scanner;

public class DrenadorDeCartas {
    public static void main(String[] args) {
        String[] mazo = {
            "As de Corazones", "2 de Corazones", "3 de Corazones", "4 de Corazones", "5 de Corazones",
            "6 de Corazones", "7 de Corazones", "8 de Corazones", "9 de Corazones", "10 de Corazones",
            "Jota de Corazones", "Reina de Corazones", "Rey de Corazones",
    
            "As de Diamantes", "2 de Diamantes", "3 de Diamantes", "4 de Diamantes", "5 de Diamantes",
            "6 de Diamantes", "7 de Diamantes", "8 de Diamantes", "9 de Diamantes", "10 de Diamantes",
            "Jota de Diamantes", "Reina de Diamantes", "Rey de Diamantes",
    
            "As de Tréboles", "2 de Tréboles", "3 de Tréboles", "4 de Tréboles", "5 de Tréboles",
            "6 de Tréboles", "7 de Tréboles", "8 de Tréboles", "9 de Tréboles", "10 de Tréboles",
            "Jota de Tréboles", "Reina de Tréboles", "Rey de Tréboles",
    
            "As de Picas", "2 de Picas", "3 de Picas", "4 de Picas", "5 de Picas",
            "6 de Picas", "7 de Picas", "8 de Picas", "9 de Picas", "10 de Picas",
            "Jota de Picas", "Reina de Picas", "Rey de Picas"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Drenador de Cartas!");

        while (mazo.length > 0) {
            System.out.println("\nPresiona Enter para sacar una carta...");
            scanner.nextLine();

            if (mazo.length == 0) {
                System.out.println("¡Se han agotado todas las cartas!");
                break;
            }

            // Sacar y mostrar la carta
            int indiceCarta = (int) (Math.random() * mazo.length);
            String cartaSiguiente = mazo[indiceCarta];
            
            // Remover la carta del mazo
            String[] nuevoMazo = new String[mazo.length - 1];
            for (int i = 0, j = 0; i < mazo.length; i++) {
                if (i != indiceCarta) {
                    nuevoMazo[j++] = mazo[i];
                }
            }
            mazo = nuevoMazo;

            System.out.println("Has sacado: " + cartaSiguiente);
            System.out.println("Quedan " + mazo.length + " cartas en el mazo.");
        }

        scanner.close();
    }
}

package CUATRIMESTRE_3.Prog_avanzada.Clase9;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        Scanner sc = new Scanner(System.in);
        

        //bucle infinito
        while(true){
            try {
                System.out.println("\n1. Depositar\n2. Retirar\n3. Transferir\n4. Salir");
                System.out.println("Seleccione una opcion");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("cantidad a depositar: ");
                        double cantidadDeposito = sc.nextDouble();
                        cuenta.Depositar(cantidadDeposito);
                        break;
                    case 2:
                        System.out.println("cantidad a retirar: ");
                        double cantidadRetiro = sc.nextDouble();
                        cuenta.Retirar(cantidadRetiro);
                        break;
                    case 3:
                        System.out.println("cantidad a transferir: ");
                        double cantidadTransferir = sc.nextDouble();
                        cuenta.transferir(cantidadTransferir);
                        break;
                    case 4:
                        System.out.println("Gracias por usar el sistema :)");
                        break;
                    default:
                        throw new IllegalArgumentException("Opcion no valida");
                        //aca no hace falta break
                }
            } catch (SaldoInsuficienteException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (LimiteTransferenciaException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            } catch(IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            } catch(Exception e){
                System.out.println("OOPS: " + e.getMessage());
            } finally{ //PASE LO QUE PASE EL FINALLY SE EJECUTA
                System.out.println("Operacion finalizada");
            }
            // LAS EXCEPCIONES VAN DE LAS PARTICULARES (LIMITE Y SALDO OSEA LAS QUE CREO YO) A GENERICO (ILLEGALARGUMENT)
     }
   }
}  
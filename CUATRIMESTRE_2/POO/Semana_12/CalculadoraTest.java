package CUATRIMESTRE_2.POO.Semana_12;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.setNum1(30);
        calc.setNum2(6);

        // Realizar operaciones y mostrar resultados
		System.out.println("Suma: " + calc.sumar());
		System.out.println("Resta: " + calc.restar());
		System.out.println("Multiplicación: " + calc.multiplicar());
		System.out.println("División: " + calc.dividir());
		System.out.println("----------------------------------------");

        //otro objeto calc con valores especificos en el mismo objeto

        Calculadora calc2 = new Calculadora(20, 5);
        System.out.println("Suma: " + calc2.sumar());
		System.out.println("Resta: " + calc2.restar());
		System.out.println("Multiplicación: " + calc2.multiplicar());
		System.out.println("División: " + calc2.dividir());

    }
}

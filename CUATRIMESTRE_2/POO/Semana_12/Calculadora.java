package CUATRIMESTRE_2.POO.Semana_12;

public class Calculadora {
    private double num1;
    private double num2;

    //constructor por defecto
    public Calculadora() {
        this.num1 = 0;
        this.num2 = 0;
    }

    //constructor con parametros
    public Calculadora (double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        return num1 * num2;
    }

    public double dividir(){
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: division por 0 no es posible");
            //Retornar cero como valor predeterminado en caso de error
            return 0;
        }
        
    }
    // Métodos setters para actualizar los números
    public void setNum1 (double num1) {
        this.num1 = num1;
    }

    public void setNum2 (double num2) {
        this.num2 = num2;
    }

}

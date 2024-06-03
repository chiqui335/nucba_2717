package CUATRIMESTRE_2.POO.Semana_11;

public class testRectangulo {
    public static void main(String[] args){
        Rectangulo r = new Rectangulo(4.0, 10.5);

        double area = r.calcularArea();

        double perimetro = r.calcularPerimetro();


        System.out.println("el area es: " + area);
        System.out.println("el perimetro es " + perimetro);
    }
}

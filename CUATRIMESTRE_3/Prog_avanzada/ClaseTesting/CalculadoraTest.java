package CUATRIMESTRE_3.Prog_avanzada.ClaseTesting;


public class CalculadoraTest {
    
    @test
    void testSumar(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(1, 1);

        assert.assertEquals(7, resultado);
    }
}

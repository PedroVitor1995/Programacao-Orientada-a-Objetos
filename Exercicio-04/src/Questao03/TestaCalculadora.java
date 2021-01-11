package Questao03;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10,5);
        System.out.println(calculadora.soma());
        System.out.println(calculadora.subtrair());
    }
}

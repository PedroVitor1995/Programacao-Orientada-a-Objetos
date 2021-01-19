package Questao09;

import Questao02.Calculadora;
import Questao02.CalculadoraCientifica;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10,5);
        System.out.println("Soma " +calculadora.getOperando1()+ " + "+
                calculadora.getOperando2() +" = "+calculadora.soma());

        System.out.println("Divisão " +calculadora.getOperando1()+ " / "+
                calculadora.getOperando2() +" = "+calculadora.dividir());

        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica(25,10);

        System.out.println("Exponenciação "+calculadoraCientifica.exponenciar(2,4));
        System.out.println("Sem Arredodamento "+calculadoraCientifica.dividir(false));
        System.out.println("Com Arredodamento "+calculadoraCientifica.dividir(true));
    }
}

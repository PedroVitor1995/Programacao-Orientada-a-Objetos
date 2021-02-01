package Questao09;

import Questao08.Circulo;
import Questao08.Quadrado;
import Questao08.Retangulo;

public class TestaFiguraGeometrica {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5);

        Quadrado quadrado1 = new Quadrado();
        quadrado1.setLado(5);

        System.out.println("Quadrado: "+quadrado.comparar(quadrado1));

        Circulo circulo = new Circulo();
        circulo.setRaio(2);

        System.out.println("Circulo: "+circulo.comparar(quadrado));

        Retangulo retangulo = new Retangulo();
        retangulo.setBase(7);
        retangulo.setAltura(3);

        System.out.println("Retangulo: "+retangulo.comparar(circulo));

    }
}

package Questao04;

public class TestaFiguraGeometrica {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        retangulo.setBase(4);
        retangulo.setAltura(2);
        System.out.println("Retangulo");
        System.out.println("Area: "+retangulo.calcularArea());
        System.out.println("Perimetro:"+retangulo.calcularPerimetro());

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5);
        System.out.println("\nQuadrado");
        System.out.println("Area: "+quadrado.calcularArea());
        System.out.println("Perimetro:"+quadrado.calcularPerimetro());

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(3);
        triangulo.setAltura(2);
        triangulo.setLado1(3);
        triangulo.setLado2(2);
        System.out.println("\nTriangulo");
        System.out.println("Area: "+triangulo.calcularArea());
        System.out.println("Perimetro:"+triangulo.calcularPerimetro());

        Circulo circulo = new Circulo();
        circulo.setRaio(3);
        System.out.println("\nCirculo");
        System.out.println("Area: "+circulo.calcularArea());
        System.out.println("Perimetro:"+circulo.calcularPerimetro());

    }
}

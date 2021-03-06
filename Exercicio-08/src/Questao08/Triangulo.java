package Questao08;

import Questao07.FiguraGeometrica;

public class Triangulo implements FiguraGeometrica,Comparavel {
    private double lado1,lado2,base,altura;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura() / 2;
    }

    @Override
    public int comparar(FiguraGeometrica figuraGeometrica) {
        if(this.calcularArea() < figuraGeometrica.calcularArea())
            return -1;
        else if(this.calcularArea() == figuraGeometrica.calcularArea())
            return 0;
        else
            return 1;
    }

    @Override
    public double calcularPerimetro() {
        return getLado1() + getLado2() + getBase();
    }
}

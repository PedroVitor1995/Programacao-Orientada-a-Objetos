package Questao08;

import Questao07.FiguraGeometrica;

public class Retangulo implements FiguraGeometrica,Comparavel {
    private double base,altura;

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return (getBase() + getAltura()) * 2;
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
}

package Questao08;

import Questao07.FiguraGeometrica;

public class Quadrado implements FiguraGeometrica,Comparavel {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return getLado() * getLado();
    }

    @Override
    public double calcularPerimetro() {
        return getLado() * 4;
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

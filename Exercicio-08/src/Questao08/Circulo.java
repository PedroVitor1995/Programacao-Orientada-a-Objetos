package Questao08;

import Questao07.FiguraGeometrica;

public class Circulo implements FiguraGeometrica,Comparavel {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio,2);
    }

    @Override
    public double calcularPerimetro() {
        return (2 * Math.PI) * getRaio();
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

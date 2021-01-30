package Questao04;

public class Quadrado extends FiguraGeometrica{

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
}

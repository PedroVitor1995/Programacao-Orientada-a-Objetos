package Questao04;

public class Circulo extends FiguraGeometrica{

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
}

package Questao04;

public class Retangulo extends FiguraGeometrica{

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
}

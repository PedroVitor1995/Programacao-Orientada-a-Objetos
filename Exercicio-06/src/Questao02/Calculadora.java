package Questao02;

public class Calculadora {

    private double operando1,operando2;

    public Calculadora(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public double getOperando1() {
        return operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public double soma(){
        return this.operando1 + this.operando2;
    }

    public double subtrair(){
        return this.operando1 - this.operando2;
    }

    public double dividir(){
        return this.operando1 / this.operando2;
    }
}

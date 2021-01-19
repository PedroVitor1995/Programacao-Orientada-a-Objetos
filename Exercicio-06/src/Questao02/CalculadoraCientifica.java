package Questao02;

public class CalculadoraCientifica extends Calculadora{

    public CalculadoraCientifica(double operando1, double operando2) {
        super(operando1, operando2);
    }

    public double exponenciar(double base, double expoente){
        return Math.pow(base,expoente);
    }

    public double dividir(boolean arredondar){
        if(arredondar)
            return Math.round(super.dividir());
        else
            return super.dividir();

    }
}

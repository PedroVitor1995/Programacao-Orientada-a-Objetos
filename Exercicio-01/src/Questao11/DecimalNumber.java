package Questao11;

public class DecimalNumber {
    public double numero;

    public int parteInteira(){
        return (int)numero;
    }

    public  double parteDecimal(){
        return  numero - (int)numero;
    }
}

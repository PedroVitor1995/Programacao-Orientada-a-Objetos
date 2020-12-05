package Questao11;

public class TesteDecimalNumber {
    public static void main(String[] args) {
        DecimalNumber decimalNumber = new DecimalNumber();
        decimalNumber.numero = 12.5;

        System.out.println("Parte Inteira: "+decimalNumber.parteInteira());
        System.out.println("Parte Decimal: "+decimalNumber.parteDecimal());
    }
}

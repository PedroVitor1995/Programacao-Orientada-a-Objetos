package Questao13;

public class TesteNumberUtils {
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();
        numberUtils.numero = 9;

        System.out.println("É Par: "+numberUtils.isPair());
        System.out.println("É Ímpar: "+numberUtils.isOdd());
        System.out.println("É Primo: "+numberUtils.isPrime());
        System.out.println("Contagem Crescente: "+numberUtils.printCount());
        System.out.println("Contagem Decrescente: "+numberUtils.printReverseCount());
    }
}

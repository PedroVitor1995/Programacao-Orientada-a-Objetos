import Questao10.Soma;
import Questao11.DecimalNumber;
import Questao12.Desconto;
import Questao13.NumberUtils;

public class Teste {
    public static void main(String[] args) {
        //Questão 10
        System.out.println("Questão 10");

        Soma soma = new Soma();
        soma.numero1 = 10.5;
        soma.numero2 = 5;

        System.out.println("Soma: "+soma.calculaSoma());

        //Questão 11
        System.out.println("\nQuestão 11");

        DecimalNumber decimalNumber = new DecimalNumber();
        decimalNumber.numero = 12.5;

        System.out.println("Parte Inteira: "+decimalNumber.parteInteira());
        System.out.println("Parte Decimal: "+decimalNumber.parteDecimal());

        //Questão 12
        System.out.println("\nQuestão 12");

        Desconto desconto = new Desconto();
        desconto.valorOriginal = 120;
        desconto.valorDesconto = 10;

        System.out.println("Valor Calculado: "+desconto.calcula());

        //Questão 13
        System.out.println("\nQuestão 13");

        NumberUtils numberUtils = new NumberUtils();
        numberUtils.numero = 9;

        System.out.println("É Par: "+numberUtils.isPair());
        System.out.println("É Ímpar: "+numberUtils.isOdd());
        System.out.println("É Primo: "+numberUtils.isPrime());
        System.out.println("Contagem Crescente: "+numberUtils.printCount());
        System.out.println("Contagem Decrescente: "+numberUtils.printReverseCount());
    }
}

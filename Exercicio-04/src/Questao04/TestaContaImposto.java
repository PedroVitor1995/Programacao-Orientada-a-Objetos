package Questao04;

public class TestaContaImposto {
    public static void main(String[] args) {
        ContaImposto contaImposto = new ContaImposto("123",200);
        System.out.println(contaImposto);
        contaImposto.credito(500);
        System.out.println(contaImposto);
        contaImposto.debito(100);
        System.out.println(contaImposto);
    }
}

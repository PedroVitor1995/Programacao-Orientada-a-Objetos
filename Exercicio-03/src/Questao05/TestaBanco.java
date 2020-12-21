package Questao05;

public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco(5);
        Conta conta1 = new Conta("123",100);
        banco.inserir(conta1);
        Conta conta2 = new Conta("456",200);
        banco.inserir(conta2);
        Conta conta3 = new Conta("789",300);
        banco.inserir(conta3);
        System.out.println("Qtd: "+banco.qtdContas());
        System.out.println("Total saldo: "+banco.totalDepositado());
        System.out.println("Média: "+banco.mediaSaldo());
    }
}

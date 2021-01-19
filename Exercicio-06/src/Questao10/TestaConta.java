package Questao10;

public class TestaConta {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Poupanca poupanca = new Poupanca("123", 1000, 0.5);
        System.out.println(poupanca.getSaldo());
        poupanca.renderJuros();
        System.out.println(poupanca.getSaldo());
        banco.inserir(poupanca);

        System.out.println("-------");
        ContaImposto contaImposto = new ContaImposto("321",1000);
        System.out.println(contaImposto.getSaldo());
        contaImposto.sacar(200);
        System.out.println(contaImposto.getSaldo());
        banco.inserir(contaImposto);

        System.out.println("-------");


        System.out.println(banco.qtdContas());
        System.out.println(banco.totalDepositado());
    }
}

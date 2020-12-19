package Questao02;

public class Teste {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];
        Conta conta = new Conta();
        contas[0] = conta;
        contas[0].saldo = 10;
        System.out.println(contas[0].saldo);
    }
}

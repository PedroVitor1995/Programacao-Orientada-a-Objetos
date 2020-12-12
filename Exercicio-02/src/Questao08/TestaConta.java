package Questao08;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("1",100);
        Conta c2 = new Conta("2",50);
        c1.sacar(10);
        c1.transferir(c2,30);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}

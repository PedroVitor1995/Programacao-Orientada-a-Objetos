package Questao10;

public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public double calculaTributos() {
        return this.saldo * 10 / 100;
    }
}

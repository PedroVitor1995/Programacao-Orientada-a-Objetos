package Questao08;

public class Conta {
    public String numero;
    private double saldo;

    Conta(String numero, double valor) {
        this.numero = numero;
        this.saldo = valor;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    boolean sacar(double valor) {
        if(valor > this.saldo){
            return false;
        }
        setSaldo(getSaldo() - valor);
        return true;
    }

    void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    boolean transferir(Conta destino, double valor) {
        if(sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return  false;
    }
}

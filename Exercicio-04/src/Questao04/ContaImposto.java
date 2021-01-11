package Questao04;

public class ContaImposto {

    private String numero;
    private double saldo;

    public ContaImposto(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void credito(double saldo){
        setSaldo(getSaldo() + saldo);
    }

    public void debito(double saldo){
        setSaldo(getSaldo() - saldo - retemImposto(saldo));
    }

    private double retemImposto(double valorDebito){
        return  valorDebito * 0.38 / 100;
    }

    @Override
    public String toString() {
        return "ContaImposto{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

package Questao10;

public class Poupanca extends Conta {
    private double taxaDeJuros;

    public Poupanca() {
    }

    public Poupanca(String numero, double valor, double taxaDeJuros) {
        super(numero, valor);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void renderJuros(){
        if(this instanceof Poupanca)
            depositar(getSaldo() * taxaDeJuros/100);
    }
}

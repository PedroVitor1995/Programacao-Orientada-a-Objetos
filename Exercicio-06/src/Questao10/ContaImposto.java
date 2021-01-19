package Questao10;

public class ContaImposto extends Conta {
    private double taxaDesconto;

    public ContaImposto() {
    }

    public ContaImposto(String numero, double valor) {
        super(numero, valor);
        this.taxaDesconto = 0.5;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        if(this instanceof ContaImposto)
            super.sacar(valor * getTaxaDesconto() / 100);
    }
}

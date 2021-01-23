package Questao04;

public class Poupanca extends Conta {
	private double taxaDeJuros;
		
	public void renderJuros() {
		
		double juros = getSaldo() * taxaDeJuros/100;
		depositar(juros);
	}

	public Poupanca(String numero, double valor, double taxaDeJuros) {
		super(numero, valor);
		this.taxaDeJuros = taxaDeJuros;
	}
}

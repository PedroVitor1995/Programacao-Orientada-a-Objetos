package Questao08;

public class Poupanca extends Conta {
	private double taxaDeJuros;
		
	public void renderJuros() throws AplicacaoException {
		
		double juros = getSaldo() * taxaDeJuros/100;
		depositar(juros);
	}

	public Poupanca(String numero, double valor, double taxaDeJuros) throws AplicacaoException {
		super(numero, valor);
		this.taxaDeJuros = taxaDeJuros;
	}
}

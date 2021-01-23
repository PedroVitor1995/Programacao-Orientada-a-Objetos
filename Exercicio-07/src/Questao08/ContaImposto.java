package Questao08;

public class ContaImposto extends Conta {
	private double taxa = 0.38/100;

	public ContaImposto(String numero, double valor) throws AplicacaoException {
		super(numero, valor);
	}

	@Override
	public void sacar(double valor) throws AplicacaoException {
		super.sacar(valor);
		super.sacar(valor * taxa);
	}
}

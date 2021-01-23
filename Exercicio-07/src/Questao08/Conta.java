package Questao08;

public class Conta {
	private String numero;
	private double saldo;

	public Conta(String numero, double valor) throws AplicacaoException {
		this.numero = numero;
		this.depositar(valor);
	}

	public void sacar(double valor) throws AplicacaoException {
		if (saldo < valor) {
			throw new AplicacaoException("Saldo insuficiente.");
		}

		validarValor(valor);

		saldo = saldo - valor;
	}

	public void depositar(double valor) throws AplicacaoException {
		validarValor(valor);
		saldo = saldo + valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void transferir(Conta destino, double valor) throws AplicacaoException {
		this.sacar(valor);
		destino.depositar(valor);
	}

	public String getNumero() {
		return numero;
	}

	private void validarValor(double valor) throws AplicacaoException {
		if(valor <= 0)
			throw new AplicacaoException("Valor inválido.");
	}
}

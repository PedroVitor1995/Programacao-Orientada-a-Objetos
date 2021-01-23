package Questao05;

import Questao01.AplicacaoException;

public class Conta {
	private String numero;
	private double saldo;

	public Conta(String numero, double valor) {
		this.numero = numero;
		this.depositar(valor);
	}

	public void sacar(double valor) {
		if (saldo < valor) {
			throw new AplicacaoException("Saldo insuficiente.");
		}

		validarValor(valor);

		saldo = saldo - valor;
	}

	public void depositar(double valor) {
		validarValor(valor);
		saldo = saldo + valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
	}

	public String getNumero() {
		return numero;
	}

	private void validarValor(double valor){
		if(valor <= 0)
			throw new AplicacaoException("Valor inválido.");
	}
}

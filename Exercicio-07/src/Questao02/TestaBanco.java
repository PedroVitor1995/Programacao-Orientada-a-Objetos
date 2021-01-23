package Questao02;

import Questao01.AplicacaoException;
import Questao01.Conta;

public class TestaBanco {
	public static void main(String[] args) {

		try {
			Banco banco = new Banco();

			Conta c = new Conta("1", 100);

			banco.inserir(c);
			banco.inserir(c);
		} catch (AplicacaoException e) {
			System.out.println("Exceção capturada: " + e.getMessage());
		}
		System.out.println("Programa finalizado com sucesso");
	}
}

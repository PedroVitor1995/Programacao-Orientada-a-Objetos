package Questao01;

public class TestaBanco {
	public static void main(String[] args) {

		try {
			Banco banco = new Banco();

			Conta c = new Conta("1", 100);

			banco.excluir("1");
		} catch (AplicacaoException e) {
			System.out.println("Exceção capturada: " + e.getMessage());
		}
		System.out.println("Programa finalizado com sucesso");
	}
}

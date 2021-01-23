package Questao08;

public class Banco {
	private Conta[] contas;
	private int indice = 0;

	public Banco() throws AplicacaoException {
		contas = new Conta[1];
		if(indice >= contas.length)
			throw new AplicacaoException("Número máximo de contas atingido");
	}

	public Banco(int tamanho) throws AplicacaoException {
		contas = new Conta[tamanho];
		if(indice >= contas.length)
			throw new AplicacaoException("Número máximo de contas atingido");
	}

	public void inserir(Conta c) {
		if (indice < contas.length) { 
			contas[indice] = c;
			indice++;
		} else {
			System.out.println("Número máximo de contas atingido");
		}
	}

	public Conta consultar(String numero) throws AplicacaoException {
		Conta c = null;
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				c = contas[i];
				break;
			}
		}
		if (c == null) {
			throw new AplicacaoException("Conta inexistente.");
		}
		return c;
	}

	private int consultarIndice(String numero) throws AplicacaoException {
		int pos = -1;
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				pos = i;
				break;
			}
		}
		if (pos == -1) {
			throw new AplicacaoException("Conta inexistente.");
		}
		return pos;
	}

	public void debitar(String numero, double valor) throws AplicacaoException {
		Conta c;
		c = consultar(numero);
		c.sacar(valor);
	}

	public void creditar(String numero, double valor) throws AplicacaoException {
		Conta c;
		c = consultar(numero);
		c.depositar(valor);
	}
	
	public void transferir(String numCredito, String numDebito, double valor) throws AplicacaoException {
		Conta contaCredito = consultar(numCredito);
		Conta contaDebito = consultar(numDebito);
		contaCredito.transferir(contaDebito, valor);
	}

	public void alterar(Conta c) throws AplicacaoException {
		int indice = consultarIndice(c.getNumero());
		contas[indice] = c;
	}

	public void excluir(String numero) throws AplicacaoException {
		int posicao = consultarIndice(numero);
		for (int i = posicao; i < indice; i++) {
			contas[i] = contas[i + 1];
		}
		indice--;
	}
	
	public void renderJuros(String numero) throws AplicacaoException {
		Conta c = consultar(numero);
		if (!(c instanceof Poupanca))
			throw new AplicacaoException("Poupança não encontrada");

		((Poupanca) c).renderJuros();

	}
	
	public int retornaQuantidade() {
		return indice;
	}
	
	public double retornaValorTotal() {
		double total = 0;
		for (int i = 0; i < indice; i++) {
			total += contas[i].getSaldo();
		}
		
		return total;
	}
	
	public double retornaMediaValores() {
		return retornaValorTotal()/retornaQuantidade();
	}
}
package Questao06;

public class Banco {
    private Conta[] contas;
    private int indice = 0;

    public Banco() {
        contas = new Conta[50];
    }

    public Banco(int tamanho) {
        contas = new Conta[tamanho];
    }

    public void inserir(Conta c) {
        if(indice < contas.length){
            contas[indice] = c;
            indice++;
            System.out.println("Conta cadastrada com sucesso!!!");
        }
        else{
            System.out.println("Não foi possivel cadatrar a conta");
        }
    }

    public Conta consultar(String numero) {
        Conta c = null;
        for (int i = 0; i < indice; i++) {
            if (contas[i].numero.equals(numero)) {
                c = contas[i];
                break;
            }
        }
        return c;
    }

    private int consultarIndice(String numero) {
        int pos = -1;
        for (int i = 0; i < indice; i++) {
            if (contas[i].numero.equals(numero)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public void debitar(String numero, double valor) {
        Conta c;
        c = consultar(numero);
        if (c != null){
            c.sacar(valor);
            System.out.println("Valor debitado com sucesso!!!");
        }
        else{
            System.out.println("Conta inexistente.");
        }
    }

    public void alterar(Conta c) {
        int indice = consultarIndice(c.numero);
        if (indice != -1) {
            contas[indice] = c;
            System.out.println("Conta alterada com sucesso!!!");
        }
        else{
            System.out.println("Conta inexistente.");
        }

    }

    public void excluir(String numero) {
        int posicao = consultarIndice(numero);
        if (posicao != -1) {
            for (int i = posicao; i < indice; i++) {
                contas[i] = contas[i + 1];
            }
            indice--;
            System.out.println("Conta excluida com sucesso!!!");
        }
        else{
            System.out.println("Conta inexistente.");
        }
    }

    public void creditar(String numero, double valor) {
        Conta c;
        c = consultar(numero);
        if (c != null){
            c.depositar(valor);
            System.out.println("Valor creditado com sucesso!!!");
        }
        else{
            System.out.println("Conta inexistente.");
        }
    }

    public void transferir(String numCredito, String numDebito, double valor){
        Conta c1,c2;
        c1 = consultar(numCredito);
        c2 = consultar(numDebito);

        if (c1 != null && c2 != null){
            c2.transferir(c1,valor);
            System.out.println("Valor transferido com sucesso!!!");
        }
        else if (c1 != null){
            System.out.println("Conta Credito inexistente.");
        }
        else {
            System.out.println("Conta Debito inexistente.");
        }
    }

    public int qtdContas(){
        int qtd = 0;
        for (Conta c:
                contas) {
            if(c != null)
                qtd++;
        }
        return qtd;
    }

    public double totalDepositado(){
        double total = 0;
        for (Conta c:
                contas) {
            if(c != null)
                total += c.saldo;
        }
        return total;
    }

    public double mediaSaldo(){
        return totalDepositado() / qtdContas();
    }
}
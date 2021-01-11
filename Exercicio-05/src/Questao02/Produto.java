package Questao02;

public class Produto {
    public int id, quantidade;
    public String descricao;
    public double valor;

    public void repor(int quantidade){
        this.quantidade += quantidade;
    }

    public void darBaixa(int quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}

package Questao09;

import java.util.Objects;

public class Produto {
    int quantidade,quantidadeMinima;
    String codigo,descricao;
    double valor;

    Produto(String codigo, String descricao, int quantidade, double valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
        this.quantidadeMinima = 5;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    void baixar(int quantidade){
        if((this.quantidade - quantidade) >= quantidadeMinima)
            setQuantidade(getQuantidade() - quantidade);
    }

    void repor(int quantidade){
        setQuantidade(getQuantidade() + quantidade);
    }

    void reajusta(double taxa){
        setValor(getValor() + (getValor() * taxa / 100));
    }

    @Override
    public boolean equals(Object o) {
        Produto produto = (Produto) o;
        return codigo.equals(produto.codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "quantidade=" + quantidade +
                ", quantidadeMinima=" + quantidadeMinima +
                ", codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}

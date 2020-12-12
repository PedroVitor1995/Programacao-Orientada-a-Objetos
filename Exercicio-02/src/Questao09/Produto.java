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

    void baixar(int quantidade){
        if((this.quantidade - quantidade) >= quantidadeMinima)
            this.quantidade -= quantidade;
    }

    void repor(int quantidade){
        this.quantidade += quantidade;
    }

    void reajusta(double taxa){
        this.valor += (this.valor * taxa) / 100;
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

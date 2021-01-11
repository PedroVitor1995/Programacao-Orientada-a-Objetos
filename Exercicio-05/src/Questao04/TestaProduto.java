package Questao04;

import Questao02.Produto;
import Questao02.ProdutoPerecivel;
import Questao03.Estoque;
import java.time.LocalDate;

public class TestaProduto {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto = new Produto();
        produto.id = 1;
        produto.descricao = "ProdX";
        produto.quantidade = 10;
        produto.valor = 5.50;
        estoque.inserir(produto);
        produto.darBaixa(5);
        produto.repor(30);
        Produto p = null;
        p = estoque.consultar("ProdX");
        if(p != null){
            System.out.println(p);
        }
        else{
            System.out.println("Produto não existe");
        }


        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel();
        produtoPerecivel.id = 2;
        produtoPerecivel.descricao = "ProdY";
        produtoPerecivel.quantidade = 20;
        produtoPerecivel.valor = 2.50;
        produtoPerecivel.dataValidade = LocalDate.of(2020, 12, 7);
        System.out.println(produtoPerecivel.produtoPerecível());
        estoque.inserir(produtoPerecivel);
        produtoPerecivel.darBaixa(5);
        produtoPerecivel.repor(30);
        Produto pp = null;
        pp = estoque.consultar("ProdY");
        if(pp != null){
            System.out.println(pp);
        }
        else{
            System.out.println("Produto não existe");
        }

    }
}

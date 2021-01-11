package Questao03;

import Questao02.Produto;

import java.util.ArrayList;

public class Estoque {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void inserir(Produto p) {
        boolean achouId = false, achouNome = false;
        for (Produto produto : produtos) {
            if(produto.id == p.id){
                achouId = true;
            }

            if(produto.descricao.equals(p.descricao)){
                achouNome = true;
            }
        }

        if(!achouId && !achouNome){
            produtos.add(p);
            System.out.println("Produto cadastrado com sucesso!!!");
        }
        else{
            if(achouId)
                System.out.println("Id já existente.");

            if(achouNome)
                System.out.println("Nome já existente.");
        }

    }

    public Produto consultar(String descricao) {
        Produto p = null;

        for (Produto produto : produtos) {
            if(produto.descricao.equals(descricao)){
                p = produto;
                break;
            }
        }
        return p;
    }

    public void excluir(String descricao) {
        Produto produto = consultar(descricao);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto excluido com sucesso!!!");
        }
        else{
            System.out.println("Produto inexistente.");
        }
    }
}

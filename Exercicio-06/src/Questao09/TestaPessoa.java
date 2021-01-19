package Questao09;

import Questao06.Pessoa;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Nome","Sobrenome");
        System.out.println(pessoa.getNomeCompleto());

        pessoa.setNome("N");
        pessoa.setSobreNome("S");
        System.out.println(pessoa.getNomeCompleto());
    }
}

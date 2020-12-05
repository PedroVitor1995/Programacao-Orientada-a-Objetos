package Questao08;

import Questao07.Saudacao;

public class TestaSaudacao {
    public static void main(String[] args) {
        Saudacao saudacao = new Saudacao();
        saudacao.texto = "Bom dia";
        saudacao.destinatario = "Pedro";

        System.out.println(saudacao.obterSaudacao());
    }
}

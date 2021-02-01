package Questao12;

import Questao10.ContaCorrente;
import Questao10.SeguroDeVida;
import Questao11.AuditoriaInterna;

public class TestaConta {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNome("X1");
        contaCorrente.setSaldo(200);
        ContaCorrente contaCorrente1 = new ContaCorrente();
        contaCorrente1.setNome("X2");
        contaCorrente1.setSaldo(500);

        System.out.println("Conta corrente 1: "+contaCorrente.calculaTributos());
        System.out.println("Conta corrente 2: "+contaCorrente1.calculaTributos());

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        System.out.println("Seguro de Vida: "+seguroDeVida.calculaTributos());

        AuditoriaInterna auditoriaInterna = new AuditoriaInterna();
        auditoriaInterna.adicionar(contaCorrente);
        auditoriaInterna.adicionar(contaCorrente1);
        auditoriaInterna.adicionar(seguroDeVida);

        System.out.println("Auditoria: "+auditoriaInterna.calcularTributos());
    }
}

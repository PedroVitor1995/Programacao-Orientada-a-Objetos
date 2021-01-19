package Questao09;

import Questao07.Funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("N","S",123,1000);

        System.out.println("Primeira Parcela "+funcionario.getSalarioPrimeiraParcela());
        System.out.println("Segunda Parcela"+funcionario.getSalarioSegundaParcela());
    }
}

package Questao09;

import Questao08.Professor;

public class TestaProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("N","S",123,2000,"E");
        System.out.println("Primeira Parcela "+professor.getSalarioPrimeiraParcela());
        System.out.println("Segunda Parcela "+professor.getSalarioSegundaParcela());

    }
}

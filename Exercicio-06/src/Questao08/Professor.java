package Questao08;

import Questao07.Funcionario;

public class Professor extends Funcionario {
    private String titulacao;

    public Professor() {
    }

    public Professor(String nome, String sobreNome, int matricula, double salario, String titulacao) {
        super(nome, sobreNome, matricula, salario);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public double getSalarioPrimeiraParcela() {
        return super.getSalario();
    }

    @Override
    public double getSalarioSegundaParcela() {
        return 0;
    }
}

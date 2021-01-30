package Questao05;

public class Gerente extends Funcionario{

    private double percentualParticipacao = 1.2;

    @Override
    public double getBonificacao() {
        return this.salario * percentualParticipacao + 1000;
    }
}

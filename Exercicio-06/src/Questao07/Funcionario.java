package Questao07;

import Questao06.Pessoa;

public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobreNome, int matricula, double salario) {
        super(nome, sobreNome);
        this.matricula = matricula;
        if(salario >= 0)
            this.salario = salario;
        else
            this.salario = 0;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioPrimeiraParcela(){
        return  getSalario() * 60 / 100;
    }

    public  double getSalarioSegundaParcela(){
        return  getSalario() * 40 / 100;
    }
}

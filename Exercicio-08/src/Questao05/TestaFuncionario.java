package Questao05;

public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.salario = 1000;
        System.out.println(gerente.getBonificacao());
    }
}

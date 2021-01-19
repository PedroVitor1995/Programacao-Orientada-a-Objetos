package Questao09;

import Questao01.Diarista;
import Questao01.Empregado;
import Questao01.Horista;

public class TestaEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        System.out.println("Salário Empregado: "+empregado.calcularSalario());

        Diarista diarista = new Diarista();
        System.out.println("Salário Diarista: "+diarista.calcularSalario());

        Horista horista = new Horista();
        System.out.println("Salário Horista: "+horista.calcularSalario());
    }
}

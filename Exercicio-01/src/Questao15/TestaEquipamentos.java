package Questao15;

import Questao14.Equipamento;

public class TestaEquipamentos {
    public static void main(String[] args) {
        System.out.println("Equipamento 1");
        Equipamento equipamento1 = new Equipamento();
        equipamento1.liga();
        System.out.println("Status: "+equipamento1.estaLigado());
        equipamento1.inverte();
        System.out.println("Status: "+equipamento1.estaLigado());

        if(equipamento1.estaLigado() == true){
            System.out.println("Equipamento Ligado");
        }
        else{
            System.out.println("Equipamento Desligado");
        }

        System.out.println("\nEquipamento 2");
        Equipamento equipamento2 = new Equipamento();
        equipamento2.desliga();
        System.out.println("Status: "+equipamento2.estaLigado());
        equipamento2.inverte();
        System.out.println("Status: "+equipamento2.estaLigado());

        if(equipamento2.estaLigado() == true){
            System.out.println("Equipamento Ligado");
        }
        else{
            System.out.println("Equipamento Desligado");
        }
    }
}

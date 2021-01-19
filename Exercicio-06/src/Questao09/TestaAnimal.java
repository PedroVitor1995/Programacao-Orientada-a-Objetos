package Questao09;

import Questao05.Bovino;
import Questao05.Peixe;

import java.util.ArrayList;

public class TestaAnimal {
    public static void main(String[] args) {
        ArrayList<Questao05.Animal> animals = new ArrayList<Questao05.Animal>();

        Questao05.Animal animal1 = new Questao05.Animal();
        animal1.setNome("Animal 1");
        animal1.setEspecie("A");
        animals.add(animal1);
        Questao05.Animal animal2 = new Questao05.Animal();
        animal2.setNome("Animal 2");
        animal2.setEspecie("AA");
        animals.add(animal2);

        Bovino bovino1 = new Bovino();
        bovino1.setNome("Bovino 1");
        bovino1.setEspecie("B");
        animals.add(bovino1);
        Bovino bovino2 = new Bovino();
        bovino2.setNome("Bovino 2");
        bovino2.setEspecie("BB");
        animals.add(bovino2);

        Peixe peixe1 = new Peixe();
        peixe1.setNome("Peixe 1");
        peixe1.setEspecie("P");
        animals.add(peixe1);
        Peixe peixe2 = new Peixe();
        peixe2.setNome("Peixe 2");
        peixe2.setEspecie("PP");
        animals.add(peixe2);

        for (Questao05.Animal animal:
                animals) {
            if(animal instanceof Questao05.Animal)
                System.out.println("Animal");

            if(animal instanceof  Bovino)
                System.out.println("Bovino");

            if(animal instanceof  Peixe)
                System.out.println("Peixe");
        }
    }
}

package Questao11;

import Questao10.Tributavel;

import java.util.ArrayList;
import java.util.List;

public class AuditoriaInterna {

    List<Tributavel> tributavels = new ArrayList<Tributavel>();

    public void adicionar(Tributavel tributavel){
        tributavels.add(tributavel);
    }

    public double calcularTributos(){
        double valor = 0;
        for (Tributavel t:
             tributavels) {
            valor += t.calculaTributos();
        }
        return valor;
    }
}

package Questao14;

public class Equipamento {
    boolean ligado;

    public void liga(){
        if(!estaLigado())
            ligado = true;
    }

    public void desliga(){
        if(estaLigado())
            ligado = false;
    }

    public void inverte(){
        ligado = !estaLigado();
    }

    public boolean estaLigado(){
        return ligado;
    }
}

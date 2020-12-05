package Questao14;

public class Equipamento {
    boolean ligado;

    public void liga(){
        if(estaLigado() == false)
            ligado = true;
    }

    public void desliga(){
        if(estaLigado() == true)
            ligado = false;
    }

    public void inverte(){
        if(estaLigado() == true){
            ligado = false;
        }
        else{
            ligado = true;
        }
    }

    public boolean estaLigado(){
        return ligado;
    }
}

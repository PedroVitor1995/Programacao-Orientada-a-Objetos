package Questao04;

public class Pilha {

    int [] pilha;
    private int qtd;

    Pilha(){
        pilha = new int[5];
        qtd = 0;
    }
    public void empilhar(int numero){
        if(!estaCheia()){
            for(int i=1; i<pilha.length; i++){
                pilha[i-1] = pilha[i];
            }
            pilha[pilha.length-1] = numero;
            qtd++;
        }
    }

    public boolean estaCheia(){
        if(this.qtd >= pilha.length)
            return true;
        return false;
    }

    public void desempilhar(){
        if(qtd > 0){
            pilha[pilha.length-1] = 0;
            qtd--;
            for(int i=pilha.length-1; i >= 1; i--){
                pilha[i] = pilha[i-1];
            }
        }
    }

    public int retornarTopo(){
        if(this.qtd >= pilha.length){
            return pilha[0];
        }
        else {
            return pilha[pilha.length - qtd];
        }
    }

    public String exibir(){
        String numeros = "";
        for (int i=0; i<pilha.length; i++){
            if(pilha.length-1 == i){
                numeros += pilha[i];
            }
            else {
                numeros += pilha[i] + ",";
            }
        }
        return numeros;
    }
}

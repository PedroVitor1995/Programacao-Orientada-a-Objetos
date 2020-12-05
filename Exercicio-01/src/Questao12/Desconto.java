package Questao12;

public class Desconto {
    public double valorOriginal,valorDesconto;

    public double calcula(){
        return valorOriginal * (1 - (valorDesconto / 100));
    }
}

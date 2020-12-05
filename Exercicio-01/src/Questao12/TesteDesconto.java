package Questao12;

public class TesteDesconto {
    public static void main(String[] args) {
        Desconto desconto = new Desconto();
        desconto.valorOriginal = 120;
        desconto.valorDesconto = 10;

        System.out.println("Valor Calculado: "+desconto.calcula());
    }
}

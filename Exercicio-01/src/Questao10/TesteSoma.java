package Questao10;

public class TesteSoma {
    public static void main(String[] args) {
        Soma soma = new Soma();
        soma.numero1 = 10.5;
        soma.numero2 = 5;

        System.out.println("Soma: "+soma.calculaSoma());
    }
}

package Questao04;

public class Teste {
    /*void x(double valor) {
        valor = valor + valor;

        System.out.println(valor);
    }*/

    double valor;

    void x(double valor) {
        this.valor += valor;

        System.out.println(this.valor);
    }

    public static void main(String[] args) {

        Teste teste = new Teste();
        teste.x(2);
    }

}

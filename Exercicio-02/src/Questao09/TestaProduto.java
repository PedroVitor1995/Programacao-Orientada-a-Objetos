package Questao09;

public class TestaProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("120","produto x",30,2.50);
        Produto produto2 = new Produto("130","produto y",50,1.75);
        produto1.baixar(23);
        produto1.reajusta(100);
        System.out.println(produto1.quantidade);
        System.out.println(produto1.valor);
        System.out.println(produto1);
        System.out.println(produto1.equals(produto2));
    }
}

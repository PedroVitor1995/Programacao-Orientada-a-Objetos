package Questao04;

public class TestaPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.empilhar(11);
        pilha.empilhar(22);
        pilha.empilhar(33);
        pilha.empilhar(44);
        pilha.empilhar(55);
        System.out.println(pilha.retornarTopo());
        System.out.println(pilha.exibir());

        pilha.desempilhar();
        pilha.empilhar(66);

        System.out.println(pilha.retornarTopo());
        System.out.println(pilha.exibir());
    }
}

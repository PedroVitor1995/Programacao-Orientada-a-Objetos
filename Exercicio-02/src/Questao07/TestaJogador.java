package Questao07;

public class TestaJogador {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador(5,5,100);
        Jogador jogador2 = new Jogador(10,3,100);

        jogador1.atacar(jogador2);
        jogador2.atacar(jogador1);

        System.out.println(jogador1.pontos);
        System.out.println(jogador2.pontos);
    }
}

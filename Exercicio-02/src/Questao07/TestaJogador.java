package Questao07;

public class TestaJogador {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador(3,4,2);
        Jogador jogador2 = new Jogador(4,3,4);

        jogador1.atacar(jogador2);
        jogador1.calculoPontoRelativo();

        System.out.println(jogador1.pontos);
        System.out.println(jogador2.pontos);
    }
}

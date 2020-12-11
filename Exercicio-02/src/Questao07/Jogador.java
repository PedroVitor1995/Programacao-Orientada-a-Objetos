package Questao07;

public class Jogador {
    int forca,nivel,pontos;

    Jogador(int forca,int nivel, int pontos){
        this.forca = forca;
        this.nivel = nivel;
        this.pontos = pontos;
    }

    void calculoPontoRelativo(){
        pontos = this.forca * this.nivel;
    }

    void atacar(Jogador jogador){
        jogador.pontos -= this.pontos;

    }
}

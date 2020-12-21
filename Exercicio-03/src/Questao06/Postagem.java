package Questao06;

public class Postagem {
    int id,qtdCurtidas;
    String texto;

    Postagem(int id,String texto){
        this.id = id;
        this.texto = texto;
        this.qtdCurtidas = 0;
    }

    void curtir(){
        qtdCurtidas++;
    }

    @Override
    public String toString() {
        return "Postagem{" +
                "id=" + id +
                ", qtdCurtidas=" + qtdCurtidas +
                ", texto='" + texto + '\'' +
                '}';
    }
}

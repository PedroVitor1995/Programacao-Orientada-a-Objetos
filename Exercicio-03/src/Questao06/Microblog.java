package Questao06;

public class Microblog {
    Postagem[] postagems;
    int indice = 0;

    public Microblog(int tamanho){
        postagems = new Postagem[tamanho];
    }

    void inserir(Postagem p) {
        if(indice < postagems.length){
            postagems[indice] = p;
            indice++;
        }
    }

    int consultarIndice(int id) {
        int pos = -1;
        for (int i = 0; i < indice; i++) {
            if (postagems[i].id == id) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    void excluir(int id) {
        int posicao = consultarIndice(id);
        if (posicao != -1) {
            for (int i = posicao; i < indice; i++) {
                postagems[i] = postagems[i + 1];
            }

            indice--;
        }
        else{
            System.out.println("Postagem inexistente.");
        }
    }

    Postagem consultarPostagem(int id) {
        Postagem postagem = null;
        for (int i = 0; i < indice; i++) {
            if (postagems[i].id == id) {
                postagem = postagems[i];
                break;
            }
        }
        return postagem;
    }

    void curtir(int id){
        Postagem postagem;
        postagem = consultarPostagem(id);
        if(postagem != null)
            postagem.curtir();
        else
            System.out.println("Postagem inexistente.");
    }

    Postagem maisCurtida(){
        Postagem postagem = null;
        if(indice > 0){
            postagem = postagems[0];
            int qtdTemp = postagems[0].qtdCurtidas;
            for (int i = 0; i < indice; i++) {
                if(qtdTemp < postagems[i].qtdCurtidas){
                    qtdTemp = postagems[i].qtdCurtidas;
                    postagem = postagems[i];
                }
            }
        }

        return postagem;
    }
}

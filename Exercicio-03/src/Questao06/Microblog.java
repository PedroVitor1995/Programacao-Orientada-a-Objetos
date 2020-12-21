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

    Postagem[] maisCurtida(){
        int qtd = 0;
        for (int i = 0; i < postagems.length; i++) {
            if(postagems[i] != null)
                qtd++;
        }

        Postagem[] postagemsTemp = new Postagem[qtd];

        int posTemp = 0;
        for(int i = 0; i < postagems.length; i++) {
            if(postagems[i] != null){
                postagemsTemp[posTemp] = postagems[i];
                posTemp++;
            }
        }
        Postagem aux = null;

        Postagem[] maisCurtida = new Postagem[qtd];

        if(indice > 0){
            for(int i = 0; i<postagemsTemp.length; i++){
                for(int j = 0; j<postagemsTemp.length-1; j++){
                    if(postagemsTemp[j].qtdCurtidas > postagemsTemp[j + 1].qtdCurtidas){
                        aux = postagemsTemp[j];
                        postagemsTemp[j] = postagemsTemp[j+1];
                        postagemsTemp[j+1] = aux;
                    }
                }
            }

            int pos = 0;
            int qtdCurtidas = postagemsTemp[postagemsTemp.length-1].qtdCurtidas;

            for(int i = 0; i<postagemsTemp.length; i++){
                if(postagemsTemp[i].qtdCurtidas == qtdCurtidas){
                    maisCurtida[pos] = postagemsTemp[i];
                    pos++;
                }
            }


        }
        return maisCurtida;
    }
}

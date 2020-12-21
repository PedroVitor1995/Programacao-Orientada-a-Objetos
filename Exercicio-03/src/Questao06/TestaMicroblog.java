package Questao06;

public class TestaMicroblog {
    public static void main(String[] args) {
        Microblog microblog = new Microblog(5);
        Postagem postagem1 = new Postagem(1,"Primeira postagem");
        microblog.inserir(postagem1);
        Postagem postagem2 = new Postagem(2,"Segunda postagem");
        microblog.inserir(postagem2);

        microblog.curtir(1);
        microblog.curtir(1);
        microblog.curtir(1);
        microblog.curtir(2);
        microblog.curtir(2);


        for (Postagem m:
             microblog.postagems) {
            System.out.println(m);
        }
    }
}

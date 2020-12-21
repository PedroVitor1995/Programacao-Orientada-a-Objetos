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

        System.out.println("Postagem mais curtida");
        for (Postagem p:
             microblog.maisCurtida()) {
            if(p != null)
                System.out.println("Postagem: "+p);
        }

        microblog.curtir(2);

        System.out.println("Postagem mais curtida");
        for (Postagem p:
                microblog.maisCurtida()) {
            if(p != null)
                System.out.println("Postagem: "+p);
        }


        System.out.println("\n Todas as Postagem");
        for (Postagem p:
             microblog.postagems) {
            if(p != null)
                System.out.println("Postagem: "+p);
        }


    }
}

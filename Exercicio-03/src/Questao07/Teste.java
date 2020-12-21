package Questao07;

public class Teste {
    public static void main(String[] args) {
        args = new String[]{"9","5","6","7","0"};


        int[] inteiros = new int[args.length];
        int aux = 0;
        int i = 0;

        for (i  = 0; i < args.length; i++)
            inteiros[i] = Integer.parseInt(args[i]);

        System.out.println("Vetor desordenado: ");
        for(i = 0; i<inteiros.length; i++)
            System.out.println(" "+inteiros[i]);

        System.out.println(" ");

        for(i = 0; i<inteiros.length; i++){
            for(int j = 0; j<inteiros.length-1; j++){
                if(inteiros[j] > inteiros[j + 1]){
                    aux = inteiros[j];
                    inteiros[j] = inteiros[j+1];
                    inteiros[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(i = 0; i<inteiros.length; i++)
            System.out.println(" "+inteiros[i]);
    }
}

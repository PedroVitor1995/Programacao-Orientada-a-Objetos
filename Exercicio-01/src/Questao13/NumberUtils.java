package Questao13;

public class NumberUtils {
    public int numero;

    public boolean isPair(){
        if(numero % 2 == 0)
            return true;
        return false;
    }

    public boolean isOdd(){
        if(numero % 2 == 0)
            return false;
        return true;
    }

    public boolean isPrime(){
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }

    public String printCount(){
        String numeros = "";
        for (int i = 0; i <= numero; i++) {
            if(i == numero){
                numeros += i;
            }
            else{
                numeros += i + ", ";
            }
        }
        return numeros;
    }

    public  String printReverseCount(){
        String numeros = "";
        for (int i = numero; i >= 0; i--) {
            if(i == 0){
                numeros += i;
            }
            else{
                numeros += i + ", ";
            }
        }
        return numeros;
    }
}

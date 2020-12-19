package Questao03;

public class Senha {
    String valor;

    public boolean iguais(String valor){
        if(this.valor == valor)
            return true;
        return false;
    }

    public  boolean iguaisTrim(String valor){
        if(this.valor.trim().equals(valor.trim()))
            return true;
        return false;
    }

    public  boolean tamanhoSeguro(){
        if(this.valor.length() >= 6)
            return true;
        return false;
    }

    public boolean possuiMaiusculaMinuscula(){
        boolean achouMaiuscula = false, achouMinuscula = false;
        for (var caractere:
             this.valor.toCharArray()) {
            if(caractere >= 'A' && caractere <= 'Z')
                achouMaiuscula = true;
            if(caractere >= 'a' && caractere <= 'z')
                achouMinuscula = true;
        }

        if(achouMaiuscula == true && achouMinuscula == true)
            return true;
        return false;
    }

    public boolean possuiNumero(){
        for (var caractere:
                this.valor.toCharArray()) {
            if(caractere >= '0' && caractere <= '9')
               return true;
        }
        return false;
    }

    public boolean ehValida(){
        if(tamanhoSeguro() && possuiMaiusculaMinuscula() && possuiNumero())
            return true;
        return false;
    }
}

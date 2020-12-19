package Questao03;

public class TestaSenha {
    public static void main(String[] args) {
        Senha senha = new Senha();
        senha.valor = "Teste321";

        System.out.println("Igual: " + senha.iguais("Teste321"));
        System.out.println("Igual Trim: " + senha.iguaisTrim(" Teste321 "));
        System.out.println("Tamanho Seguro: " + senha.tamanhoSeguro());
        System.out.println("Possui um maiúsculo e um minúsculo: " + senha.possuiMaiusculaMinuscula());
        System.out.println("Possui número: " + senha.possuiNumero());
        System.out.println("Senha válida: " + senha.ehValida());
    }
}

package Questao08;

public class CheckedException {
    public static void main(String[] args) {

        try {
            int num1 = 10;
            int num2 = 0;
            System.out.println("A resposta da divisão é: " + num1/num2);
        } catch (ArithmeticException ex) {
            System.out.println("Não é possivel divisão por zero");
        }
    }
}

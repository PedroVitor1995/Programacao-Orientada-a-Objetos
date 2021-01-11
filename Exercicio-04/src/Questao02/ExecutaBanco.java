package Questao02;

import java.util.Scanner;

public class ExecutaBanco {
    public static void main(String[] args) {
        Banco b = new Banco();
        Scanner sc = new Scanner(System.in);
        String opcao , numero,numero2;
        double valor;
        Conta c = new Conta();

        do {
            System.out.println("1-Cadastrar 2-Alterar 3-Excluir 4-Consultar" +
                    " 5-Creditar 6-Debitar 7-Tranferir 9-Sair");
            opcao = sc.next();
            switch (opcao) {
                case "1":
                    // Cadastro de Conta
                    System.out.println("Cadastro de Conta");
                    System.out.println("Digite o número: ");
                    c.numero = sc.next ();
                    c.saldo = sc.nextDouble();
                    b.inserir(c);
                    break;
                case "2":
                    // Alteração de Conta
                    System.out.println("Alteração de Conta");
                    System.out.println("Digite o número: ");
                    c.numero = sc.next ();
                    c.saldo = sc.nextDouble();
                    b.alterar(c);
                    break;
                case "3":
                    // Exclusão de Conta
                    System.out.println("Exclusão de Conta");
                    System.out.println("Digite o número: ");
                    numero = sc.next ();
                    b.excluir(numero);
                    break;
                case "4":
                    // Consulta de Conta
                    System.out.println("Consulta de Conta");
                    System.out.println("Digite o número: ");
                    numero = sc.next ();
                    c = b.consultar(numero);
                    if(c == null){
                        System.out.println("Conta inexistente.");
                    }
                    else{
                        System.out.println("Número: " +c.numero);
                        System.out.println("Saldo: " +c.saldo);
                    }
                    break;
                case "5":
                    // Creditar Conta
                    System.out.println("Creditar Conta");
                    System.out.println("Digite o número: ");
                    numero = sc.next ();
                    System.out.println("Digite o valor: ");
                    valor = sc.nextDouble ();
                    b.creditar(numero,valor);
                    break;
                case "6":
                    // Debitar Conta
                    System.out.println("Debitar Conta");
                    System.out.println("Digite o número: ");
                    numero = sc.next ();
                    System.out.println("Digite o valor: ");
                    valor = sc.nextDouble ();
                    b.debitar(numero,valor);
                    break;
                case "7":
                    // Transferir
                    System.out.println("Transferir");
                    System.out.println("Digite o número da conta origem: ");
                    numero = sc.next ();
                    System.out.println("Digite o número da conta destino: ");
                    numero2 = sc.next ();
                    System.out.println("Digite o valor: ");
                    valor = sc.nextDouble ();
                    b.transferir(numero2,numero,valor);
                    break;
            }
        } while (!opcao.equals("9") );
    }
}

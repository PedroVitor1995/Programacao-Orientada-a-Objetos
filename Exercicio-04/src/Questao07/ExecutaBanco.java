package Questao07;

import java.util.Scanner;

public class ExecutaBanco {
    public static void main(String[] args) {
        Banco b = new Banco();
        Scanner sc = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("1-Cadastrar 2-Alterar 3-Excluir 4-Consultar" +
                    " 5-Creditar 6-Debitar 7-Tranferir 9-Sair");
            opcao = sc.next();
            switch (opcao) {
                case "1":
                    // Cadastro de Conta
                    Conta c = new Conta();
                    System.out.println("Cadastro de Conta");
                    System.out.println("Digite o número: ");
                    c.setNumero(sc.next ());
                    c.setSaldo(sc.nextDouble());
                    b.inserir(c);
                    break;
                case "2":
                    // Alteração de Conta
                    Conta cc = new Conta();
                    System.out.println("Alteração de Conta");
                    System.out.println("Digite o número: ");
                    cc.setNumero(sc.next ());
                    cc.setSaldo(sc.nextDouble());
                    b.alterar(cc);
                    break;
                case "3":
                    // Exclusão de Conta
                    System.out.println("Exclusão de Conta");
                    System.out.println("Digite o número: ");
                    String numero = sc.next ();
                    b.excluir(numero);
                    break;
                case "4":
                    // Consulta de Conta
                    System.out.println("Consulta de Conta");
                    System.out.println("Digite o número: ");
                    String num = sc.next ();
                    c = b.consultar(num);
                    if(c == null){
                        System.out.println("Conta inexistente.");
                    }
                    else{
                        System.out.println("Número: " +c.getNumero());
                        System.out.println("Saldo: " +c.getSaldo());
                    }
                    break;
                case "5":
                    // Creditar Conta
                    System.out.println("Creditar Conta");
                    System.out.println("Digite o número: ");
                    String conta = sc.next ();
                    System.out.println("Digite o valor: ");
                    double valor = sc.nextDouble ();
                    b.creditar(conta,valor);
                    break;
                case "6":
                    // Debitar Conta
                    System.out.println("Debitar Conta");
                    System.out.println("Digite o número: ");
                    String cconta = sc.next ();
                    System.out.println("Digite o valor: ");
                    double vvalor = sc.nextDouble ();
                    b.debitar(cconta,vvalor);
                    break;
                case "7":
                    // Transferir
                    System.out.println("Transferir");
                    System.out.println("Digite o número da conta origem: ");
                    String contaOrigem = sc.next ();
                    System.out.println("Digite o número da conta destino: ");
                    String contaDestino = sc.next ();
                    System.out.println("Digite o valor: ");
                    double valorTransf = sc.nextDouble ();
                    b.transferir(contaDestino,contaOrigem,valorTransf);
                    break;
            }
        } while (!opcao.equals("9") );
    }
}

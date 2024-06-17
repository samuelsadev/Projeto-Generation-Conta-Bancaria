package conta;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {


        // Teste da Classe Conta Corrente
        ContaCorrente cc1 = new ContaCorrente(132, 1321, 1, "DLC ELDEN RING", 0.0f, 5000.0f);
        cc1.visualizar();
        cc1.sacar(200.0f);
        cc1.visualizar();
        cc1.depositar(2000.0f);
        cc1.visualizar();

        // Teste da Classe Conta Poupança
        ContaPoupanca cp1 = new ContaPoupanca(213, 1321, 2, "STEAM", 10000.0f, 10);
        cp1.visualizar();
        cp1.sacar(2000.0f);
        cp1.visualizar();
        cp1.depositar(3000.0f);
        cp1.visualizar();

        Scanner scanner = new Scanner(System.in);


        int op;

        while (true) {

            System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND
                    + "*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                BANCO DO SADEV                       ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Criar Conta                          ");
            System.out.println("            2 - Listar todas as Contas               ");
            System.out.println("            3 - Buscar Conta por Numero              ");
            System.out.println("            4 - Atualizar Dados da Conta             ");
            System.out.println("            5 - Apagar Conta                         ");
            System.out.println("            6 - Sacar                                ");
            System.out.println("            7 - Depositar                            ");
            System.out.println("            8 - Transferir valores entre Contas      ");
            System.out.println("            9 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     " + Cores.TEXT_RESET);

            try {
                op = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("\nDigite valores inteiros!");
                scanner.nextLine();
                op = 0;
            }


            if (op == 9) {
                System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do SADEV - O seu Futuro começa aqui!");
                sobre();
                scanner.close();
                System.exit(0);
            }

            switch (op) {
                case 1:
                    System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

                    keyPress();
                    break;
                case 2:
                    System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

                    keyPress();
                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

                    keyPress();
                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

                    keyPress();
                    break;
                case 5:
                    System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

                    keyPress();
                    break;
                case 6:
                    System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

                    keyPress();
                    break;
                case 7:
                    System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

                    keyPress();
                    break;
                case 8:
                    System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");

                    keyPress();
                    break;
                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                    keyPress();
                    break;
            }
        }
    }
    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Samuel Almeida de Sá");
        System.out.println("Generation Brasil - generation@generation.org");
        System.out.println("github.com/samuelsadev");
        System.out.println("*********************************************************");
    }

    public static void keyPress() {
        try {
            System.out.println(Cores.TEXT_RESET + "\nPressione Enter para continuar");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de Enter");
        }
    }
}
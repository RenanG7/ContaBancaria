package ContaBan;

import java.io.IOException;
import java.util.InputMismatchException;
import Conta_Model.ContaPoupanca;
import Conta_Model.ContaCorrente;
import java.util.Scanner;
import Conta_Model.conta;
import Conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		// Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		while (true) {
			System.out.println("*******************************************************************************");
			System.out.println("                                                                               ");
			System.out.println("                           BANCO DO BRZIL                                      ");
			System.out.println("                                                                               ");
			System.out.println("*******************************************************************************");
			System.out.println("                                                                               ");
			System.out.println("                      1- Criar Conta                                           ");
			System.out.println("                      2- Listar Todas as Contas                                ");
			System.out.println("                      3- Buscar Conta por Numero                               ");
			System.out.println("                      4- Atualizar Dados da Conta                              ");
			System.out.println("                      5- Apagar Conta                                          ");
			System.out.println("                      6- Sacar                                                 ");
			System.out.println("                      7- Depositar                                             ");
			System.out.println("                      8- Transferir Valores Entre Contas                       ");
			System.out.println("                      9- Sair                                                  ");
			System.out.println("                                                                               ");
			System.out.println("*******************************************************************************");
			System.out.println("                      Entre com a opção esejada:                               ");
			System.out.println("                                                                               ");

			int opcao = 0;
			try {
				 opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				if (opcao == 9) {
					System.out.println("\nBanco do Brazil - O seu futuro é aqui! ");
					leia.close();
					System.exit(9);
				}
			}
			switch (opcao) {
			case 1:
				System.out.println("\nCriar conta\n\n ");
				keyPress();
				break;
			case 2:
				System.out.println("\nListar Todas as Contas\n\n ");
				keyPress();
				break;
			case 3:
				System.out.println("\nConsultar dados da conta -- Por Numero:\n\n ");
				keyPress();
				break;
			case 4:
				System.out.println("\nAtualizar dados da conta\n\n ");
				keyPress();
				break;
			case 5:
				System.out.println("\nApagar conta\n\n ");
				keyPress();
				break;
			case 6:
				System.out.println("\nSaque\n\n ");
				keyPress();
				break;
			case 7:
				System.out.println("\nDeposito\n\n ");
				keyPress();
				break;
			case 8:
				System.out.println("\nTransferencia entre contas\n\n ");
				keyPress();
				break;
			default:
				System.out.println("\nOpção invalida\n\n ");
				keyPress();
				break;
			}
		}

	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}

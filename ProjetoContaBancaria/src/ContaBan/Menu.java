package ContaBan;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while(true) {
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
			opcao = leia.nextInt();
		
			if(opcao == 9){
				System.out.println("\nBanco do Brazil - O seu futuro é aqui! ");
				leia.close();
				System.exit(0);
			}
			switch(opcao) {
			case 1:
				System.out.println("\nCriar conta\n\n ");
				break;
			case 2:
				System.out.println("\nListar Todas as Contas\n\n ");
				break;
			case 3:
				System.out.println("\nConsultar dados da conta -- Por Numero:\n\n ");
				break;
			case 4:
				System.out.println("\nAtualizar dados da conta\n\n ");
				break;
			case 5:
				System.out.println("\nApagar conta\n\n ");
				break;
			case 6:
				System.out.println("\nSaque\n\n ");
				break;
			case 7:
				System.out.println("\nDeposito\n\n ");
				break;
			case 8:
				System.out.println("\nTransferencia entre contas\n\n ");
				break;
			default:
				System.out.println("\nOpção invalida\n\n ");
				break;
			}
		}

	}

}

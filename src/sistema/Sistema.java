package sistema;

import java.util.Scanner;

import service.HandleMenu;
import service.HandleMenuP;

public class Sistema {

	public static void main(String[] args) {
		// Criar Scanner para capturar dados
		Scanner sc = new Scanner(System.in);
		HandleMenu hm = new HandleMenu();

		HandleMenuP hmp = new HandleMenuP();
		int opcao = 0;
		do {
			// \n
			System.out.print(
					"1 - Criar \n2 - Editar \n3 - Deletar \n4 - Listar \n5 - Listar único usuário \n6 - Criar Produto \n7 - Editar Produto \n8 - Deletar Produto \n9 - Listar Produto \n10 - Listar único produto \n11 - Sair\n");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1: {
				hm.criar();
				break;
			}
			case 2: {
				hm.editar();
				break;
			}
			case 3: {
				hm.deletar();
				break;
			}
			case 4: {
				hm.listar();
				break;
			}
			case 5: {
				hm.listUnico();
				break;
			}
			case 6: {
				hmp.criar();
			}
			case 7: {
				hmp.editar();
			}
			case 8: {
				hmp.deletar();
			}
			case 9: {
				hmp.listar();
			}
			case 10: {
				hmp.listUnico();
			}
			case 11:{
				System.out.println("Sistema Finalizado");
			}
			default:
				System.out.println("Opção Invalida");
				break;
			}

		} while (opcao != 11);
		sc.close();

	}

}

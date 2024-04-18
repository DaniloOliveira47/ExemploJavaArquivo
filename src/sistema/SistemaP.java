package sistema;

import java.util.Scanner;


import service.HandleMenuP;

public class SistemaP {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		HandleMenuP hmp = new HandleMenuP();
		int opcao = 0;
		do {
			// \n
			System.out.print("1 - Criar Produto \n2 - Editar Produto \n3 - Deletar Produto \n4 - Listar Produto \n5 - Listar único produto \n9 - Sair\n");
		
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1: { 
				hmp.criar();
				break;
			}
			case 2: {
				hmp.editar();
				break;
			}
			case 3: {
				hmp.deletar();
				break;
			}
			case 4: {
				hmp.listar();
				break;
			}
			case 5: {
				hmp.listUnico();
				break;
			}
			
			default:
				System.out.println("Opção Invalida");
				break;
			}
		
		}
		while (opcao != 9);
		sc.close();

	}
	}



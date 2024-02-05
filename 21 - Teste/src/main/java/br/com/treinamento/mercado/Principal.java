package br.com.treinamento.mercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.treinamento.mercado.model.Cliente;

public class Principal {
	
	static List<Cliente> clienteList = new ArrayList<Cliente>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {

			System.out.println("Sistema de Vendas - Selecione uma opção:");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("5 - Sair");

			System.out.print("Opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:

				System.out.println("Cadastro de Clientes");
				System.out.println("---------------------------------------------------------------");
				
				System.out.print("Nome: ");
				String nome = scanner.nextLine();
				System.out.print("E-mail: ");
				String email = scanner.nextLine();

				clienteList.add(new Cliente(nome, email));			

				break;
			case 2:
				System.out.println("Listagem de Clientes");
		        System.out.println("---------------------------------------------------------------");
		        System.out.println("Nome \\ E-mail");
		        System.out.println("---------------------------------------------------------------");
		        clienteList.forEach(c -> System.out.println(c.getNome() + " - " + c.getEmail()));
		        System.out.println("---------------------------------------------------------------");
		        
		        System.out.print("Pressiona enter para voltar ao menu de opção");
		        scanner.nextLine();
		        
				break;
			case 5:
				scanner.close();
				System.out.println("Saindo...");
				System.exit(0);
			default:
				System.out.println("Opção inválida. Tente novamente.\n");
			}

		}

	}
	
}

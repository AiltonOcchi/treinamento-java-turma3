package br.com.treinamento.mercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.treinamento.mercado.model.Cliente;
import br.com.treinamento.mercado.model.Produto;
import br.com.treinamento.mercado.service.MercadoService;

public class Main {		

	static Scanner scanner = new Scanner(System.in);
    static List<Produto> produtoList = new ArrayList<>();
    static List<Cliente> clienteList = new ArrayList<>();
    
	public static void main(String[] args) {			

		while (true) {
			
			MercadoService.exibirMenu();

			System.out.print("Opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine(); // Adicionado para consumir a quebra de linha

			switch (opcao) {
			case 1:				
				cadastrarCliente();
				break;
			case 2:
				cadastrarProduto();
				break;
			case 3:
				listarClientes();			
				break;
			case 4:
				listarProdutos();
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

	private static void cadastrarClient0e() {
		System.out.println("Cadastro de Clientes");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        clienteList.add(new Cliente(nome, email));

		
	}

	private static void cadastrarProduto() {
		// Implementação do cadastro de produtos
	}

	private static void listarClientes() {
		System.out.println("Listagem de Clientes");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Nome \t\t\tE-mail");
        System.out.println("---------------------------------------------------------------");
        clienteList.forEach(c -> System.out.println(c.getNome() + "\t\t\t" + c.getEmail()));
        System.out.println("---------------------------------------------------------------");
        
        System.out.print("Pressiona enter para voltar ao menu de opção");
        scanner.nextLine();
        
        
	}

	private static void listarProdutos() {
		
        System.out.println("Listagem de Produtos");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Nome\t\t\tPreço");
        System.out.println("---------------------------------------------------------------");
        produtoList.forEach(p -> System.out.println(p.getNome() + "\t\t\t" + p.getPreco()));
        System.out.println("---------------------------------------------------------------");
        
	}

}

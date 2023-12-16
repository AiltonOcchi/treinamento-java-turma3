package br.com.treinamento.pedidos.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.treinamento.pedido.service.ClienteService;
import br.com.treinamento.pedido.service.MercadoService;
import br.com.treinamento.pedido.service.ProdutoService;
import br.com.treinamento.pedidos.model.Cliente;
import br.com.treinamento.pedidos.model.Produto;

public class SistemaCompras {
	
	public static Scanner scanner = new Scanner(System.in);
	public static List<Cliente> clienteList = new ArrayList<Cliente>();
	public static List<Produto> produtoList = new ArrayList<Produto>();
	
	public static void main(String[] args) {
		
		while(true) {
			
			MercadoService.montarMenu();
			
			System.out.print("Informe uma opção:");
			Integer opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1: {
				ClienteService.cadastrarCliente();
				break;
			}
			case 2:{
				ClienteService.listarClientes();
				break;
			}
			case 3:{
				ProdutoService.cadastrarProduto();
				break;
			}
			case 5:{
				scanner.close();
				System.out.println("Saindo do programa...");
				System.exit(0);
			}
			default:
				System.out.println("Opção inválida. Tente novamente");
			}
			
		}
	}
	
	

}

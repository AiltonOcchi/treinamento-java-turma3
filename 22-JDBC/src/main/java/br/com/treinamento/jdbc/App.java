package br.com.treinamento.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.treinamento.jdbc.service.ProdutoService;
import br.com.treinamento.jdbc.service.SistemaService;

public class App {
	
	public static Scanner scanner = new Scanner(System.in);
	 
	public static void main(String[] args) throws SQLException {
		
		ProdutoService produtoService = new ProdutoService();
		
		while(true) {
			
			SistemaService.montaMenu();
			System.out.println("\nInforme uma opção");
			Integer opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcao) {
			case 1: {
				produtoService.cadastrarProduto();
				break;
			}
			case 2: {
				produtoService.listarProdutos();
				break;
			}
			case 3: {
				produtoService.visualizarProduto();
				break;
			}
			case 4: {
				produtoService.excluirProduto();
				break;
			}
			case 5: {
				produtoService.atualizarProduto();
				break;
			}
			default:
				System.out.println("Opção inválida");
			}
			
			
			
		}
		
		
		
		
	}

	
}

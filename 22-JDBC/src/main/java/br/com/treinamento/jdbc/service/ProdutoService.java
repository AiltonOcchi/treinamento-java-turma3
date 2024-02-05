package br.com.treinamento.jdbc.service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import br.com.treinamento.jdbc.App;
import br.com.treinamento.jdbc.dao.ProdutoDao;
import br.com.treinamento.jdbc.model.Produto;

public class ProdutoService {
	
	
	public void cadastrarProduto() {
		System.out.println("Cadastrar Produto");
		
		System.out.print("Informe o nome do produto:");
		String nome = App.scanner.nextLine();
		
		System.out.print("Informe o preço:");
		BigDecimal preco = App.scanner.nextBigDecimal();
		App.scanner.nextLine();
		
		Produto produto = new Produto(nome, preco);
		
		try {
			salvarProduto(produto);
			System.out.println("Produto cadastro com sucesso!\nPressione enter para continuar...");
			App.scanner.nextLine();
			
		} catch (SQLException e) {
			System.out.println("Erro ao salvar o produto:" +e.getMessage());
			System.out.println("Pressione enter para voltar para o menu...");
			App.scanner.nextLine();
		}
		
	}
	
	/**
	 * Salva um produto
	 */
	public void salvarProduto(Produto produto) throws SQLException {
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.salvarProduto(produto);
	}

	public void listarProdutos() throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		List<Produto> produtos =  produtoDao.listarProdutos();
		
		System.out.println("Lista de Produtos");
		System.out.println("\n------------------------------------------");
		System.out.printf("%-15s %-15s %-10s", "Código", "Nome", "Preço");
		System.out.println("\n------------------------------------------");
		
		for(Produto produto : produtos) {
			System.out.printf("\n%-15s %-15s %-10s", produto.getId() , produto.getNome(), produto.getPreco());
		}
		
		System.out.println("\nFim da lista.\nPressione enter para voltar para o menu...");
		App.scanner.nextLine();
		
	}

	public void visualizarProduto() throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		
		System.out.println("Detalhar Produto");
		
		System.out.print("Informe o código do produto:");
		Integer codigo = App.scanner.nextInt();
		App.scanner.nextLine();
		
		
		Optional<Produto> produtoOptional = produtoDao.buscaPorId(codigo);
		
		if(produtoOptional.isEmpty()) {
			System.out.println("Produto não encontrado");
		}else {
			Produto produto = produtoOptional.get();
			System.out.println("Nome do produto: "+produto.getNome());
			System.out.println("Preço do produto: "+produto.getPreco());
		}
		
		
		System.out.println("\nPressione enter para voltar para o menu...");
		App.scanner.nextLine();
		
	}

	public void excluirProduto() throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		
		System.out.println("Excluir Produto");
		System.out.print("Informe o código do produto:");
		Integer codigo = App.scanner.nextInt();
		App.scanner.nextLine();
		
		Optional<Produto> produtoOptional = produtoDao.buscaPorId(codigo);
		
		if(produtoOptional.isEmpty()) {
			System.out.println("Produto não encontrado");
		}else {
			Produto produto = produtoOptional.get();
			System.out.print("Deseja realmente excluir o produto "+produto.getNome()+"? (S/N):");
			String confirmacao = App.scanner.nextLine();
			
			if(confirmacao.equalsIgnoreCase("S")){
				produtoDao.excluir(codigo);
				System.out.println("Produto excluído com sucesso!");
			}else {
				System.out.println("Exclusão cancelada.");
			}
			
		}
		
		System.out.println("\nPressione enter para voltar para o menu...");
		App.scanner.nextLine();
		
		
	}

	public void atualizarProduto() throws SQLException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		
		System.out.println("Atualizar Produto");
		System.out.print("Informe o código do produto:");
		Integer codigo = App.scanner.nextInt();
		App.scanner.nextLine();
		
		Optional<Produto> produtoOptional = produtoDao.buscaPorId(codigo);
		
		if(produtoOptional.isEmpty()) {
			System.out.println("Produto não encontrado");
		}else {
			Produto produto = produtoOptional.get();
			
			System.out.print("Informe o nome do produto:");
			String nome = App.scanner.nextLine();
			produto.setNome(nome);
			
			System.out.print("Informe o preço:");
			BigDecimal preco = App.scanner.nextBigDecimal();
			App.scanner.nextLine();
			produto.setPreco(preco);
			
			produtoDao.atualizar(produto);
			
			System.out.println("\nProduto alterado com sucesso!");
			
		}
		
		System.out.println("\nPressione enter para voltar para o menu...");
		App.scanner.nextLine();
		
		
	}

}

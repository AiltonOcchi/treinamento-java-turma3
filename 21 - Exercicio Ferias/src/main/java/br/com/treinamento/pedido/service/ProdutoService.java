package br.com.treinamento.pedido.service;

import java.math.BigDecimal;

import br.com.treinamento.pedidos.main.SistemaCompras;

public class ProdutoService {

	public static void cadastrarProduto() {
		System.out.println("Cadastro de Produtos");
		System.out.println("--------------------------------------------");
		
		System.out.print("Nome: ");
		String nome = SistemaCompras.scanner.nextLine();
		
		System.out.print("Preço:");
		String precoString = SistemaCompras.scanner.nextLine();
		BigDecimal preco = new BigDecimal(precoString);
		
		//SistemaCompras.produtoList.add(new Produto(nome, preco));
	}

}

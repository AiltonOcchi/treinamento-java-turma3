package br.com.treinamento.mercado.main;

import java.math.BigDecimal;

import br.com.treinamento.mercado.model.Cliente;
import br.com.treinamento.mercado.model.Pedido;
import br.com.treinamento.mercado.model.Produto;

public class Teste {
	
	
	public static void main(String[] args) {
		
		

		Cliente cliente = new Cliente("Ailton", "ailton@");
		
		Produto produto1 = new Produto("Arroz", new BigDecimal("35.50"));
		Produto produto2 = new Produto("Feijão", new BigDecimal("20.80"));
		
		Pedido pedido = new Pedido(cliente);
		pedido.insereProduto(produto1);
		pedido.insereProduto(produto2);
		
		System.out.println(pedido);
		
		
		
		
		
		
	}
	
	
	
}

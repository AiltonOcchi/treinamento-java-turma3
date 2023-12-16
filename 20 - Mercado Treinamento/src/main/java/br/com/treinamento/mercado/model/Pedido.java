package br.com.treinamento.mercado.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Pedido {
	
	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}

	@Getter @Setter
	private Cliente cliente;
	
	@Getter @Setter
	private List<Produto> produtoList = new ArrayList<Produto>();
	
	@Getter @Setter
	private BigDecimal total;
	
	public void insereProduto(Produto produto) {
		produtoList.add(produto);
	}

}

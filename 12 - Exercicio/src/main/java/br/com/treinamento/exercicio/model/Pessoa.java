package br.com.treinamento.exercicio.model;

import lombok.Getter;

public class Pessoa {
	
	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	@Getter
	private String nome;
	
	@Getter
	private Integer idade;

}

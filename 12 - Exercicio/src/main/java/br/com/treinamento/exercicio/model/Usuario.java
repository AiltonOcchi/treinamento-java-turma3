package br.com.treinamento.exercicio.model;

import lombok.Getter;

public class Usuario extends Pessoa {
	
	public Usuario(String nome, Integer idade, String email, String telefone) {
		super(nome, idade);
		this.email = email;
		this.telefone = telefone;
	}
	
	@Getter
	private String email;
	
	@Getter
	private String telefone;

}

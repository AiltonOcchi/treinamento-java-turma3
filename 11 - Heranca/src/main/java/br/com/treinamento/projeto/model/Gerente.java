package br.com.treinamento.projeto.model;

import lombok.Getter;
import lombok.Setter;

public class Gerente extends Funcionario {

	public Gerente(String nome, Integer registro) {
		super(nome, registro);
		System.out.println("Construtor da classe filha (Gerente)");
	}

	@Getter @Setter
	private Double salario;
	
	@Override
	public void mensagem() {
		System.out.println("Mensagem sobrescrita");
	}
}

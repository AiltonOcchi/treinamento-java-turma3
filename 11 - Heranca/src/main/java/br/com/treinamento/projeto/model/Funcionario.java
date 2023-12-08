package br.com.treinamento.projeto.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Funcionario {

	
	public Funcionario(String nome, Integer registro) {
		this.nome = nome;
		this.registro = registro;
		System.out.println("Construtor vem da classe pai (Funcionario) ");
	}
	

	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private Integer registro;
	
	
	public void mensagem() {
		System.out.println("Mensagem padrão classe funcionario");
	}

	
	

}

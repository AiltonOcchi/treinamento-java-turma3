package br.com.treinamento.exercicio.model;

import lombok.Getter;
import lombok.Setter;

public class Biblioteca {
	
	@Getter @Setter
	private Usuario usuario;
	
	@Getter @Setter
	private Livro livro;

}

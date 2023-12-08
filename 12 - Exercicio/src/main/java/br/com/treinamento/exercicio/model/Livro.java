package br.com.treinamento.exercicio.model;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Livro {
	
	public Livro(String titulo, String autor, Boolean emprestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.emprestado = emprestado;
	}

	@Getter
	private String titulo;
	
	@Getter
	private String autor;
	
	@Getter
	private Boolean emprestado;
	
	
	public void emprestar() {
		this.emprestado = true;
	}
	
	
	public void devolver() {
		this.emprestado = false;
	}

}

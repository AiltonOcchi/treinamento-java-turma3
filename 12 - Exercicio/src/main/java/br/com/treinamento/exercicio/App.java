package br.com.treinamento.exercicio;

import br.com.treinamento.exercicio.model.Biblioteca;
import br.com.treinamento.exercicio.model.Livro;
import br.com.treinamento.exercicio.model.Usuario;

public class App {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Ailton",39,"ailton.occhi@hotmail.com","(11)981686370");
		Livro livro = new Livro("A volta dos que não foram", "Zé Miguel", false);
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setUsuario(usuario);
		biblioteca.setLivro(livro);
		
		System.out.println(biblioteca.getLivro());
		
		biblioteca.getLivro().emprestar();
		
		System.out.println(biblioteca.getLivro());
		
		biblioteca.getLivro().devolver();
		
		System.out.println(biblioteca.getLivro());
		
	}
}

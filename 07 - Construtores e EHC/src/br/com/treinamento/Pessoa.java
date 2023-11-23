package br.com.treinamento;

import java.util.Objects;

public class Pessoa {
	
	public Pessoa() {
		System.out.println("Classe Pessoa Inicializada");
	}
	
	public Pessoa(String texto) {
		System.out.println("O texto informado é:" +texto);
	}
	
	// Atributos
	private String nome;
	private Integer idade;
	
	
	
	
	
	
	
	
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
	
	// Equal e HasCode
	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}
	
	
	
	
	

}

package br.com.treinamento;

public class Cliente {
	
	//Atalho para gerar Get e Set: CTRL + 3 -> GGAS
	
	//Atritubos
	private String nome;
	private String cpf;
	private String senha;
	
	// Getters e Setters (Métodos de acessos)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf.replace("-", "").replaceAll("\\.", "");
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
		
		
}

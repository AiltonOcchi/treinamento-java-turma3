package br.com.treinamento;

public class Carro {

	private String marca;
	private String nome;
	private Integer anoFabricacao;
	
	public Carro(String marca, String nome, Integer anoFabricacao) {
		this.marca = marca;
		this.nome = nome;
		this.anoFabricacao = anoFabricacao;
	}
	
	public Carro(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public Integer idadeCarro(){
		return (2023-this.anoFabricacao);
	}

	

	//GETTERS E SETTERS
	
	
	
	
	
	

	public String getMarca() {
		return marca;
	}

	public String getNome() {
		return nome;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	
	//Atalho: CTRL+3: toString
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", nome=" + nome + ", anoFabricacao=" + anoFabricacao + "]";
	}

	
	
	
	
	

}

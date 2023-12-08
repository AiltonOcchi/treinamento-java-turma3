package br.com.treinamento.polimorfismo.model;

import lombok.Getter;

public class Gerente extends Funcionario {

	@Getter
	private Integer senha = 123;

	@Override
	public Double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}

	public Boolean autentica(Integer senha) {
		return (this.senha == senha);
	}

}

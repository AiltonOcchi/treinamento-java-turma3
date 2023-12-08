package br.com.treinamento.polimorfismo.main;

import br.com.treinamento.polimorfismo.model.Gerente;

public class TestaGerente {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Ailton");
		gerente.setSalario(5000.00);

		System.out.println("A bonificação do gerente é: "+ gerente.getBonificacao());
		
		System.out.println("Senha está correta? "+gerente.autentica(123));
		
		
	}

}

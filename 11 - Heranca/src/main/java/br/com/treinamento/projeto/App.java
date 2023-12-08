package br.com.treinamento.projeto;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.treinamento.projeto.model.Gerente;

public class App {
	public static void main(String[] args) {
		
		Formatter formatador = new CPFFormatter();
		String cpf = formatador.format("12345678900");
		System.out.println(cpf);
		
		Gerente gerente = new Gerente("Ailton", 123456);
		gerente.setSalario(1500.00);
		
		System.out.println(gerente);
		
		gerente.mensagem();
		
	}
}

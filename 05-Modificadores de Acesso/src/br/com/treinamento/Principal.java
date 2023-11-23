package br.com.treinamento;

import br.com.treinamento.modelo.Classe1;
import br.com.treinamento.modelo.Classe2;

public class Principal {
	
	public static void main(String[] args) {
		
		Classe1 classe1 = new Classe1();
		Classe2 classe2 = new Classe2();
		
		classe1.mensagem();
		
		//classe1.salario=500.00;
		
		System.out.println(classe1.getSalario());
		
		
	}

}

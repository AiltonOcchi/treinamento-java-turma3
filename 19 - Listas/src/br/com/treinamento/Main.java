package br.com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Ailton", 30);
		Pessoa pessoa2 = new Pessoa("Pietro", 9);
		Pessoa pessoa3 = new Pessoa("Guilherm", 14);
		
		
		List<Pessoa> bancoPessoas = new ArrayList<Pessoa>();
		bancoPessoas.add(pessoa1);
		bancoPessoas.add(pessoa2);
		bancoPessoas.add(pessoa3);
		
		/*
		for(int i = 0; i<bancoPessoas.size(); i++) {
			Pessoa pessoa = bancoPessoas.get(i);
			System.out.println(pessoa.getNome() + "-" +pessoa.getIdade());
		}
		*/
		
		/*
		for(Pessoa pessoa : bancoPessoas) {
			System.out.println(pessoa.getNome() + "-" +pessoa.getIdade());
		}
		*/
		
		
		bancoPessoas.forEach(p -> {
			System.out.println(p.getIdade()+2);
		});
		
	}

}

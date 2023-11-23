package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {
		
		String textoEmNumero = "39";
		
		Pessoa pessoaA = new Pessoa();
		pessoaA.setNome("Ailton");
		pessoaA.setIdade(Integer.valueOf(textoEmNumero));
		
		Pessoa pessoaB = new Pessoa();
		pessoaB.setNome("Ailton");
		pessoaB.setIdade(39);
		
		System.out.println("Pessoa A é igual e Pessoa B?"+ (pessoaA == pessoaB));// false
		System.out.println("Pessoa A é igual e Pessoa B?"+ pessoaA.equals(pessoaB));//true
		System.out.println("Hash pessoa A: "+ pessoaA.hashCode());//1961199145
		System.out.println("Hash pessoa B: "+ pessoaB.hashCode());//1961199145
		
	}

}

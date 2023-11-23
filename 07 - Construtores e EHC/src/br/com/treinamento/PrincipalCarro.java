package br.com.treinamento;

public class PrincipalCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro("VW", "Voyage", 2010);
		System.out.println("Nome do carro:" + carro.getNome());
		
		Carro carro2 = new Carro(1989);
		System.out.println("Idade do carro: "+carro2.idadeCarro());
		
		System.out.println(carro);
		
		
	}

}

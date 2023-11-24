package br.com.treinamento;

public class Principal {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setModelo("Voyage");
		carro.setAnoFrabricacao(2010);
		carro.setMotor("1.6");
				
		System.out.println(carro);
		
		
	}

}

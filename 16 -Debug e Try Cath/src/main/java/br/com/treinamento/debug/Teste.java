package br.com.treinamento.debug;

public class Teste {
	
	public static void main(String[] args) {
		
		try {
			Integer numero = null;
			System.out.println(numero/2);
		} catch (Exception e) {
			System.out.println("Não foi possível fazer a divisão");
			System.out.println("Motivo:" + e.getLocalizedMessage());
		}
		
		
		
		
	}

}

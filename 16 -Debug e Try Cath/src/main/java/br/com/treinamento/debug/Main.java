package br.com.treinamento.debug;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Início do método main");
		try {
			metodo1(2);
		} catch (Exception e) {
			System.out.println("Erro ao executar o método 1");
			System.out.println("Motivo: "+e.getLocalizedMessage());
		}
		System.out.println("Fim do método main");
		
	}

	private static void metodo1(Integer imposto) throws Exception {
		
		System.out.println("Início do método 1");
		if(imposto<3) {
			Exception ex = new Exception("O valor não pode ser menor que 3");
			throw ex;
		}
		
		metodo2();
		System.out.println("Fim do método 1");
		
	}

	private static void metodo2() {
		
		System.out.println("Início do método 2");
		for(int i=0;i<5;i++) {
			System.out.println("Valor de i:" +i);
		}
		System.out.println("Fim do método 2");
		
	}

}

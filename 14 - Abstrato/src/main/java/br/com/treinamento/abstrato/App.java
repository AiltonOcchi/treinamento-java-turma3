package br.com.treinamento.abstrato;

public class App {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marcelo");
		gerente.setDiasTrabalhados(22);
		gerente.setSalario(15000.00);
		
		System.out.println("O Valor do salário hora é:"+ gerente.calculaHoras());
		
	}
}
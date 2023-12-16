package br.com.treinamento;

import java.math.BigDecimal;
import java.math.MathContext;

public class Principal {

	public static void main(String[] args) {
		
		
		BigDecimal big1 = new BigDecimal("50.1");
		BigDecimal big2 = new BigDecimal("2");
		
		System.out.println("Adição / Soma");
		System.out.println(big1.add(big1).add(big1));
		
		System.out.println("Subtrai");
		System.out.println(big1.subtract(big2));
		
		System.out.println("Compara");
		System.out.println(big1.compareTo(big2));// retorno 0 é igual e 1 é diferente

		System.out.println("Divisão");
		System.out.println(big1.divide(big2));
		
		System.out.println("Máximo");
		System.out.println(big1.max(big2));
		
		System.out.println("Mínimo");
		System.out.println(big1.min(big2));
		
		System.out.println("Potência");
		System.out.println(big1.pow(4));
		
		System.out.println("Multiplicação");
		System.out.println(big1.multiply(big2));


	}

}

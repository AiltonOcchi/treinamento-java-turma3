package br.com.treinamento.mercado.service;

import java.io.IOException;

public class MercadoService {
	


    public static void exibirMenu() {    	
		System.out.println("Sistema de Vendas - Selecione uma opção:");
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Cadastrar Produto");
		System.out.println("3 - Listar Clientes");
		System.out.println("4 - Listar Produtos");
		System.out.println("5 - Sair");
    }  
	
	public static void limparTela() {
		System.out.println("\n");
		
		// Windows
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
		
		// Linux e Mac
		/*
		try {
		    new ProcessBuilder("/bin/bash", "-c", "clear").inheritIO().start().waitFor();
		} catch (IOException | InterruptedException e) {
		    e.printStackTrace();
		}
		*/

	}
}

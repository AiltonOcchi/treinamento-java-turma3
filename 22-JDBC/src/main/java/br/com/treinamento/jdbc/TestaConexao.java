package br.com.treinamento.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.treinamento.jdbc.factory.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		System.out.println("Conectanco com o banco...");
		Connection connection = connectionFactory.abreConexao();
		System.out.println("Abriu a conexão");
		
		System.out.println("\n");
		
		System.out.println("Fechando a conexão...");
		connection.close();
		System.out.println("Conexão fechada");
		

	}

}

package br.com.treinamento.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.treinamento.jdbc.factory.ConnectionFactory;
import br.com.treinamento.jdbc.model.Produto;

public class ProdutoDao {

	public void salvarProduto(Produto produto) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexao();
		
		String sqlInsere = "INSERT INTO tb_produto(nome, preco) values (?,?)";
		
		// PreparedStatement para evitar o SQL Injection
		PreparedStatement pstm = connection.prepareStatement(sqlInsere,Statement.RETURN_GENERATED_KEYS);
		pstm.setString(1, produto.getNome());
		pstm.setBigDecimal(2, produto.getPreco());
		
		pstm.execute();
		pstm.close();
		connection.close();
		
	}

	public List<Produto> listarProdutos() throws SQLException {
		
		List<Produto> produtoList = new ArrayList<>();
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexao();
		
		String sqlLista = "SELECT id_produto, nome, preco FROM tb_produto";
		PreparedStatement pstm = connection.prepareStatement(sqlLista);
		pstm.execute();
		
		ResultSet rst = pstm.getResultSet();
		while(rst.next()) {
			Produto produto = new Produto();
			produto.setId(rst.getInt("id_produto"));
			produto.setNome(rst.getString("nome"));
			produto.setPreco(rst.getBigDecimal("preco"));
			produtoList.add(produto);
		}
		
		rst.close();
		pstm.close();
		connection.close();
		
		return produtoList;
		
	}

	public Optional<Produto> buscaPorId(Integer codigo) throws SQLException {
	
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexao();
		
		String sqlBucaPorId = "SELECT id_produto, nome, preco FROM tb_produto WHERE id_produto = ?";
		
		PreparedStatement pstm = connection.prepareStatement(sqlBucaPorId);
		pstm.setInt(1, codigo);
		pstm.execute();
		
		ResultSet rst = pstm.getResultSet();
		
		Optional<Produto> produtoOptional = Optional.empty();
		
		if(rst.next()) {
			
			Produto produto = new Produto();
			produto.setId(rst.getInt("id_produto"));
			produto.setNome(rst.getString("nome"));
			produto.setPreco(rst.getBigDecimal("preco"));
			
			produtoOptional = Optional.of(produto);
		}
		
		rst.close();
		pstm.close();
		connection.close();
		
		return produtoOptional;
	}

	public void excluir(Integer codigo) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexao();
		
		String sqlDeleta = " DELETE FROM tb_produto WHERE id_produto = ?";
		
		// PreparedStatement para evitar o SQL Injection
		PreparedStatement pstm = connection.prepareStatement(sqlDeleta);
		pstm.setInt(1, codigo);
		
		pstm.execute();
		pstm.close();
		connection.close();
		
	}

	public void atualizar(Produto produto) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.abreConexao();
		
		String sqlAtualiza = "UPDATE tb_produto set nome = ? , preco = ? WHERE id_produto = ?";
		
		// PreparedStatement para evitar o SQL Injection
		PreparedStatement pstm = connection.prepareStatement(sqlAtualiza);
		pstm.setString(1, produto.getNome());
		pstm.setBigDecimal(2, produto.getPreco());
		pstm.setInt(3, produto.getId());
		
		pstm.execute();
		pstm.close();
		connection.close();
		
	}

}

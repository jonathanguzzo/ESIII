package com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.conexao.PreparaConexao;
import com.models.Cidade;

public class CidadeDAOBD extends PreparaConexao implements CidadeDAO {

	@Override
	public List<Cidade> getCidades() {
		List<Cidade> listaCidades = new ArrayList<>();
		try {
			conexaoPrepared("select * from Cidades");
			ResultSet resultado = comando.executeQuery();
			while (resultado.next()) {
				Cidade cidade = new Cidade(
						resultado.getInt("idCidade"),
						resultado.getString("nomeCidade"),
						resultado.getString("uf"),
						resultado.getString("post")
						);
				listaCidades.add(cidade);
			} 
		}catch (ClassNotFoundException ex) {
			Logger.getLogger(CidadeDAOBD.class.getName()).log(Level.SEVERE, null, ex);
		}catch (SQLException ex) {
			Logger.getLogger(CidadeDAOBD.class.getName()).log(Level.SEVERE, null, ex);
		}
		return (listaCidades);
	}

	@Override
	public Cidade getCidadePorNome(String nomeCidade) {
		try {
			conexaoPrepared("select * from cidade where nomeCIdade=?");
			comando.setString(1, nomeCidade);
			ResultSet resultado = comando.executeQuery();
			while (resultado.next()) {
				Cidade cidade = new Cidade(
						resultado.getInt("idCidade"),
						resultado.getString("nomeCidade"),
						resultado.getString("uf"),
						resultado.getString("post")
						);
				return cidade;
			}			
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(CidadeDAOBD.class.getName()).log(Level.SEVERE, null, ex);
		}catch (SQLException ex) {
			Logger.getLogger(CidadeDAOBD.class.getName()).log(Level.SEVERE, null, ex);
		}
		return (null);
	}

/*	@Override
	public String getProdutosString() {
		String produtos="";
		try {
			conexaoPrepared	("select * from produtos");
			ResultSet resultado = comando.executeQuery();
			while (resultado.next()) {
				produtos+="Codigo do produto : "+ resultado.getInt("codproduto")
						+"\nNome: "+ resultado.getString("nome")
						+"\nTipo: "+ resultado.getString("tipo")
						+"\nPreco: "+ resultado.getDouble("preco")+
						"\n";
				
			} 
		}catch (ClassNotFoundException ex) {
			Logger.getLogger(ProdutoDAOBD.class.getName()).log(Level.SEVERE, null, ex);
		}catch (SQLException ex) {
			Logger.getLogger(ProdutoDAOBD.class.getName()).log(Level.SEVERE, null, ex);
		}
		return (produtos);
	}
*/
}//fim da classe

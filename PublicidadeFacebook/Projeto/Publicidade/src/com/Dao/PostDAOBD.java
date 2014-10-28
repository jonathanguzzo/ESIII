package com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.conexao.PreparaConexao;
import com.models.Cidade;
import com.models.Post;


public class PostDAOBD extends PreparaConexao implements PostDAO{
	
	@Override
	public List<Post> getPosts() {
		List<Post> listaPost = new ArrayList<>();
		try {
			conexaoPrepared("select * from Post");
			ResultSet resultado = comando.executeQuery();
			while (resultado.next()) {
				Post post = new Post(
						resultado.getInt("idPost"),
						resultado.getString("tipo"),
						resultado.getString("descricao")
						);
				listaPost.add(post);
			} 
		}catch (ClassNotFoundException ex) {
			Logger.getLogger(CidadeDAOBD.class.getName()).log(Level.SEVERE, null, ex);
		}catch (SQLException ex) {
			Logger.getLogger(CidadeDAOBD.class.getName()).log(Level.SEVERE, null, ex);
		}
		return (listaPost);
	}
	
	
	@Override
	public Post getPostPorCidade(String nomeCidade) {
		try {
			
			conexaoPrepared("select post.idPost, post.tipo, post.descricao, cidade.nomeCidade from post,cidade"
					+ " where cidade.idPost = post.idPost");
			
			//comando.setString(1, nomeCidade);
			
			ResultSet resultado = comando.executeQuery();
			
			while (resultado.next()) {
				Post post = new Post(
						resultado.getInt("idPost"),
						resultado.getString("tipo"),
						resultado.getString("descricao")
						);
				return post;
			}	
			
		} catch (ClassNotFoundException ex) {
			
			Logger.getLogger(CidadeDAOBD.class.getName()).log(Level.SEVERE, null, ex);
		
		}catch (SQLException ex) {
			
			Logger.getLogger(CidadeDAOBD.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return (null);
	}
	
	
	

}
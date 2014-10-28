package com.models;

public class Post {
	
	int idPost;
	String tipo,descricao;
	
	
	public Post(int idPost, String tipo, String descricao) {
		super();
		this.idPost = idPost;
		this.tipo = tipo;
		this.descricao = descricao;
	}


	public int getIdPost() {
		return idPost;
	}


	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Post [idPost=" + idPost + ", tipo=" + tipo + ", descricao="
				+ descricao + "]";
	}
		

}

package com.models;

public class Cidade {

	int idCidade;
	String nomecidade,uf,post;
	
	public Cidade(int idCidade, String nomecidade, String uf, String post) {
		super();
		this.idCidade = idCidade;
		this.nomecidade = nomecidade;
		this.uf = uf;
		this.post = post;
	}

	public int getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}

	public String getNomecidade() {
		return nomecidade;
	}

	public void setNomecidade(String nomecidade) {
		this.nomecidade = nomecidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
		
}//fim da classe
package com.models;

public class Cidade {

	int idCidade;
	String nomeCidade,uf;
	
	public Cidade(int idCidade, String nomecidade, String uf) {
		super();
		this.idCidade = idCidade;
		this.nomeCidade = nomecidade;
		this.uf = uf;
	}

	public int getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}

	public String getNomecidade() {
		return nomeCidade;
	}

	public void setNomecidade(String nomecidade) {
		this.nomeCidade = nomecidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
		
}//fim da classe
package com.Dao;

import java.util.List;

import com.models.Cidade;


public interface CidadeDAO {

	public List<Cidade>getCidades();

	public Cidade getCidadePorNome(String nomeCidade);
	
	//public String getProdutosString();
	
}// fim da classe
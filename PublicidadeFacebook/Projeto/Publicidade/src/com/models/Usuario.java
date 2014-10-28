package com.models;

public class Usuario {
	
	int idUsuario;
	String nomeUsuario;
	public Usuario(int idUsuario, String nomeUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
	}
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nomeUsuario="
				+ nomeUsuario + "]";
	}
	
	
	
	
	

}

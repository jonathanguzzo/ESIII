package models;

public class Post {
	
	int idPost;
	String tipo,descricao,titulo;
	
	
	public Post(int idPost, String tipo, String descricao, String titulo) {
		super();
		this.idPost = idPost;
		this.tipo = tipo;
		this.descricao = descricao;
		this.titulo= titulo;
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


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public String toString() {
		return "Post [idPost=" + idPost + ", tipo=" + tipo + ", descricao="
				+ descricao + ", titulo=" + titulo + "]";
	}



		

}

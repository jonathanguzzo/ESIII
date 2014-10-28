package com.Dao;

import java.util.List;
import com.models.Post;


public class PostDAO {

	public List<Post>getPosts();
	
	public Post getPostPorCidade(String nomeCidade);
	
}
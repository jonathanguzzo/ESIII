package com.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class CidadeTest {

	@Test
	public void testGetIdCidade() {
		Cidade c = new Cidade(1,"Porto Alegre","RS","Hoje está chovendo");
		assertEquals(1, c.getIdCidade());
		
	}
	
	@Test
	public void testGetNomeCidade() {
		Cidade c = new Cidade(1,"Porto Alegre","RS","Hoje está chovendo");
		assertEquals("Porto Alegre", c.getNomecidade());
		
	}
	

}

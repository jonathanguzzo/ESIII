package test;

import static org.junit.Assert.*;
import models.Cidade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CidadeTeste {

	@Test
	public void testGetIdCidade() {
		Cidade c = new Cidade(1,"Porto Alegre","RS");
		assertEquals(1, c.getIdCidade());	
	}
	
	
	@Test
	public void testGetNomeCidade() {
		Cidade c = new Cidade(1,"Viamão","RS");
		assertEquals("Viamão", c.getNomecidade());
	}
	
	
	@Test
	public void testGetUfCidade() {
		Cidade c = new Cidade(1,"Porto Alegre","RS");
		assertEquals("RS", c.getUf());	
	}
}

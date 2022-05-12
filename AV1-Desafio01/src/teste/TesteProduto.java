package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Produto;

public class TesteProduto {

	@Test
	public void testCalculaDesconto() {
		//fail("Not yet implemented");
		Produto produto = new Produto(1, 1, 5.0, 1); 
		assertEquals(2.5, produto.calculaDesconto(), 0);
	}

}


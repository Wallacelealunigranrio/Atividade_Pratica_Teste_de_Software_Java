package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Forma;

public class TestaForma {

	@Test
	public void testVerificaForma() {
		
		Forma forma = new Forma(10, 10, 12);
		assertEquals("triangulo isosceles", forma.verificaForma(), 0);
	}

}

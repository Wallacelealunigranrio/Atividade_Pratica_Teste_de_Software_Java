package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Massa;

public class TesteMassa {

	@Test
	public void testCalculaTempo() {
		Massa massa = new Massa(10);	
		assertEquals( 0.390625, 400, massa.calculaTempo(), 0);
	}

}

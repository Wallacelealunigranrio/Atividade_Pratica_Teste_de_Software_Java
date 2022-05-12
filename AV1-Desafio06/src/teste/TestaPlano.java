package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Plano;

public class TestaPlano {

	@Test
	public void test() {
		
		Plano plano = new Plano(2, 5, 7, 9);
		assertEquals( 6.4031243, plano.calculaDistancia(), 0);
	}

}

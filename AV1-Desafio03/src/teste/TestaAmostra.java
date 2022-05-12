package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Amostra;

class TestaAmostra {

	@Test
	void testInformaGrau() {
		Amostra amostra = new Amostra(1, 1, 51, 90000);
		assertEquals(10, amostra.informaGrau(), 0);
	}

}

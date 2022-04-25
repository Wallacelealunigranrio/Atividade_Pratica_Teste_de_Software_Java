package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Retangulo;

public class TestaRetangulo {

	@Test
	public void testArea() {
		 Retangulo calc = new Retangulo(6,2); 
		 assertEquals(12, calc.area(), 0);
       }
	public void testPerimetro() {
		 Retangulo calc = new Retangulo(6,2); 
		 assertEquals(16, calc.perimetro(), 0);
      }
	}

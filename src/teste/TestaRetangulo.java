package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Retangulo;

public class TestaRetangulo {

	@Test
	public void test() {
		 Retangulo calc = new Retangulo(6,2); 
		 assertEquals(12, calc.area(), 0);
       }
	}



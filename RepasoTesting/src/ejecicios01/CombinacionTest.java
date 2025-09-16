package ejecicios01;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.AssertionFailedError;

class CombinacionTest {
	Combinacion combinacion;
	int size;
	int colors;

	@BeforeEach
	void bef() {
		combinacion = new Combinacion();
		combinacion.generarCombinacion();
		size = 5;
		colors = 5;
	}

	@Test
	void testGenerarCombinacion() {
		int[] cadena = combinacion.getCadena();
		for (int i = 0; i < size; i++) {
			assertTrue(cadena[i] > 0);
			assertTrue(cadena[i] <= colors);
		}
	}

	@Test
	void testGenerarCombinacionLimites() {
		int[] cadena = combinacion.getCadena();
		boolean banderaUno = false;
		boolean banderaColors = false;
		int veces = 10;
		for (int j = 0; j < veces; j++) {
			for (int i = 0; i < size; i++) {
				if (cadena[i] == 1)
					banderaUno = true;
				if (cadena[i] == colors)
					banderaColors = true;
			}
			combinacion.generarCombinacion();
			cadena = combinacion.getCadena();
		}
		assertTrue(banderaUno);
		assertTrue(banderaColors);
	}

	@Test
	void testGenerarCombinacionRepetidas() {
		int[] cadena = combinacion.getCadena().clone();
		combinacion.generarCombinacion();
		int[] cadena2 = combinacion.getCadena();
		assertFalse(Arrays.equals(cadena,cadena2));
	}
}

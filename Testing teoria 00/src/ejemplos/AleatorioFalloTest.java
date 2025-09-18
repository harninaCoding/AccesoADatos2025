package ejemplos;
import static org.junit.Assert.*;

import org.junit.Test;

public class AleatorioFalloTest {
	// Si los metodos a probar no son estaticos
	// debemos crear una isntancia o varias
	AleatorioFallo instancia = new AleatorioFallo();

	@Test
	public void testGenerarAleatorio() {
		// Yo controlo si el resultado esta en un margen
		int min = 1, max = 10;
		int resultado;
		boolean bandera = true;
		for (int i = 0; i < 1000; i++) {
			resultado = instancia.generarAleatorio(min, max);
			if (resultado < min || resultado > max)
				bandera = false;
		}
		assertTrue(bandera);
	}

	@Test
	public void testGenerarAleatorioDos() {
		int min = 1, max = 10;
		int resultado;
		for (int i = 0; i < 1000; i++) {
			resultado = instancia.generarAleatorio(min, max);
			if (resultado < min || resultado > max)
				fail("fuera de rango");
		}
	}

	@Test
	public void testGenerarAleatorioTres() {
		int min = 1, max = 10;
		int resultado;
		for (int i = 0; i < 1000; i++) {
			resultado = instancia.generarAleatorio(min, max);
			assertEquals((max - min) / 2 + min, resultado, (max - min / 2));
		}
	}

	@Test
	public void testGenerarAleatorioCuatro() {
		int min = 1, max = 10;
		int resultado;
		for (int i = 0; i < 1000; i++) {
			resultado = instancia.generarAleatorio(min, max);
			assertTrue(resultado <= max && resultado >= min);
		}
	}
}

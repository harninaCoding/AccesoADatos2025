package ejemplos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class AleatorioFalloTest {

	@Test
	void testGenerarAleatorio() {
		// valores de la prueba
		int minimo = 1, maximo = 2;
		boolean banderaMinima = false, banderaMaxima = false;
//		int expected=?
		AleatorioFallo aleatorioFallo = new AleatorioFallo();
		for (int i = 0; i < 3; i++) {

			// prueba del sut
			int generarAleatorio=0;
			try {
				generarAleatorio = aleatorioFallo.generarAleatorio(minimo, maximo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (generarAleatorio == minimo)
				banderaMinima = true;
			if (generarAleatorio == maximo)
				banderaMaxima = true;
			// verificacion del resultado
//			assertTrue(generarAleatorio >= minimo);
//			assertTrue(generarAleatorio <= maximo);
		}
//		assertTrue(banderaMaxima);
//		assertTrue(banderaMinima);
		minimo = -1; maximo = 2;
		banderaMinima = false; banderaMaxima = false;
//		int expected=?
		aleatorioFallo = new AleatorioFallo();
		for (int i = 0; i < 3; i++) {
			
			// prueba del sut
			int generarAleatorio=0;
			try {
				generarAleatorio = aleatorioFallo.generarAleatorio(minimo, maximo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (generarAleatorio == minimo)
				banderaMinima = true;
			if (generarAleatorio == maximo)
				banderaMaxima = true;
			// verificacion del resultado
			assertTrue(generarAleatorio >= minimo);
			assertTrue(generarAleatorio <= maximo);
		}
		assertTrue(banderaMaxima);
		assertTrue(banderaMinima);
	}

	//Si comento este el coverage es parcial en la primera clausula de guarda
	@Test
	void testGenerarAleatorio2() {
		// valores de la prueba
		int minimo = 10, maximo = 1;
		AleatorioFallo aleatorioFallo = new AleatorioFallo();
		// prueba del sut
		int generarAleatorio=0;
		try {
			generarAleatorio = aleatorioFallo.generarAleatorio(minimo, maximo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// verificacion del resultado
		assertTrue(generarAleatorio >= minimo);
		assertTrue(generarAleatorio <= maximo);
	}

}

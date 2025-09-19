package ejemplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VentanaTest {
	Ventana ventana;
	
	@BeforeEach
	void before() {
		ventana=new Ventana();
	}

	@Test
	void testAbrirVentana() {
		ventana.abrirVentana();
		assertTrue(ventana.isAbierta());
	}

	@Test
	void testCerrarVentana() {
		ventana.cerrarVentana();
		assertTrue(!ventana.isAbierta());
	}

}

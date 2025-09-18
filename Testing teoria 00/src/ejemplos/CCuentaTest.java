package ejemplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CCuentaTest {
	CCuenta cuenta;

	@BeforeEach
	void bef() {
		cuenta = new CCuenta();

	}

	@Test
	void testIngresar() {
		// prueba con cantidades relativas
		double cantidad = 100;
		try {
			cuenta.ingresar(cantidad);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(cuenta.estado(), cantidad);

		// prueba con cantidades absolutas
		cantidad = 100;
		double estadoInicial = cuenta.estado();
		try {
			cuenta.ingresar(cantidad);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(cuenta.estado(), cantidad + estadoInicial);
		cantidad = -100;
		estadoInicial = cuenta.estado();
		try {
			cuenta.ingresar(cantidad);
			System.out.println("se la ha comido");
			fail();
		} catch (Exception e) {
			
		}
//PA diegui
	}

	@Test
	void testRetirar() {
		fail("Not yet implemented");
	}

}

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
		//Aqui probamos un caso en el que deberia fallar
		assertEquals(cuenta.estado(), cantidad + estadoInicial);
		cantidad = -100;
		estadoInicial = cuenta.estado();
		try {
			cuenta.ingresar(cantidad);
			//Entendemos que ha fallado si no tira una excepcion
			fail();
		} catch (Exception e) {
			//si tira una excepcion, no decimos nada, porque es lo que tenia que hacer
		}
	}

	@Test
	void testRetirar() {
		//Partimos de valores absolutos
		double saldoInicial = cuenta.estado();
		//asegurar un saldo suficiente
		double cantidad=100;
		try {
			cuenta.ingresar(cantidad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//ahora ejecuto el caso de prueba retirar lo que hay en la cuenta o menos
		try {
			cuenta.retirar(cantidad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(saldoInicial, cuenta.estado());
		//ahora retiro una cantidad superior a la que tengo en el saldo
		try {
			cuenta.retirar(saldoInicial+1);
			fail();
		} catch (Exception e) {
		}
	}

}

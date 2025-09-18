package withObjetcs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EveryTestNeedsAValue08Test {
	// imagimenos que necesitamos meter algunos valores para hacer las pruebas
	// vamos a poner todas las posible combinaciones y las probamos
	static {
		System.out.println("soy un bloque estatico ");
	}

	@BeforeAll
	static void algo() {
		System.out.println("Entrando en beforeAll");
		assertEquals(true, true);
	}

	@BeforeEach()
	void otro() {
		System.out.println("entrando en beforeEach");
	}

	@Test
	void testOne() {
		System.out.println("en test uno");
	}

	@Test
	void testTwo() {
		System.out.println("en test Two");
	}

	@AfterEach
	void aft() {
		System.out.println("en afterEach");
	}

	@AfterAll
	static void aftee() {
		System.out.println("en afterAll");
	}

}

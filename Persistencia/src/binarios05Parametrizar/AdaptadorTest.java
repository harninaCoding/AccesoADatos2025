package binarios05Parametrizar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdaptadorTest {
	Cliente cliente1 = new Cliente(1, "javierito", true, 12.5f);
	Cliente cliente2 = new Cliente(2, "jimmy", true, 12.5f);
	Cliente cliente3 = new Cliente(3, "jonatan", true, 12.5f);
	String path = "./clientes.cli";
	Adaptador<List<Cliente>,Cliente> adaptador;
	File file = null;

	@BeforeEach
	void setUp() throws Exception {
		adaptador = new AdaptadorCliente(path);
		file = new File(path);
	}

	@AfterEach
	void tearDown() throws Exception {
		file.delete();
	}

	private void pruebaCreacion() {
		assertFalse(file.exists());
		assertTrue(adaptador.grabar(cliente1));
		assertTrue(adaptador.grabar(cliente2));
		assertTrue(adaptador.grabar(cliente3));
		assertTrue(file.exists());
	}

	private void assertArrayNotEquals(Object[] expecteds, Object[] actuals) {
		try {
			assertArrayEquals(expecteds, actuals);
		} catch (AssertionError e) {
			return;
		}
		fail("The arrays are equal");
	}

	@Test
	// @Ignore
	void testLeer() {
		// Cujmplo el requisito de que debe existir un archivo
		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		// Hacer la prueba de leer
		List<Cliente> leer = adaptador.leer();
		// y si da la casulaidad de que son iguales y lo que yo
		// quiero probar es que son distintos
		assertArrayNotEquals(clientes.toArray(), leer.toArray());
		pruebaCreacion();
		// ahora ya existe en el fichero
		leer = adaptador.leer();
		assertArrayEquals(clientes.toArray(), leer.toArray());
		// supongamos que quiero probar que no son iguales pero lo son
		assertArrayNotEquals(clientes.toArray(), leer.toArray());
	}

	@Test
	void testGrabar() {
		pruebaCreacion();
	}

}

package serializacion08.monoobjetoList02;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdaptadorSerializadoListaIndizableTest {
	AdaptadorSerializableListaIndexable<Cliente, Integer> adaptadorSerializableListaIndexable;
	String path="clientesMapa.dat";
	@BeforeEach
	void before() {
		try {
			adaptadorSerializableListaIndexable = new AdaptadorSerializableListaIndexable<Cliente, Integer>(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testIndizable() {
		Cliente vacio = adaptadorSerializableListaIndexable.leer(2);
		assertNull(vacio);
		Cliente cliente = new Cliente(1, "Luis", false, 0);
		try {
			adaptadorSerializableListaIndexable.grabar(cliente);
			Cliente leer = adaptadorSerializableListaIndexable.leer(cliente.getNumero());
			assertEquals(cliente, leer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Cliente otro=new Cliente(4,"Antonio",true,1);
		try {
			adaptadorSerializableListaIndexable.grabar(otro);
			assertEquals(otro, adaptadorSerializableListaIndexable.leer(otro.getKey()).get());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterEach
	void after() {
		File file=new File(path);
		assertTrue(file.delete());
	}
}

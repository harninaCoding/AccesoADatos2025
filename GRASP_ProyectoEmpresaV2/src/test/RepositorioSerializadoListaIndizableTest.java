package test;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.data.Cliente;
import modelo.repositorios.monoobjetolista.RepositorioSerializableListaIndexable;

class RepositorioSerializadoListaIndizableTest {
	RepositorioSerializableListaIndexable<Cliente, String> adaptadorSerializableListaIndexable;
	String path="clientesMapa.dat";
	@BeforeEach
	void before() {
		try {
			adaptadorSerializableListaIndexable = new RepositorioSerializableListaIndexable<Cliente, String>(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testIndizable() {
		//TODO cambiar test para adecuarlo a key de tipo String
//		Optional<Cliente> vacio = adaptadorSerializableListaIndexable.leer(2);
//		assertTrue(vacio.isEmpty());
//		Cliente cliente = new Cliente(1, "Luis", false, 0);
//		try {
//			adaptadorSerializableListaIndexable.grabar(cliente);
//			Cliente leer = adaptadorSerializableListaIndexable.leer(cliente.getNumero()).get();
//			assertEquals(cliente, leer);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		Cliente otro=new Cliente(4,"Antonio",true,1);
//		try {
//			adaptadorSerializableListaIndexable.grabar(otro);
//			assertEquals(otro, adaptadorSerializableListaIndexable.leer(otro.getKey()).get());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@AfterEach
	void after() {
		File file=new File(path);
		file.delete();
	}
}

package serializacion08multiobjeto03;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RepositorioSerializadoMultiObjetoIndexableTest {

	//<Tipo, Tipo de clave>
	RepositorioSerializadoMultiObjetoIndexable<Cliente,Integer> repositorio;
	String path;
	@BeforeEach
	void bef() {
		path = "clientesIndexMulti.data";
		repositorio=new RepositorioSerializadoMultiObjetoIndexable<Cliente, Integer>(path);
	}
	@Test
	void testTodosvacio() {
		List<Cliente> todos = repositorio.getTodos();
		assertEquals(0, todos.size());
	}
	@Test
	void testGrabarUno() {
		Cliente cliente=new Cliente(1, "Fermin", false, 0);
		try {
			boolean grabar = repositorio.grabar(cliente);
			if(grabar) {
				Optional<Cliente> leer = repositorio.leer(cliente.getKey());
				if(leer.isPresent()) {
					assertEquals(cliente, leer.get());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	void testGrabarDos() {
		Cliente cliente=new Cliente(1, "Fermin", false, 0);
		int oldSize = repositorio.getTodos().size();
		try {
			boolean grabar = repositorio.grabar(cliente);
			assertEquals(oldSize+1, repositorio.getTodos().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterEach
	void aft() {
		//borrar los archivos
		File file=new File(path+repositorio.getIndicePathSufix());
		if(!file.delete()) fail();
		file=new File(path+repositorio.getObjetosPathSufix());
		file.delete();
	}
}

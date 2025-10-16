package test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.data.Cliente;
import modelo.repositorios.serializadomultiobjetoindexado.RepositorioSerializadoMultiObjetoIndexable;

class RepositorioSerializadoMultiObjetoIndexableTest {

	//<Tipo, Tipo de clave>
	RepositorioSerializadoMultiObjetoIndexable<Cliente,String> repositorio;
	String path;
	@BeforeEach
	void bef() {
		path = "clientesIndexMulti.data";
		repositorio=new RepositorioSerializadoMultiObjetoIndexable<Cliente, String>(path);
	}
	@Test
	void testTodosvacio() {
		List<Cliente> todos = repositorio.getTodos();
		assertEquals(0, todos.size());
	}
	@Test
	void testGrabarUno() {
		Cliente cliente=new Cliente("1", "Fermin");
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
		Cliente cliente=new Cliente("1", "Fermin");
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

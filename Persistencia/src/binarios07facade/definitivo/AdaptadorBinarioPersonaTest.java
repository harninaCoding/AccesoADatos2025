package binarios07facade.definitivo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class AdaptadorBinarioPersonaTest {

	private String path= "persona.bin";;
	@Test
	void test() {
		AdaptadorBinario<List<Persona>, Persona> adaptadorbinarioPersona = null;
		try {
			adaptadorbinarioPersona
			=new AdaptadorBinario<List<Persona>, Persona>
					(
					path,
					new AdecuadorPersonaBinario()					
					);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		String[] nombres= {"Juan","Luis"};
		for (String string : nombres) {
			try {
				adaptadorbinarioPersona.grabar(new Persona(string, (byte)1));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			List<Persona> leer = adaptadorbinarioPersona.leer();
			assertEquals(nombres.length,leer.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterEach
	void after() {
		new File(path).delete();
	}

}

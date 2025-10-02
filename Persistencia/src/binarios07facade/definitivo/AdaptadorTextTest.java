package binarios07facade.definitivo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class AdaptadorTextTest {

	private String path;
	@Test
	void test() {
		AdaptadorText<List<Persona>, Persona> adaptadorTextPersona = null;
		try {
			path = "persona.dat";
			adaptadorTextPersona
			=new AdaptadorText<List<Persona>, Persona>
					(
					path,
					new AdecuadorPersonaText()					
					);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		String[] nombres= {"Juan","Luis"};
		for (String string : nombres) {
			try {
				adaptadorTextPersona.grabar(new Persona(string, (byte)1));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			List<Persona> leer = adaptadorTextPersona.leer();
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

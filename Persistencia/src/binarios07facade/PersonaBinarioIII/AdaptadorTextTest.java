package binarios07facade.PersonaBinarioIII;

import java.util.List;

import org.junit.jupiter.api.Test;

class AdaptadorTextTest {

	@Test
	void test() {
		AdaptadorText<List<Persona>, Persona> adaptadorTextPersona;
		try {
			adaptadorTextPersona=new AdaptadorText<List<Persona>, Persona>
			("persona.dat", new AdecuadorPersonaText());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	@Test
	void testbinario() {
		AdaptadorBinario<List<Persona>, Persona> adaptadorBinarioPersona;
		try {
			adaptadorBinarioPersona=new AdaptadorBinario<List<Persona>, Persona>
			("persona.dat", new AdecuadorPersonaBinario());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	@Test
	void testbinarioArticulo() {
		try {
			AdaptadorBinario<List<Articulo>, Articulo> adaptadorBinarioArticulo=
					new AdaptadorBinario<List<Articulo>, Articulo>("articulos.dat",
							new AdecuadorArticuloBinario());
			Articulo articulo=new Articulo(1, "tornillo", 1f);
			adaptadorBinarioArticulo.grabar(articulo);
			List<Articulo> leer = adaptadorBinarioArticulo.leer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

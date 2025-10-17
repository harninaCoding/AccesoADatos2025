package segregacioninterfaces06.problema;

import java.util.List;

public class Orquesta {
	List<Instrumento> instrumentos;

	public Orquesta() {
		super();
		instrumentos=List.of(new Tambor(),new Trompeta(),new Guitarra());
		instrumentos.forEach(instrumento->{
			instrumento.afina();
			instrumento.estira();
			instrumento.limpia();
			instrumento.toca();
		});
	}
	
	
}

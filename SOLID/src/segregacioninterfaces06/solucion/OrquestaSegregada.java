package segregacioninterfaces06.solucion;

import java.util.ArrayList;
import java.util.List;

public class OrquestaSegregada {
	List<Cuerda> cuerdas;
	List<Percusion> percusiones;
	List<Viento> vientos;
	List<Tocable> tocables;
	
	public OrquestaSegregada() {
		super();
		cuerdas=new ArrayList<Cuerda>();
		percusiones=new ArrayList<Percusion>();
		vientos=new ArrayList<Viento>();
		tocables=new ArrayList<Tocable>();
		Guitarra guitarra=new Guitarra();
		cuerdas.add(guitarra);
		tocables.add(guitarra);
		Tambor tambor=new Tambor();
		percusiones.add(tambor);
		tocables.add(tambor);
		Trompeta trompeta=new Trompeta();
		vientos.add(trompeta);
		tocables.add(trompeta);
	}
	
	public void ponerAPunto() {
		cuerdas.forEach(Cuerda::afina);
		percusiones.forEach(Percusion::estira);
		vientos.forEach(Viento::limpia);
		tocables.forEach(Tocable::toca);
	}
}

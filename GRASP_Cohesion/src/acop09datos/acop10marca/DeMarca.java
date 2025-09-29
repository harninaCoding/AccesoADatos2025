package acop09datos.acop10marca;

class Coordenada {
	public int x, y;

	public Coordenada(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void subir() {
		this.y++;
	}

	public void bajar() {
		this.y--;
	}
}

public class DeMarca {
	Coordenada coordenada = new Coordenada(5, 5);

	public void levantar() {
		this.coordenada.subir();
	}

	public void bajar() {
		this.coordenada.bajar();
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

}

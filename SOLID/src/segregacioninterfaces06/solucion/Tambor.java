package segregacioninterfaces06.solucion;

public class Tambor implements  Tocable,Percusion {

	@Override
	public void toca() {
		System.out.println("tambor tocando");

	}

	@Override
	public void estira() {
		System.out.println("tambor estirando");

	}

	

}

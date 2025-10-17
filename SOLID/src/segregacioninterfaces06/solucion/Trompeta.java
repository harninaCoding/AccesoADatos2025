package segregacioninterfaces06.solucion;

public class Trompeta implements  Tocable,Viento {

	@Override
	public void toca() {
		System.out.println("trompeta tocando");

	}

	

	@Override
	public void limpia() {
		System.out.println("trompeta limpiandose");

	}

	

}

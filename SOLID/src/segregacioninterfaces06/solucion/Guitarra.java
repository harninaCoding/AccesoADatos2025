package segregacioninterfaces06.solucion;

public class Guitarra implements Tocable,Cuerda {

	@Override
	public void toca() {
		System.out.println("guitarra tocando");
	}

	@Override
	public void afina() {
		System.out.println("guitarra afinando");
	}

}

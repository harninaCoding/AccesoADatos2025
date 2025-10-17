package segregacioninterfaces06.problema;

public class Trompeta implements Instrumento {

	@Override
	public void toca() {
		System.out.println("trompeta tocando");

	}

	@Override
	public void estira() {
		System.out.println("no procede");

	}

	@Override
	public void limpia() {
		System.out.println("trompeta limpiandose");

	}

	@Override
	public void afina() {
		System.out.println("no procede");

	}

}

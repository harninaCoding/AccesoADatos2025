package segregacioninterfaces06.problema;

public class Guitarra implements Instrumento {

	@Override
	public void toca() {
		System.out.println("guitarra tocando");
	}

	@Override
	public void estira() {
		System.out.println("no procede");
	}

	@Override
	public void limpia() {
		System.out.println("no procede");
	}

	@Override
	public void afina() {
		System.out.println("guitarra afinando");
	}

}

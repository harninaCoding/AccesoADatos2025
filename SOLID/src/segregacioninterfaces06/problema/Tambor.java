package segregacioninterfaces06.problema;

public class Tambor implements Instrumento {

	@Override
	public void toca() {
		System.out.println("tambor tocando");

	}

	@Override
	public void estira() {
		System.out.println("tambor estirando");

	}

	@Override
	public void limpia() {
		System.out.println("no procede");

	}

	@Override
	public void afina() {
		System.out.println("no procede");
	}

}

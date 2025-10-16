package modelo.data;

public class Dependiente extends Persona {
	private int mostrador;


	private Dependiente(String dNICliente, String nombre, int mostrador) {
		super(dNICliente, nombre);
		setMostrador(mostrador);
	}


	private int getMostrador() {
		return mostrador;
	}


	private void setMostrador(int mostrador) {
		this.mostrador = mostrador;
	}
	

}

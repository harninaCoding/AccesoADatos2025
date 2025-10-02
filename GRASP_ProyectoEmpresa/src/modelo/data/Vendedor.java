package modelo.data;

public class Vendedor extends Persona{
	private Ruta ruta;

	private Ruta getRuta() {
		return ruta;
	}

	private void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	private Vendedor(String dNICliente, String nombre, Ruta ruta) {
		super(dNICliente, nombre);
		setRuta(ruta);
	}
	

}

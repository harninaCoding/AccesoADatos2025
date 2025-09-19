package ejemplos;
public class Ventana {
	private boolean abierta = false;

	public void abrirVentana() {
		abierta = true;
	}

	public void cerrarVentana() {
		abierta = false;
	}

	public boolean isAbierta() {
		return abierta;
	}
	
}

package expertoEnInformacionTeoria01;

public class Linea {
	public String nombre;
	public float precio;
	public float descuento = 0;

	public float getTotalLinea() {
		return precio * descuento;
	}
}

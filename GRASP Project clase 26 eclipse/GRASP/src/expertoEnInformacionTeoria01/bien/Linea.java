package expertoEnInformacionTeoria01.bien;

public class Linea {
	public String nombre;
	public float precio;
	public float descuento = 0;

	public float getTotalLinea() {
		return precio * descuento;
	}
}

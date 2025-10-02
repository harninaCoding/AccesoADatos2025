package modelo.data;

public class Cliente extends Persona{
	
	private float descuento = 0;

	
	// metodos
	public Cliente(String dniCliente, String nombre) {
		super(dniCliente, nombre);
	}

	public Cliente(String dNICliente, String nombre, float descuento) {
		this(dNICliente, nombre);
		setDescuento(descuento);
	}

	private float getDescuento() {
		return descuento;
	}

	private void setDescuento(float descuento) {
		//asserts
		this.descuento = descuento;
	}

}

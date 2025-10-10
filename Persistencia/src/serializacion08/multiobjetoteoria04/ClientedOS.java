package serializacion08.multiobjetoteoria04;

import java.io.Serializable;

	
public class ClientedOS extends Persona implements Serializable,Keyable<String>{
	
	private float descuento = 0;
	private String provincia;

	
	
	// metodos
	public ClientedOS(String dniCliente, String nombre) {
		super(dniCliente, nombre);
	}

	public String getProvincia() {
		return provincia;
	}

	public ClientedOS(String dNICliente, String nombre, float descuento, String provincia) {
		this(dNICliente, nombre,descuento);
		this.provincia = provincia;
	}

	public ClientedOS(String dNICliente, String nombre, float descuento) {
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

	@Override
	public String getKey() {
		return getdNICliente();
	}

}

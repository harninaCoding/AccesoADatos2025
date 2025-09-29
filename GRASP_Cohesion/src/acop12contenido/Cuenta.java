package acop12contenido;

import java.time.LocalDate;

public class Cuenta {
	public Cliente cliente;
	public LocalDate fechaAlta;
	public String idCuenta;
	public Cuenta(Cliente cliente, LocalDate fechaAlta, String idCuenta) {
		super();
		this.cliente = cliente;
		this.fechaAlta = fechaAlta;
		this.idCuenta = idCuenta;
	}
	
	
}

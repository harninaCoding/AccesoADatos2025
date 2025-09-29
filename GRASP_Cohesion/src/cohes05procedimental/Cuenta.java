package cohes05procedimental;

import java.time.LocalDate;

public class Cuenta {
	public Cliente cliente;
	public LocalDate fechaAlta;
	public Cuenta(Cliente cliente, LocalDate fechaAlta) {
		super();
		this.cliente = cliente;
		this.fechaAlta = fechaAlta;
	}
	
}

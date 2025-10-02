package modelo.data;

import java.time.LocalDate;

public class PedidoComercial extends Pedido {
	// propiedades
	private Vendedor vendedor;
	private int matricula;

	public PedidoComercial(int numeroDeSerie, LocalDate fecha, Cliente cliente) {
		super(numeroDeSerie, fecha, cliente);
		// TODO Auto-generated constructor stub
	}
	
}

package modelo.data;

import java.time.LocalDate;

public class PedidoAlmacen extends Pedido{
	
	//propiedades
	private Dependiente dependiente;
	private int numeroMostrador;
	
	public PedidoAlmacen(int numeroDeSerie, LocalDate fecha, Cliente cliente) {
		super(numeroDeSerie, fecha, cliente);
	}

	//Getters and Setters
	
}

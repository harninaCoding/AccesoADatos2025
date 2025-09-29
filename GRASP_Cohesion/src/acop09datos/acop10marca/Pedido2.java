package acop09datos.acop10marca;

public class Pedido2 {
	public String fecha;
	public Cliente2 cliente;

	public Pedido2(Cliente2 cliente, String fecha) {
		super();
		this.fecha = fecha;
		this.cliente=cliente;
	}

	public DatosFiscales getDatosFiscalesCliente() {
		//metodo delegado
		return cliente.datosFiscales;
	}
	 

}

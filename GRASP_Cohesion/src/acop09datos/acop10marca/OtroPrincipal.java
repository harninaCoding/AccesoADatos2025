package acop09datos.acop10marca;

public class OtroPrincipal {

	public static void main(String[] args) {
		DatosFiscales datosFiscales = new DatosFiscales("22", "manan");
		Cliente2 cliente2=new Cliente2("3", "Barbara",datosFiscales);
		Pedido2 pedido2=new Pedido2(cliente2, "hoy");
		DatosFiscales datosFiscalesCliente = pedido2.getDatosFiscalesCliente();
	}

}

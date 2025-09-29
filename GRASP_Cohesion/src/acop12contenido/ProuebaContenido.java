package acop12contenido;

public class ProuebaContenido {
	BorradorClientes borradorClientes=new BorradorClientes();
	GestorClientes gestorClientes=new GestorClientes();
	
	public void gestionar() {
		borradorClientes.borrarCliente(gestorClientes.clientes);
	}
	
}

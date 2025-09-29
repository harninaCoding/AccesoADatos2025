package cohes05procedimental;

import java.time.LocalDate;
import java.util.LinkedList;

public class GestorClientes {
	public LinkedList<Cliente> clientes=new LinkedList<>();
	public LinkedList<Cuenta> cuentas=new LinkedList<>();
	
	public void darAltaCliente(Cliente cliente) {
		//Esta es comunicacional porque comparten datos
		clientes.add(cliente);
		cuentas.add(new Cuenta(cliente, LocalDate.now()));
		//esto es procedural
//		Hacerunpedido
//		comprobar stock
		
	}
}

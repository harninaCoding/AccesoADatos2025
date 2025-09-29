package acop12contenido;

import java.time.LocalDate;
import java.util.LinkedList;

public class GestorClientes {
	public LinkedList<Cliente> clientes=new LinkedList<>();
	public LinkedList<Cuenta> cuentas=new LinkedList<>();
	public int valorMedio=5;
	
	public void darAltaCliente(Cliente cliente) {
		//Esta es comunicacional porque comparten datos
		clientes.add(cliente);
		cuentas.add(new Cuenta(cliente, LocalDate.now(),"11"));
		//esto es procedural
//		Hacerunpedido
//		comprobar stock
		
	}
}

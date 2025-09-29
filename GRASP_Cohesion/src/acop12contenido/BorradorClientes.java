package acop12contenido;

import java.util.Iterator;
import java.util.LinkedList;

public class BorradorClientes {
	
	public void borrarCliente(LinkedList<Cliente> clientes) {
		for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			if(cliente.nombre.startsWith("l")) {
				iterator.remove();
			}
		}
	}
	public void modificadorMedia(GestorClientes gestorClientes) {
		//estamos tocando cosas de Gestor sin que el lo pueda controlar
		gestorClientes.valorMedio++;
	}

}

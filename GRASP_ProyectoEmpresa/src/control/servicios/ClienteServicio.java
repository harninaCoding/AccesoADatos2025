package control.servicios;

import java.util.List;
import java.util.Optional;

import modelo.data.Cliente;
import modelo.repositorios.AdaptadorSerializableListaIndexable;

public class ClienteServicio {
	private AdaptadorSerializableListaIndexable<Cliente, String> adaptador;
	private String path;

	public Optional<Cliente> getByKey(String clave) {
		return Optional.ofNullable(adaptador.leer(clave));
	}

	public List<Cliente> getClientesByProvincia(String provincia) {
		adaptador.getTodos().stream().filter(cliente->cliente.getProvincia().equals(provincia));
	}
}

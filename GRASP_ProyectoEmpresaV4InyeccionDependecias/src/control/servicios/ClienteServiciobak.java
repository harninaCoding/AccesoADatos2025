package control.servicios;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import modelo.data.Cliente;
import modelo.repositorios.monoobjetolista.RepositorioSerializableListaIndexable;

public class ClienteServiciobak {
	private RepositorioSerializableListaIndexable<Cliente, String> adaptador;
	private String path;

	public Optional<Cliente> getByKey(String clave) {
		return adaptador.leer(clave);
	}

	public List<Cliente> getClientesByProvincia(String provincia) {
		return adaptador.getTodos().stream()
				.filter(cliente -> cliente.getProvincia().equals(provincia))
				.collect(Collectors.toList());
	}
}

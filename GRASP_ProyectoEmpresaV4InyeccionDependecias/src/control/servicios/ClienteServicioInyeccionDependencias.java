package control.servicios;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import modelo.data.Cliente;
import modelo.repositorios.serializadomultiobjetoindexado.RepositorioIndexado;
import modelo.repositorios.serializadomultiobjetoindexado.RepositorioSerializadoMultiObjetoIndexable;

public class ClienteServicioInyeccionDependencias {
	// La inversion de dependecias me permite depdender de la abstraccion
	private RepositorioIndexado<Cliente, String> adaptador;
	private String path;

	public ClienteServicioInyeccionDependencias(RepositorioIndexado<Cliente, String> adaptador, String path) {
		super();
		this.adaptador = adaptador;
		this.path = path;
	}

	public Optional<Cliente> getByKey(String clave) {
		return adaptador.leer(clave);
	}

	public List<Cliente> getClientesByProvincia(String provincia) {
		return adaptador.getTodos().stream().filter(cliente -> cliente.getProvincia().equals(provincia))
				.collect(Collectors.toList());
	}
}

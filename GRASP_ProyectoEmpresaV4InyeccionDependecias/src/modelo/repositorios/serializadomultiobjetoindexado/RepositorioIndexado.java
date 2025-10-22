package modelo.repositorios.serializadomultiobjetoindexado;

import java.util.List;
import java.util.Optional;

import modelo.accesores.Grabable;
import modelo.accesores.Keyable;

public interface RepositorioIndexado<T extends Keyable<K>,K> extends Grabable<T> {
	public Optional<T> leer(K k);
	public List<T> getTodos();
}

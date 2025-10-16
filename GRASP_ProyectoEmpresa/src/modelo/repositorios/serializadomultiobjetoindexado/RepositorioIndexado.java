package modelo.repositorios.serializadomultiobjetoindexado;

import java.util.List;
import java.util.Optional;

import modelo.accesores.Keyable;

public interface RepositorioIndexado<T extends Keyable<K>,K> {
	public Optional<T> leer(K k);
	public boolean grabar(T t) throws Exception;
	public List<T> getTodos();
}

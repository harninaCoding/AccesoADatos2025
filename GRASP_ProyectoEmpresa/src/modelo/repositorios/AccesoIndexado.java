package modelo.repositorios;

import java.util.List;
import java.util.Optional;

public interface AccesoIndexado<T extends Keyable<K>, K> extends GrabableMonoObjeto<T>{
	public Optional<T> leer(K k);
	public List<T> getTodos();
}

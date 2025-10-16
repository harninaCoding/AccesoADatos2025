package modelo.repositorios.monoobjetolista;

import java.util.List;
import java.util.Optional;

import modelo.accesores.Keyable;
import modelo.accesores.monoobjetolista.GrabableMonoObjeto;

public interface AccesoIndexado<T extends Keyable<K>, K> extends GrabableMonoObjeto<T>{
	public Optional<T> leer(K k);
	public List<T> getTodos();
}

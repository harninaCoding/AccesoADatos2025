package modelo.repositorios.monoobjetolista;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import modelo.accesores.Keyable;
import modelo.accesores.monoobjetolista.AlmacenSerializadoMonoObjeto;

public class RepositorioSerializableListaIndexable<T extends Keyable<K>,K> implements AccesoIndexado<T, K> {
	private HashMap<K, T> elementos;
	public String path;
	private AlmacenSerializadoMonoObjeto<HashMap<K, T>> adaptadorSerializadoMonoObjeto;
	
	
	public RepositorioSerializableListaIndexable(String path) throws Exception {
		super();
		if(path.isEmpty()) throw new Exception("ruta vacia");
		this.path = path;
		adaptadorSerializadoMonoObjeto=new AlmacenSerializadoMonoObjeto<HashMap<K,T>>(path);
		elementos = adaptadorSerializadoMonoObjeto.leer();
	}

	@Override
	public boolean grabar(T objeto) {
		if(elementos.containsKey(objeto.getKey())) return false;
		elementos.put(objeto.getKey(), objeto);
		return adaptadorSerializadoMonoObjeto.grabar(elementos);
	}

	@Override
	public Optional<T> leer(K k) {
		return Optional.ofNullable(elementos.get(k));
	}

	@Override
	public List<T> getTodos() {
		return elementos.values().stream().collect(Collectors.toList());
	}

}

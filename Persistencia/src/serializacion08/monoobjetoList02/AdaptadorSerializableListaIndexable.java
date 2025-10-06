package serializacion08.monoobjetoList02;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AdaptadorSerializableListaIndexable<T extends Keyable<K>,K> implements AccesoIndexado<T, K> {
	private HashMap<K, T> elementos;
	public String path;
	private AdaptadorSerializadoMonoObjeto<HashMap<K, T>> adaptadorSerializadoMonoObjeto;
	
	
	public AdaptadorSerializableListaIndexable(String path) throws Exception {
		super();
		//programacion por contrato
		if(path.isEmpty()) throw new Exception("ruta vacia");
		this.path = path;
		adaptadorSerializadoMonoObjeto=new AdaptadorSerializadoMonoObjeto<HashMap<K,T>>(path);
		elementos = adaptadorSerializadoMonoObjeto.leer();
		if(elementos==null) {
			elementos=new HashMap<K, T>();
			adaptadorSerializadoMonoObjeto.grabar(elementos);
		}
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

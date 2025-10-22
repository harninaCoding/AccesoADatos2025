package modelo.repositorios.serializadomultiobjetoindexado;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import modelo.accesores.Keyable;
import modelo.accesores.monoobjetolista.AlmacenSerializadoMonoObjeto;
import modelo.accesores.monoobjetolista.PersistenciableMonoObjeto;
import modelo.accesores.serializadomultiobjetoindexado.AlmacenSerializadoMultiObjeto;
import modelo.accesores.serializadomultiobjetoindexado.PersistenciableMultiObjeto;

public class RepositorioSerializadoMultiObjetoIndexable<T extends Keyable<K> & Serializable, K>
		implements RepositorioIndexado<T, K> {

	//Aqui esta el cambio de la inversion de dependenciass
//	private AlmacenSerializadoMultiObjeto<T> almacenObjetos;
	private PersistenciableMultiObjeto<T,T> almacenObjetos;
	private HashMap<K, Long> indiceEnRAM;
	private PersistenciableMonoObjeto<HashMap<K, Long>,HashMap<K, Long>> almacenIndiceEnPersistencia;
//	private AlmacenSerializadoMonoObjeto<HashMap<K, Long>> almacenIndiceEnPersistencia;
	private final String objetosPathSufix = "objetos";
	public String getObjetosPathSufix() {
		return objetosPathSufix;
	}

	public String getIndicePathSufix() {
		return indicePathSufix;
	}

	private final String indicePathSufix = "indice";

	public RepositorioSerializadoMultiObjetoIndexable(String path) {
		super();
		try {
			almacenObjetos = new AlmacenSerializadoMultiObjeto<T>(path + objetosPathSufix);
			almacenIndiceEnPersistencia = new AlmacenSerializadoMonoObjeto<HashMap<K, Long>>(path + indicePathSufix);
			indiceEnRAM = almacenIndiceEnPersistencia.leer();
			if (indiceEnRAM == null) {
				indiceEnRAM = new HashMap<K, Long>();
				almacenIndiceEnPersistencia.grabar(indiceEnRAM);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Optional<T> leer(K k) {
		T t=null;
		if(indiceEnRAM.containsKey(indiceEnRAM.containsKey(k))){
			t=almacenObjetos.leer(indiceEnRAM.get(k));
		}
		return Optional.ofNullable(t);
	}

	@Override
	public boolean grabar(T t) {
		// 1 grabar el objeto en el fichero de objetos
		// 2 grabar el hasmap con el nuevo objeto
		if (!indiceEnRAM.containsKey(t.getKey())) {
			boolean grabar = almacenObjetos.grabar(t);
			if (grabar) {
				long i = indiceEnRAM.size() + 1L;
				indiceEnRAM.put(t.getKey(), i);
				almacenIndiceEnPersistencia.grabar(indiceEnRAM);
			}
			return grabar;
		}
		return false;
	}

	@Override
	public List<T> getTodos() {
		return indiceEnRAM.entrySet().stream()
				.map(entry->almacenObjetos.leer(entry.getValue()))
				.collect(Collectors.toList());
	}

}

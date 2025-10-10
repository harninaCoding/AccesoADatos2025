package serializacion08.monoobjetoList02;

import java.util.List;
import java.util.Optional;

public interface AccesoIndexado<T extends Keyable<K>, K> extends Grabable<T>{
	public Optional<T> leer(K k);
	public List<T> getTodos();
}

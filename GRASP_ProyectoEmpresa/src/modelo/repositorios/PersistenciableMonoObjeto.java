package modelo.repositorios;

import java.io.IOException;

public interface PersistenciableMonoObjeto<S,T> extends GrabableMonoObjeto<T>{
	public S leer() throws IOException;
}

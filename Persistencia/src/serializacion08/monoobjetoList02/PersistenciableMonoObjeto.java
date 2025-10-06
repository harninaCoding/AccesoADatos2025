package serializacion08.monoobjetoList02;

import java.io.IOException;

public interface PersistenciableMonoObjeto<S,T> extends GrabableMonoObjeto<T>{
	public S leer() throws IOException;
}

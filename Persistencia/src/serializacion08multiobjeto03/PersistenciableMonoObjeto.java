package serializacion08multiobjeto03;

import java.io.IOException;

public interface PersistenciableMonoObjeto<S,T> extends Grabable<T>{
	public S leer() throws IOException;
}

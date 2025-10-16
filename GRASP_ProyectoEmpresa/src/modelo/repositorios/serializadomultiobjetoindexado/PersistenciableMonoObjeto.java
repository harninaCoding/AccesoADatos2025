package modelo.repositorios.serializadomultiobjetoindexado;

import java.io.IOException;

import modelo.accesores.Grabable;

public interface PersistenciableMonoObjeto<S,T> extends Grabable<T>{
	public S leer() throws IOException;
}

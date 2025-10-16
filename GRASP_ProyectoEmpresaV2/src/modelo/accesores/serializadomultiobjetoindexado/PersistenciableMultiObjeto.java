package modelo.accesores.serializadomultiobjetoindexado;

import modelo.accesores.Grabable;

public interface PersistenciableMultiObjeto<S,T> extends Grabable<T>{
	public S leer(Long posicion) ;
}

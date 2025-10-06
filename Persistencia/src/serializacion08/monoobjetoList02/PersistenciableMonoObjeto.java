package serializacion08.monoobjetoList02;

public interface PersistenciableMonoObjeto<S,T> extends GrabableMonoObjeto<T>{
	public S leer();
}

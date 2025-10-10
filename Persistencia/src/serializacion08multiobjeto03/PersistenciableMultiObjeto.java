package serializacion08multiobjeto03;

public interface PersistenciableMultiObjeto<S,T> extends Grabable<T>{
	public S leer(Long posicion) ;
}

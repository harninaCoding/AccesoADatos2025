package ejemplos;
public class Cafetera {
	short capacidadMaxima, cantidadActual;

	public Cafetera() {
		// Los valores por defecto los conocemos por lo tanto
		// no deben entrar por parametros en el constructor
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}

	/**
	 * Incrementar la cantidadACtual hasta el valor de la capacidadMAxima
	 */
	public void llenarCafetera() {
		cantidadActual=capacidadMaxima;
	}
	/**
	 * decremeta en una cantidad la cantidadACtual de la cafetera
	 * la cantidad nunca puede sobrepasar la cantidadActual
	 * @param capacidad la cantidad que debe decrementar la cantidadActual.
	 * Debe ser un valor positivo
	 * @return el valor en que ha podido decrementar la cantidadACtual
	 */
	public int servirTaza(int capacidad) {
		cantidadActual-=capacidad;
		if(cantidadActual<0){
			capacidad+=cantidadActual;
			cantidadActual=0;
		}
		return capacidad;
	}
	/**
	 * Pone a cero la capacidadActual
	 */
	public void vaciarCafetera() {
		cantidadActual=0;
	}

	/**
	 * Incrementa la cantidadActual en la cantidad que diga el parametro
	 * capacidad sin que sobrepase la capacidadMaxima
	 * @param capacidad cantidad que quiero incrementar la cantidadActual 
	 */
	public void agregarCafe(int capacidad) {
		cantidadActual+=capacidad;
		if(cantidadActual>1000)
			cantidadActual=1000;
	}	
}

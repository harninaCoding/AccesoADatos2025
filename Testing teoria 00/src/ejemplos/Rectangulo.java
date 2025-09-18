package ejemplos;

public class Rectangulo {
	Punto superiorIzquierdo,inferiorDerecho;

	public Rectangulo(Punto superiorIzquierdo,  Punto inferiorDerecho) {
		this.superiorIzquierdo = superiorIzquierdo;
		this.inferiorDerecho = inferiorDerecho;
	}
	
	void mostrarEstado(){
		System.out.println("Este rectangulo tiene");
		System.out.println("arribaizq: ");
		superiorIzquierdo.mostrarEstado();
		System.out.println("abajoDcha: ");
		inferiorDerecho.mostrarEstado();
	}
	
	int calcularSuperficie(){
		int base,altura;
		base=superiorIzquierdo.posicionX-inferiorDerecho.posicionX;
		altura=superiorIzquierdo.posicionY-inferiorDerecho.posicionY;
		return base*altura; 
	}
	/**
	 * Cambia los valores de los vertices del rectangulo dependiendo de los valores
	 * que tengan los parametros. Los valores negativos desplazan hacia abajo o izquierda
	 * Los valores positivos desplazan hacia arriba o derecha y cero no desplaza esa dimension
	 * @param desplazamientoHorizontal 
	 * @param desplazamientoVertical
	 */
	void desplazarRectangulo(int desplazamientoHorizontal,int desplazamientoVertical){
		//Horizontal (tengo que modificar los cuatro puntos
		inferiorDerecho.posicionX+=desplazamientoHorizontal;
		superiorIzquierdo.posicionX+=desplazamientoHorizontal;
		//Vertical
		inferiorDerecho.posicionY+=desplazamientoVertical;
		superiorIzquierdo.posicionY+=desplazamientoVertical;
	}
	
}

package ejemplos;

public class Rectangulo {
	Punto superiorIzquierdo,inferiorIzquierdo,superiorDerecho,inferiorDerecho;

	public Rectangulo(Punto superiorIzquierdo, Punto inferiorIzquierdo, Punto superiorDerecho, Punto inferiorDerecho) {
		this.superiorIzquierdo = superiorIzquierdo;
		this.inferiorIzquierdo = inferiorIzquierdo;
		this.superiorDerecho = superiorDerecho;
		this.inferiorDerecho = inferiorDerecho;
	}
	
	void mostrarEstado(){
		System.out.println("Este rectangulo tiene");
		System.out.println("arribaizq: ");
		superiorIzquierdo.mostrarEstado();
		System.out.println("arribaDcha: ");
		superiorDerecho.mostrarEstado();
		System.out.println("abajoIzq: ");
		inferiorIzquierdo.mostrarEstado();
		System.out.println("abajoDcha: ");
		inferiorDerecho.mostrarEstado();
	}
	
	int calcularSuperficie(){
		int base,altura;
		base=superiorDerecho.posicionX-superiorIzquierdo.posicionX;
		altura=superiorDerecho.posicionY-inferiorDerecho.posicionY;
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
		inferiorIzquierdo.posicionX+=desplazamientoHorizontal;
		inferiorDerecho.posicionX+=desplazamientoHorizontal;
		superiorIzquierdo.posicionX+=desplazamientoHorizontal;
		superiorDerecho.posicionX+=desplazamientoHorizontal;
		//Vertical
		inferiorIzquierdo.posicionY+=desplazamientoVertical;
		inferiorDerecho.posicionY+=desplazamientoVertical;
		superiorIzquierdo.posicionY+=desplazamientoVertical;
		superiorDerecho.posicionY+=desplazamientoVertical;
	}
	
}

package ejemplos;

public class Punto {
	int posicionX,posicionY;

	public Punto(int posicionX, int posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	
	void mostrarEstado(){
		System.out.println("valores del punto: x:"+posicionX+" y:"+posicionY);
	}
	
	public void mover(int offsetX,int offsetY) {
		this.posicionX+=offsetX;
		this.posicionY=offsetY;
	}
}

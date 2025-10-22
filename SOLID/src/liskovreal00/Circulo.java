package liskovreal00;

import java.awt.Point;

public class Circulo extends Forma {

	public Circulo(Point point) {
		super(point);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mover(Movement movement) {
		super.mover(movement);
		System.out.println("que agusto se esta despues de moverse");
	}

}

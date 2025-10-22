package liskovreal00;

import java.awt.Point;

public class Cuadrado extends Forma {

	public Cuadrado(Point point) {
		super(point);
	}

	@Override
	public void mover(Movement movement) {
		System.out.println("Yo no me muevo");
	}
}

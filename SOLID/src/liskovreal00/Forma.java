package liskovreal00;

import java.awt.Point;

public abstract class Forma {
	Point point;
	

	public Point getPoint() {
		return point;
	}


	public Forma(Point point) {
		super();
		this.point = point;
	}


	public void mover(Movement movement) {
		point.setLocation(point.getX()+movement.getHorizontal(), point.getY()+movement.getVertical());
	}

}

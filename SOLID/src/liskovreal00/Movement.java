package liskovreal00;

public class Movement {
	float vertical;
	float horizontal;
	public Movement(float vertical, float horizontal) {
		super();
		this.vertical = vertical;
		this.horizontal = horizontal;
	}
	public float getVertical() {
		return vertical;
	}
	public void setVertical(float vertical) {
		this.vertical = vertical;
	}
	public float getHorizontal() {
		return horizontal;
	}
	public void setHorizontal(float horizontal) {
		this.horizontal = horizontal;
	}
	
}

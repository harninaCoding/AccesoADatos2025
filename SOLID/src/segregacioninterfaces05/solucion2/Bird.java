package segregacioninterfaces05.solucion2;

public interface Bird {
	public default String eat() {
		return"todos comen igual";
	}

	public String tweet();
}

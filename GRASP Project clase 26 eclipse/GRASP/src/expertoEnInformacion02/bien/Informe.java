package expertoEnInformacion02.bien;

public class Informe {


	public int[] parciales = { 4, 5, 6, 3, 8, 4, 5, 6, 2, 2, 7, 8, 8, 8, 8, 8, 9, 9, 0 };
	public void calcultaeTotal() {
		int total = 0;
		for (Integer parcial : parciales) {
			total = total + parcial;
		}
	}
}

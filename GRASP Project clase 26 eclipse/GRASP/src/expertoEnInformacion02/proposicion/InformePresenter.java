package expertoEnInformacion02.proposicion;

public class InformePresenter {
	Informe informe = new Informe();

	String letrero="cumplimiento";

	public void calcultaeTotal() {
		int total = 0;
		for (Integer parcial : informe.parciales) {
			total = total + parcial;
			System.out.println(letrero);
		}
	}
}
class Informe {

	public int[] parciales = { 4, 5, 6, 3, 8, 4, 5, 6, 2, 2, 7, 8, 8, 8, 8, 8, 9, 9, 0 };
}

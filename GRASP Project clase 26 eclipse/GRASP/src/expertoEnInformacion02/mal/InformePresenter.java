package expertoEnInformacion02.mal;

public class InformePresenter {
	Informe informe = new Informe();


	public void calcultaeTotal() {
		int total = 0;
		for (Integer parcial : informe.parciales) {
			total = total + parcial;
		}
	}
}


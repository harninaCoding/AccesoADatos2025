package openclosed02;

import java.util.ArrayList;
import java.util.List;

class Coche {
	String marca;
	float precioMedio;

	public Coche(String marca, float precioMedio) {
		super();
		this.marca = marca;
		this.precioMedio = precioMedio;
	}

	String getMarcaCoche() {
		return marca;
	}

	public float getPrecioMedio() {
		return precioMedio;
	}

	public static void main(String[] args) {
		ColeccionCoches coches = new ColeccionCoches();
		coches.add(new Coche("Renault", 18000));
		coches.add(new Coche("Audi", 25000));
		coches.add(new Coche("Mercedes", 27000));
		imprimirPrecioMedioCoche(coches.getCoches());
	}

	//Este codigo no necesita modificarse
	public static void imprimirPrecioMedioCoche(List<Coche> arrayCoches) {
		for (Coche coche : arrayCoches) {
			System.out.println(coche.getPrecioMedio());
		}
	}

}

class ColeccionCoches {
	ArrayList<Coche> arrayCoches = new ArrayList<>();

	public boolean add(Coche e) {
		return arrayCoches.add(e);
	}

	public Coche findCocheByName(String name) {
		for (Coche coche : arrayCoches) {
			if (coche.getMarcaCoche().equals(name)) {
				return coche;
			}
		}
		return null;
	}

	public ArrayList<Coche> getCoches() {
		return arrayCoches;
	}

}

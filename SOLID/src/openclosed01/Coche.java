package openclosed01;

public class Coche {
	String marca;

	Coche(String marca) {
		this.marca = marca;
	}

	String getMarcaCoche() {
		return marca;
	}
	// 00
//		public static void main(String[] args) {
//			Coche[] arrayCoches = { new Coche("Renault"), new Coche("Audi") };
//			imprimirPrecioMedioCoche(arrayCoches);
//		}
//	
//		public static void imprimirPrecioMedioCoche(Coche[] arrayCoches) {
//			for (Coche coche : arrayCoches) {
//				if (coche.marca.equals("Renault"))
//					System.out.println(18000);
//				if (coche.marca.equals("Audi"))
//					System.out.println(25000);
//			}
//		}
	// 01
	public static void main(String[] args) {
		Coche[] arrayCoches = { 
				new Coche("Renault"), 
				new Coche("Audi"), 
				new Coche("Mercedes") };
		imprimirPrecioMedioCoche(arrayCoches);
	}

	public static void imprimirPrecioMedioCoche(Coche[] arrayCoches) {
		for (Coche coche : arrayCoches) {
			if (coche.marca.equals("Renault"))
				System.out.println(18000);
			if (coche.marca.equals("Audi"))
				System.out.println(25000);
			//Modificar codigo existente
			if (coche.marca.equals("Mercedes"))
				System.out.println(27000);
		}
	}
	
}

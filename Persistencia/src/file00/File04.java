package file00;

import java.io.File;

public class File04 {

	public static void main(String[] args) {
		// algun que otro problema
		File elemento = new File("C:/acierto/colosal");
		if (elemento.exists()) {
			System.out.println("existe");
		} else {
			System.out.println("no existe");
			// mkdir no puede crear colosal si no existe acierto
			// if (elemento.mkdir()) {
			// mkdirs crea todas las carpetas necesarias para satisfacer la ruta
			if (elemento.mkdirs()) {
				System.out.println("creado");
			} else
				System.out.println("no creado");
		}
	}
}

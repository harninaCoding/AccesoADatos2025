package file00;

import java.io.File;

public class File03 {
	public static void main(String[] args) {
		// vamos ahora con los directorios
		File directorio = new File("c:/farruquito");
		if (!directorio.exists()) {
			// para crear un directorio
			if (directorio.mkdir()) {
				System.out.println("creado");
			} else
				System.out.println("no creado");
		}
	}
}

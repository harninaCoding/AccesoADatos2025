package file00;

import java.io.File;

public class File08 {
	public static void main(String[] args) {
		// usando File en vez de String
		String ruta = "c:/USers/estar";
		File carpeta = new File(ruta);
		if (carpeta.exists() && carpeta.isDirectory()) {
			File[] listFiles = carpeta.listFiles();
			for (File file : listFiles) {
				if (file.isDirectory())
					try {
						for (File fileR : file.listFiles()) {
							System.out.println(fileR);
						}

					} catch (Exception e) {
						// falla al intentar acceder desde un acceso directo
						System.out.println("fallo en " + file);
						System.out.println("permiso lectura " + file.canRead());
						System.out.println("permiso escr " + file.canWrite());
						System.out.println("permiso ejecu " + file.canExecute());
					}
			}
		}
	}
}

package file00;

import java.io.File;

public class File09 {
	public void recorre(File raiz) {	
		if(raiz.isDirectory()) {
			File[] listFiles = raiz.listFiles();
			for (File file2 : listFiles) {
				System.out.println(file2);
				if(file2.isDirectory())
					recorre(file2);
			}
		}
	}
	public static void main(String[] args) {
		// usando File en vez de String
		String ruta = "c:/USers/estar";
		File carpeta = new File(ruta);
		File09 file09 = new File09();
		file09.recorre(carpeta);
	}
}

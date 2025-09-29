package file00;

import java.io.File;

public class File07 {
	public static void main(String[] args) {
		//vamos a trabajar con los elementos de un directorio
		String ruta="c:/users/estar";
		File carpeta=new File(ruta);
		//para trabajr con carpetas
		if (carpeta.exists()&&carpeta.isDirectory()){
			//veamos el contenido de una carpeta
			String[] list = carpeta.list();
			for (String string : list) {
				System.out.println(string);
			}
		}
	}
}

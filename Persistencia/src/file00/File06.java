package file00;

import java.io.File;
import java.io.IOException;

public class File06 {
	public static void main(String[] args) throws IOException {
		String rutaRelativa = "canciones";
//	String rutaAbsolutaChunga = "c:/windows/";
		String rutaAbsolutaChunga = "c:/windows/system32";
		File cancion = new File(rutaRelativa, "Evil.mp3");
//	File cancion = new File(rutaRelativa, "FeatureToastBulldogImg - copia.png");
		// si el elemento no existe las preguntas sobre los permisos son inutiles
		try {
			new File(rutaRelativa).mkdir();
			cancion.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// antes de preguntarse sobre los derechos de algo hay que preguntarse si ese
		// algo existe
//		System.out.println("puede leer relativa " + cancion.canRead());
//		System.out.println("puede escribir  relativa " + cancion.canWrite());
//		System.out.println("puede ejecutar  relativa " + cancion.canExecute());
		cancion = new File(rutaAbsolutaChunga, "FeatureToastBulldogImg1 - copia.png");
		// Da error si intento crear el archivoæ
		try {
			cancion.createNewFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (cancion.exists())
			System.out.println("existe");
		System.out.println("puede leer " + cancion.canRead());
		System.out.println("puede escribir " + cancion.canWrite());
		System.out.println("puede ejecutar " + cancion.canExecute());
		System.out.println(cancion.delete());
	}
}

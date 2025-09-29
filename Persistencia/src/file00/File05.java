package file00;

import java.io.File;
import java.io.IOException;

public class File05 {
	public static void main(String[] args) throws IOException {
		String ruta = new String("c:/Users/estar/Music");
		File cancion = new File(ruta, "Evil.mp3");
		String rutaRelativaString="./valores";
		String rutaRelativan="../nueva";
		System.out.println("ruta relativa "+new File(rutaRelativan).exists());
		System.out.println(cancion.getPath());
		//la ruta canonica es una y solo una
		//la ruta absoluta muestra el camino seguido para llegar a un punto desde
		//la raiz
		//la relativa solo tiene en cuenta desde donde esta
		//como no podemos asegurar que tengamos acceso a la ruta canonica( falta de derechos)
		//necesitamos rodear con try o tirar posible excepcion
		System.out.println(cancion.getCanonicalPath());
		System.out.println(cancion.getAbsolutePath());
		// Creando la ruta relativa
		// la ruta relativa se calcula con respecto a donde estoy
		String rutaRelativa = "canciones";
		File cancionOtra = new File(rutaRelativa, "Evil.mp3");
		System.out.println(cancionOtra.getPath());
		System.out.println(cancionOtra.getCanonicalPath());
		System.out.println(cancionOtra.getAbsolutePath());

		String rutaRelativaDos = "../FileClase/canciones";
		cancionOtra = new File(rutaRelativaDos, "Evil.mp3");
		System.out.println(cancionOtra.getPath());
		System.out.println(cancionOtra.getCanonicalPath());
		System.out.println(cancionOtra.getAbsolutePath());
		
		rutaRelativaDos = "../FileClase/../FileClase/canciones";
		cancionOtra = new File(rutaRelativaDos, "Evil.mp3");
		System.out.println(cancionOtra.getPath());
		System.out.println(cancionOtra.getCanonicalPath());
		System.out.println(cancionOtra.getAbsolutePath());
	}
}

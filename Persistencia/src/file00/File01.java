package file00;

import java.io.File;

public class File01 {

	public static void main(String[] args) {
		// La idea es asociar un objeto file con un fichero o directorio
		// como el file es un objeto logico, es probable que el objeto fisico
		// al que lo asociamos no exista
		File elemento=new File("datos/datos.dat");
		//si pongo solo el nombre
		if(!elemento.exists())
			System.out.println("el elemnto no existe");
		else
			System.out.println("ähora si existe");

	}

}

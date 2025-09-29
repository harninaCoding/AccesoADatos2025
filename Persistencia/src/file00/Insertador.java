package file00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Insertador {
	// Crea un programa que haga una copia del contenido de un fichero en otro
	public static void main(String[] args) {
		String rutaFuente = "datos.txt";
		File fuente = new File(rutaFuente);
		if (fuente.exists()) {
			String rutaDestino = "copia.dat";
			File destino = new File(rutaDestino);
			FileReader flujoFuente;
			FileWriter flujoDestino;
			try {
				flujoFuente = new FileReader(fuente);
				// abierto para sobrescritura
				flujoDestino = new FileWriter(destino);
				// comenzando el proceso de copia
				int posicion=10;
				char[] lectura=new char[posicion];
				flujoFuente.read(lectura);
				while (!(lectura == null)) {
					// esto inserta al final mientras no se cierra
					// en la siguiente apertura una orden de escritura
					// si sobreescribe en el fichero
					flujoDestino.write(lectura);
					flujoFuente.read(lectura);
				}
				flujoDestino.close();
				flujoFuente.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println(" el archivo fuente no existe");
		}
	}
}

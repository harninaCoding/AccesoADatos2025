package ficherostexto01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ProblemaUTF {

	public static void main(String[] args) {
		File archivo = new File("prueba.txt");
		BufferedReader br = null;

		if (archivo.exists()) {
			try {
				// Forzamos UTF-8 (o el que necesites)
				br = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), StandardCharsets.UTF_8));

				String linea;
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)
						br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

package ficherostexto01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirTexto {
	public static void main(String[] args) {
	    File archivo = new File("prueba.txt");
	    FileWriter flujoW = null;

	    try {
	        flujoW = new FileWriter(archivo); // crea o sobrescribe
	        for (int i = 0; i < 6; i++) {
	            int valor = (i + 1) * 2;
	            System.out.println(valor);
	            flujoW.write(valor + "\n"); // grabamos como texto
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (flujoW != null) flujoW.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


}

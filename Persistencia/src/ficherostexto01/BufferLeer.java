package ficherostexto01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferLeer {
	public static void main(String[] args) {
		
	File archivo = new File("prueba.txt");
	BufferedReader br = null;

	if (archivo.exists()) {
	    try {
	        br = new BufferedReader(new FileReader(archivo));
	        String linea;
	        while ((linea = br.readLine()) != null) {
	            System.out.println(linea);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (br != null) br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

}
}

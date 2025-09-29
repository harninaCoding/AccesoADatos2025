package ficherostexto01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerTexto {
	public static void main(String[] args) {
	    File archivo = new File("prueba.txt");
	    FileReader flujoR = null;

	    if (archivo.exists()) {
	        try {
	            flujoR = new FileReader(archivo);
	            char[] array = new char[4]; // leo 4 caracteres
	            System.out.println("he leido " + flujoR.read(array));
	            for (char c : array) {
	                System.out.print(c + " ");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (flujoR != null) flujoR.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

}

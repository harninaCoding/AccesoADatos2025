package file00;

import java.io.File;
import java.io.IOException;

public class File02 {
	public static void main(String[] args) {
		// Para que se asocia el elemento logico si no tiene porque existir
		File elemento = new File("cosarelativa.plh");
		if (elemento.exists()) {
			System.out.println("el objeto existe");
		} else {
			System.out.println("el elemnto no existe");
			//podemos crear un elemnto inexistente
			//en este caso un fichero
			try {
				if(elemento.createNewFile()) {
					System.out.println("creado satisfactoriamente");
				} else
					System.out.println("error en la creacion");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//TEndre derecho en cualquier lado?
		File archivoNo=new File("C:/Windows/System32/cosarelatica.plh");
		if(!archivoNo.exists()){
			//crear unarchivo
			try {
				if(archivoNo.createNewFile())
					System.out.println("creado satisfactoriamente");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("error en la creacion fuera de aqui");
			}
		}
	}
}

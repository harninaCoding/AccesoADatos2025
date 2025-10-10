package serializacion08.multiobjetoteoria04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Productordos {
	public static void main(String[] args) {
//		Cliente cliente = new Cliente("1", "tiburcio", 0,"cadiz" );
		ClientedOS cliente = new ClientedOS("2", "Lucho", 0,"badajoz" );
		String name = "clientesMulti.dat";
		ObjectOutputStream serializador = null;
		boolean exists = new File(name).exists();
		try(FileOutputStream out = new FileOutputStream(name,true);) {
			if(exists) {
				//No escribe el header del fichero
				serializador=new MyObjectOutputStream(out);
			}else {
				//si escribe el header
				serializador=new ObjectOutputStream(out);
			}
			serializador.writeObject(cliente);
			System.out.println("todo bien");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

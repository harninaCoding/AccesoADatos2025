package serializacion08.multiobjetoteoria04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Productor {
	public static void main(String[] args) {
//		Cliente cliente = new Cliente(1, "donald", true, 10000000f);
		Cliente cliente = new Cliente(2, "ulises", true, 10000000f);
		String name = "clientesMulti.dat";
		ObjectOutputStream serializador = null;
		try {
			boolean exists = new File(name).exists();
			FileOutputStream out = new FileOutputStream(name,true);
			if(exists) {
				serializador=new MyObjectOutputStream(out);
			}else {
				serializador=new ObjectOutputStream(out);
			}
			serializador.writeObject(cliente);
			System.out.println("todo bien");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
				try {
					serializador.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	}
}

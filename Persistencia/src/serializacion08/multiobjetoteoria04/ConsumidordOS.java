package serializacion08.multiobjetoteoria04;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ConsumidordOS {

	public static void main(String[] args) {
		ObjectInputStream deserilizador = null;
		ClientedOS cliente=null;
		try(FileInputStream fileInputStream=new FileInputStream("clientesMulti.dat")) {
			deserilizador=new ObjectInputStream(fileInputStream);
			cliente=(ClientedOS) deserilizador.readObject();
			System.out.println(cliente);
			cliente=(ClientedOS) deserilizador.readObject();
			System.out.println(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}

package binarios04InterfacesSolucion;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Adaptador {
	private String path;

	public Adaptador(String path) {
		super();
		this.path = path;
	}

	public Object leer() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean grabar(Object objeto, Adecuador adecuador) {
		assert path != null && objeto != null;
		File file = new File(path);
		boolean retorno = false;
		FileOutputStream flujoW = null;
		try {
			flujoW = new FileOutputStream(file);
			DataOutputStream conversorW = new DataOutputStream(flujoW);
			// ahora viene lo concreto
			retorno = adecuador.graba(conversorW, objeto);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			flujoW.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return retorno;
	}

}

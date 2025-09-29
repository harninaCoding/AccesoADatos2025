package binarios04InterfacesProblema;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import binarios03Adaptadores.Cliente;

public class AdaptadorClasePersona {
	private String path;
	
	
	public AdaptadorClasePersona(String path) {
		super();
		this.path = path;
	}
	
	public Persona leer() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean grabar(Persona objeto) {
		assert path != null && objeto != null;
		File file = new File(path);
		boolean retorno = false;
		FileOutputStream flujoW = null;
		try {
			flujoW = new FileOutputStream(file);
			DataOutputStream conversorW = new DataOutputStream(flujoW);
			conversorW.writeUTF(objeto.getNombre());
			conversorW.writeByte(objeto.getEdad());
			conversorW.writeFloat(objeto.getDioptrias());
			conversorW.writeBoolean(objeto.isEnfermo());	
			retorno = true;
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

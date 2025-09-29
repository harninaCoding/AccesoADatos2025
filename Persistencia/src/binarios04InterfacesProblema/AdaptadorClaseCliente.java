package binarios04InterfacesProblema;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import binarios03Adaptadores.Cliente;

public class AdaptadorClaseCliente {

	private String path;
	
	
	public AdaptadorClaseCliente(String path) {
		super();
		this.path = path;
	}
	
	public Cliente leer() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean grabar(Cliente objeto) {
		assert path != null && objeto != null;
		File file = new File(path);
		boolean retorno = false;
		FileOutputStream flujoW = null;
		try {
			flujoW = new FileOutputStream(file);
			DataOutputStream conversorW = new DataOutputStream(flujoW);
			conversorW.writeInt(objeto.getNumero());
			conversorW.writeUTF(objeto.getNombre());
			conversorW.writeBoolean(objeto.isPreferente());
			conversorW.writeFloat(objeto.getSaldo());
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

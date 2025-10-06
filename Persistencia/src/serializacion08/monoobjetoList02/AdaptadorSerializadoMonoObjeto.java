package serializacion08.monoobjetoList02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AdaptadorSerializadoMonoObjeto<S extends Serializable> implements PersistenciableMonoObjeto<S,S>{

	private File file;
	private ObjectInputStream flujoR;
	private ObjectOutputStream flujoW;

	public AdaptadorSerializadoMonoObjeto(String path) throws Exception {
		super();
		file = new File(path);
		if (!file.exists())
			file.createNewFile();

	}

	@Override
	public S leer() {
		//Este es el flujo que hay que cerrar
		FileInputStream in = null;
		try {
			 in= new FileInputStream(file);
			this.flujoR = new ObjectInputStream(in);
		} catch (Exception e) {
			try {
				in.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		S objetos = null;
		if (file.exists()) {
			try {
				try {
					objetos = (S) flujoR.readObject();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				} catch (IOException e) {
				return null;
			}
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return objetos;
	};
	@Override
	public boolean grabar(S objeto) {
		boolean retorno = false;
		try {
			this.flujoW = new ObjectOutputStream(new FileOutputStream(file));
			flujoW.writeObject(objeto);
			flujoW.flush();
			retorno = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			flujoW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retorno;
	};
}

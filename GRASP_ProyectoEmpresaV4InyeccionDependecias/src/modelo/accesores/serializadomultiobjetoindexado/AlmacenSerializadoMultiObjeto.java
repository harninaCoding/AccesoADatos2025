package modelo.accesores.serializadomultiobjetoindexado;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import modelo.repositorios.serializadomultiobjetoindexado.MyObjectOutputStream;

public class AlmacenSerializadoMultiObjeto<S extends Serializable> implements PersistenciableMultiObjeto<S, S> {

	private File file;
	private ObjectInputStream flujoR;
	private ObjectOutputStream flujoW;

	public AlmacenSerializadoMultiObjeto(String path) throws Exception {
		super();
		file = new File(path);
	}

	@Override
	public boolean grabar(S objeto) {
		boolean exists = file.exists();
		try (FileOutputStream out = new FileOutputStream(file.getAbsolutePath(), true)) {
			if (exists) {
				this.flujoW = new MyObjectOutputStream(out);
			} else {
				this.flujoW = new ObjectOutputStream(out);
			}
			flujoW.writeObject(objeto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public S leer(Long posicion) {
		Object objeto = null;
		try (FileInputStream in = new FileInputStream(file)) {
			this.flujoR = new ObjectInputStream(in);
			if (this.flujoR != null) {
				int contador = 1;
				do {
					// si no es capaz de leer porque llega al final, tira excepcion
					// entonces yo debo poner a null el objeto
					objeto = flujoR.readObject();
				} while (objeto != null && contador++ <= posicion);
			}
		} catch (Exception e) {
			objeto = null;
		}
		return (S) objeto;
	}

}

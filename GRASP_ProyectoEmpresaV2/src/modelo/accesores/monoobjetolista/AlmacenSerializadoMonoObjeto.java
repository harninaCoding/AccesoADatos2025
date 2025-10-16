 package modelo.accesores.monoobjetolista;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AlmacenSerializadoMonoObjeto<S> implements PersistenciableMonoObjeto<S, S> {

	private File file;
	private ObjectInputStream flujoR;
	private ObjectOutputStream flujoW;

	public AlmacenSerializadoMonoObjeto(String path) throws Exception {
		super();
		file = new File(path);
	}

	@Override
	public S leer() {
		S objetos=null;
		try(FileInputStream in= new FileInputStream(file)) {
			this.flujoR = new ObjectInputStream(in);
			objetos = (S) flujoR.readObject();
		} catch (Exception e) {
				objetos=null;
		}
		return objetos;
	};

	@Override
	public boolean grabar(S objeto) {
		boolean retorno = false;
		try(FileOutputStream fileOutputStream=new FileOutputStream(file)) {
			this.flujoW = new ObjectOutputStream(fileOutputStream);
			flujoW.writeObject(objeto);
			retorno = true;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return retorno;
	};
}

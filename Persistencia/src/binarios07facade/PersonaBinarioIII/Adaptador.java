package binarios07facade.PersonaBinarioIII;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public abstract class Adaptador<T,L,FR extends Closeable,FW extends Closeable>{
	private File file;
	private FR flujoR;
	private FW flujoW;

	public Adaptador(String path,  FR flujoR ,FW flujoW)  throws Exception {
		super();
		if(path.isEmpty()||flujoR==null||flujoW==null) throw new Exception("parametro no valido");
		file=new File(path);
		this.flujoR = flujoR;		
		this.flujoW=flujoW;
	}

	public T leer(Adecuador<T,L,FR,FW> adecuador) {
		T objetos = null;
		if (getFile().exists()) {
			try {
				objetos=adecuador.recupera(getFlujoR());
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				getFlujoR().close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return objetos;
	};

	public boolean grabar(L objeto,Adecuador<T,L,FR,FW> adecuador) {
		boolean retorno = false;
		retorno=adecuador.graba(getFlujoW(), objeto);
		try {
			getFlujoW().close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return retorno;
	};
	
	public File getFile() {
		return file;
	}
	
	public FW getFlujoW() {
		return flujoW;
	}

	public FR getFlujoR() {
		return flujoR;
	}
		
}

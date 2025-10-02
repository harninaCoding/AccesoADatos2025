package binarios07facade.definitivo;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public class Adaptador<T,L,FR extends Closeable,FW extends Closeable>{
	public void setFlujoR(FR flujoR) {
		this.flujoR = flujoR;
	}

	public void setFlujoW(FW flujoW) {
		this.flujoW = flujoW;
	}

	private File file;
	private FR flujoR;
	private FW flujoW;
	private Adecuador<T, L, FR, FW> adecuador;

	public Adaptador(String path, Adecuador<T, L, FR, FW> adecuador)  throws Exception {
		super();
		if(path.isEmpty()||adecuador==null) throw new Exception("parametro no valido");
		file=new File(path);
		if(!file.exists()) file.createNewFile();
		this.adecuador=adecuador;
	}

	public T leer() throws Exception {
		if(flujoR==null) throw new Exception("empty stream");
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

	public boolean grabar(FW flujoW, L objeto) throws Exception {
		if(flujoW==null)throw new Exception("empty stream");
		this.flujoW=flujoW;
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

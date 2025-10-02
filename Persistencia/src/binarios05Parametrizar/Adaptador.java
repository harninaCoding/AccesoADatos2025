package binarios05Parametrizar;

import binarios04InterfacesSolucion.Adecuador;


public abstract class Adaptador<L,T>{
	private String path;
	private Adecuador adecuador;

	public Adaptador(String path,Adecuador adecuador) throws Exception {
		super();
		if(path.isEmpty()||adecuador==null) throw new Exception("parametro no valido");
		this.path = path;
		this.adecuador=adecuador;
	}

	public Adaptador(Adecuador adecuador) {
		super();
		this.adecuador = adecuador;
	}

	public String getPath() {
		return path;
	}

	public Adecuador getAdecuador() {
		return adecuador;
	}

	public abstract L leer();

	public abstract boolean grabar(T objeto);

}

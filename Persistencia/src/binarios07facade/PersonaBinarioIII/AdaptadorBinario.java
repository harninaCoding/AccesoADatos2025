package binarios07facade.PersonaBinarioIII;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class AdaptadorBinario<T,L> extends Adaptador<T,L,DataInputStream,DataOutputStream>{

	private Adecuador<T,L,DataInputStream,DataOutputStream> adecuador;
	
	public AdaptadorBinario(String path, Adecuador<T,L,DataInputStream,DataOutputStream> adecuador)
			throws Exception {
		super(path, new DataInputStream(new FileInputStream(path)),new DataOutputStream(new FileOutputStream(path)));
		this.adecuador=adecuador;
	}

	public T leer() {
		return super.leer(adecuador);
	}

	public boolean grabar(L objeto) {
		return super.grabar(objeto, adecuador);
	}

}

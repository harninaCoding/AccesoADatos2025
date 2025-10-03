package binarios07facade.definitivo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;



public class AdaptadorBinario<T,L> 
	extends Adaptador<T,L,DataInputStream,DataOutputStream> 
	implements Grabable<L>{

	public AdaptadorBinario(
			String path,
			Adecuador<T,L,DataInputStream,DataOutputStream>	adecuador)
			throws Exception {
		super(path, adecuador);
		setFlujoR(new DataInputStream(new FileInputStream(getFile())));
		setFlujoW(getFlujoW());
	}

	@Override
	public boolean grabar(L objeto) throws Exception {
		return super.grabar(new DataOutputStream(new FileOutputStream(getFile(),true)), objeto);
	}
	
}

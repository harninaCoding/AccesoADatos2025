package binarios06FacadeI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class AdaptadorText<T,L> extends Adaptador<T, L,BufferedReader,BufferedWriter> {

	private Adecuador<T,L,BufferedReader,BufferedWriter> adecuador;
	public AdaptadorText(String path, Adecuador<T,L,BufferedReader,BufferedWriter> adecuador) throws Exception {
		super(path, new BufferedReader(new FileReader(path)),new BufferedWriter(new FileWriter(path)));
		this.adecuador=adecuador;
	}

	public T leer() {
		return super.leer(adecuador);
	}

	public boolean grabar(L objeto) {
		return super.grabar(objeto, adecuador);
	}

}

package binarios07facade.definitivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class AdaptadorText<T, L> extends Adaptador<T, L, BufferedReader, BufferedWriter> implements Grabable<L>{

	public AdaptadorText(String path, Adecuador<T, L, BufferedReader, BufferedWriter> adecuador) throws Exception {
		super(path, adecuador);
		setFlujoR(new BufferedReader(new FileReader(path)));
		setFlujoW(new BufferedWriter(new FileWriter(path)));
	}

	@Override
	public boolean grabar(L objeto) throws Exception {
		//despues de grabar, se cierra
		return super.grabar(new BufferedWriter(new FileWriter(getFile(),true)), objeto);
	}
}

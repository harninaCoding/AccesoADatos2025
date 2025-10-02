package binarios07facade.PersonaBinarioIII;

import java.io.IOException;

// abstracto
public interface Adecuador<T,L,C,G> {
	public boolean graba(G flujoW, L objeto);
	public T recupera(C flujoR) throws IOException;
}

package binarios04InterfacesSolucion;

import java.io.DataOutputStream;

// abstracto
public interface Adecuador {
	public boolean graba(DataOutputStream conversor, Object objeto);
}

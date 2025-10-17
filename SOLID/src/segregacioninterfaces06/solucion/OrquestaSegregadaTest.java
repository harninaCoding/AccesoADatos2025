package segregacioninterfaces06.solucion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrquestaSegregadaTest {

	@Test
	void testPonerAPunto() {
		OrquestaSegregada orquestaSegregada=new OrquestaSegregada();
		orquestaSegregada.ponerAPunto();
	}

}

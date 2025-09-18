package withstaticMethods;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaticMethodsTest {

	@Test
	void testGiveME() {
		assertTrue(StaticMethods01.giveME());
	}

}

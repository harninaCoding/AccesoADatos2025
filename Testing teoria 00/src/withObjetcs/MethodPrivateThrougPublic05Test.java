package withObjetcs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MethodPrivateThrougPublic05Test {

	@Test
	void testAddOdds() {
		int valueOne=1,valueTwo=1;
		int expected=2;
		// probando el método private indirectamente 
		MethodPrivateThrougPublic05 methodPrivateThrougPublic05=new MethodPrivateThrougPublic05();
		assertEquals(expected, methodPrivateThrougPublic05.addOdds(valueOne, valueTwo));
		valueOne=2;
		expected=-1;
		assertEquals(expected, methodPrivateThrougPublic05.addOdds(valueOne, valueTwo));
	}

}

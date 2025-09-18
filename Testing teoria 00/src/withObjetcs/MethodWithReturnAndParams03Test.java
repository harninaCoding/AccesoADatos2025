package withObjetcs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MethodWithReturnAndParams03Test {

	@Test
	void testIsOdd() {
		MethodWithReturnAndParams03 methodWithReturnAndParams03=new MethodWithReturnAndParams03();
		int value=3;
		assertTrue(methodWithReturnAndParams03.isOdd(value));
	}

}

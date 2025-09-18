package withObjetcs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MethodWithReturnTest {
	
	@Test
	void testGiveMe() {
		MethodWithReturn02 methodWithReturn02=new MethodWithReturn02();
		assertTrue(methodWithReturn02.giveMe());
	}

}

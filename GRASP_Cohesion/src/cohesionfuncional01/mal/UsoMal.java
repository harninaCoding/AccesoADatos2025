package cohesionfuncional01.mal;

import org.junit.jupiter.api.Test;

public class UsoMal {
	@Test
	void test() {
		FooBarMal oBarMal = new FooBarMal();
		oBarMal.FirstMethod();
		oBarMal.SecondMethod();
		oBarMal.ThirdMethod();
		oBarMal.oneMethod();
		oBarMal.twoMethod();
	}
}

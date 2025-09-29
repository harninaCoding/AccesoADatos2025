package cohes03dedatos;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RandomGeneratorTest {
	static RandomGenerator random;

	@BeforeAll
	static void before() {
		random=new RandomGenerator();
	}

	@Test
	void testGetNumbers() {
		System.out.println("getNumbers");
		System.out.println(random.getNumbers());
	}

	@Test
	void testGetTotalNumbers() {
		System.out.println("getTotal");
		System.out.println(random.getTotalNumbers());
	}

	@Test
	void testGetAVerageNumbers() {
		System.out.println("getAver");
		System.out.println(random.getAVerageNumbers());
	}

	@Test
	void testShow() {
		System.out.println("show");
		random.show();
	}

}

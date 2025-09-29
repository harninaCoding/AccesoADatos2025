package cohesionfuncional01.bien;

import org.junit.jupiter.api.Test;

public class UsoMal {
	@Test
	void test() {
		SomeObject someObject = new SomeObject();
		OtherObject otherObject=new OtherObject();
		someObject.FirstCall();
		someObject.SecondCall();
		someObject.ThirdCall();
		otherObject.oneCall();
		otherObject.twoCall();
	}
}

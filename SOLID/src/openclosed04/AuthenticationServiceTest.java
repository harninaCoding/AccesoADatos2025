package openclosed04;

import org.junit.jupiter.api.Test;

class AuthenticationServiceTest {

	@Test
	void test() {
		AuthenticationService authenticationService=new AuthenticationService();
		authenticationService.signing(new AuthemticationGmail());
	}

}

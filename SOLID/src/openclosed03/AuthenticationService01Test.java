package openclosed03;

import org.junit.jupiter.api.Test;

class AuthenticationService01Test {

	@Test
	void test() {
		AuthenticationService01 authenticationService01=new AuthenticationService01();
		authenticationService01.siging(AuthenticationEngine00.facebook);
		
	}

}

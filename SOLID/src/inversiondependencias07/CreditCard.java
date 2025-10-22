package inversiondependencias07;

public class CreditCard implements Payment{

	public void pay(Shopping shopping) {
		// Performs payment using a credit card
		System.out.println("pagadao correctamente");
	}
}

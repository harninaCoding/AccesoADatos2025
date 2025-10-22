package inversiondependencias07;

public class Cash implements Payment {
	public void pay(Shopping shopping) {
		// Performs payment using a credit card
		System.out.println("no hay billetes falsos");
	}
}

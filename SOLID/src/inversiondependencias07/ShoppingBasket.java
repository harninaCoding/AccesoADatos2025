package inversiondependencias07;

public class ShoppingBasket implements Shopping {
	Persistence persistence;
	Payment payment;
	

	public ShoppingBasket(Persistence persistence, Payment payment) {
		super();
		this.persistence = persistence;
		this.payment = payment;
	}


	public void buy() {
		persistence.save(this);
		payment.pay(this);

	}
}

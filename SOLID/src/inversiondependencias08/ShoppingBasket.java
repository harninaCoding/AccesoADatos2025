package inversiondependencias08;

public class ShoppingBasket implements Shopping {
	Persistence persistence;

	public ShoppingBasket(Persistence persistence) {
		super();
		this.persistence = persistence;
	}

	public void buy(Payment payment) {
		persistence.save(this);
		payment.pay(this);

	}
}

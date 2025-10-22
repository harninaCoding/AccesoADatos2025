package inversiondependencias08;

public class Principal {
public static void main(String[] args) {
	ShoppingBasket shoppingBasket=new ShoppingBasket(new SqlDatabase());
	shoppingBasket.buy(new Cash());
	shoppingBasket.buy(new CreditCard());
	shoppingBasket.buy(new Bizum());
}
}

package inversiondependencias07;

public class Principal {
public static void main(String[] args) {
	ShoppingBasket shoppingBasket=new ShoppingBasket(new SqlDatabase(),new Cash());
	shoppingBasket.buy();
	ShoppingBasket shoppingBasket1=new ShoppingBasket(new FileManager(),new CreditCard());
	shoppingBasket1.buy();
}
}

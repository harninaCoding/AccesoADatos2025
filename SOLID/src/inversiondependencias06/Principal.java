package inversiondependencias06;

public class Principal {
public static void main(String[] args) {
	ShoppingBasket shoppingBasket=new ShoppingBasket();
	Tipo cash = Tipo.cash;
	shoppingBasket.buy(cash);
}
}

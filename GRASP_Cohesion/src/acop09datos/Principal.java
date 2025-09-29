package acop09datos;

public class Principal {
public static void main(String[] args) {
	Cliente cliente=new Cliente("1","Dimitri");
	//a pesar de que en el pedido se haga referencia expresa 
	//al id de cliente lo que se declara es un tipo coincidente
	Pedido pedido=new Pedido(cliente.id,"hoy");
	
}
}

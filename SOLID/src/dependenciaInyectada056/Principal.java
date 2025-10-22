package dependenciaInyectada056;

public class Principal {
	//Softare cliente (aunque ponga main)
public static void main(String[] args) {
	//inyeccion
	//Aqui B se va a comportar como diga Auno
	Dependiente b=new Dependiente(new Necesitada());
	//Aqui podemos cambiar su comportamiento
	
}
}

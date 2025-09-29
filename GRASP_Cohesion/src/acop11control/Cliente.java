package acop11control;

public class Cliente {
public Solucion dameSolucion() {
	if(checkFallo()) {
		return new Exigidor().creaSolucion(Tipo.solucionA);
	}
	return new Exigidor().creaSolucion(Tipo.solucionB);
}

private boolean checkFallo() {
	// TODO Auto-generated method stub
	return false;
}
}

package acop11control;

public  class Permitidor {
	public Solucion creaSolucion (Tipo tipo){
		if(tipo==Tipo.solucionA)
			return new SolucionA();
		if(tipo==Tipo.solucionB)
			return new SolucionB();
		return null;
	}
}

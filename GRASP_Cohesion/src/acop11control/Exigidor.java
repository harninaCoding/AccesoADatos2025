package acop11control;

public class Exigidor {
	public Solucion creaSolucion (Tipo tipo){
		if(tipo==Tipo.solucionA)
			return new SolucionA();
		if(tipo==Tipo.solucionB)
			return new SolucionB();
		return null;
	}
	public Solucion conseguirSolucion() {
		Solucion solucion=creaSolucion(Tipo.solucionA);
		solucion=creaSolucion(Tipo.solucionB);
		if(solucion instanceof SolucionA){
			System.out.println(((SolucionA)solucion).solA);
		}
		return solucion;
	}
	
	public Solucion conseguirSolucionB() {
		Solucion solucion=new SolucionA();
		solucion=new SolucionB();
		if(solucion instanceof SolucionA){
			System.out.println(((SolucionA)solucion).solA);
		}
		return solucion;
	}
public static void main(String[] args) {
	Solucion conseguidor = new Exigidor().conseguirSolucion();
}
}

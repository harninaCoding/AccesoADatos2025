package dependenciaInyectada056;

public class Dependiente {
	//DEpendencia inyectada
	Necesitada necesitada;

	public Dependiente(Necesitada necesitada) {
		super();
		this.necesitada=necesitada;
	}

	public void setA(Necesitada a) {
		this.necesitada = a;
	}
	
}

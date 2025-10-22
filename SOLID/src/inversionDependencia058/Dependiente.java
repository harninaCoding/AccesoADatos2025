package inversionDependencia058;


public class Dependiente {
	//DEpendencia inyectada
	INecesitada necesitada;

	public Dependiente(INecesitada necesitada) {
		super();
		this.necesitada=necesitada;
	}

	public void setA(INecesitada a) {
		this.necesitada = a;
	}
	
}

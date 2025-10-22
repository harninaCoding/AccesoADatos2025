package inversionDependencia058;

public class Principal {
	// Softare cliente (aunque ponga main)
	public static void main(String[] args) {
		// Inversion de depedencias
		INecesitada necesitada = new Necesitada();
		Dependiente b = new Dependiente(necesitada);
		Dependiente b1 = new Dependiente(new OtraNecesitada());

	}
}

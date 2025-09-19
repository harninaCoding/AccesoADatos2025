package ejemplos;

public class Pelicula {

	private String nombre;
	private String fecha;
	private String productora;
	private String actrizPrincipal;
	private String actorPrincipal;
	
	public Pelicula(String nombre, String fecha, String productora, String actrizPrincipal, String actorPrincipal) throws Exception {
		super();
		if(actrizPrincipal!=null&&actorPrincipal!=null) throw new Exception("no pueden ser ambos");
		this.nombre = nombre;
		this.fecha = fecha;
		this.productora = productora;
		this.actrizPrincipal = actrizPrincipal;
		this.actorPrincipal = actorPrincipal;
	}
	
}

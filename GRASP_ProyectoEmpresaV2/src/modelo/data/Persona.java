package modelo.data;

public class Persona{
	// propiedades
		private String dNICliente;
		private String nombre;
		// Getters and Setters
		public String getdNICliente() {
			return dNICliente;
		}

		public Persona(String dNICliente, String nombre) {
			super();
			this.dNICliente = dNICliente;
			this.nombre = nombre;
		}

		public void setdNICliente(String dNICliente) {
			//asserts
			this.dNICliente = dNICliente;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			//asserts
			this.nombre = nombre;
		}

}

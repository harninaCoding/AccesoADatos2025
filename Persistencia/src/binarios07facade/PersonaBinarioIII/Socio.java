package binarios07facade.PersonaBinarioIII;

import java.util.Objects;

public class Socio {
	private String id;
	private double saldo;
	private int annoInscripcion;

	public Socio(String id, double saldo, int annoInscripcion) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.annoInscripcion = annoInscripcion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAnnoInscripcion() {
		return annoInscripcion;
	}

	public void setAnnoInscripcion(int annoInscripcion) {
		this.annoInscripcion = annoInscripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(annoInscripcion, id, saldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return annoInscripcion == other.annoInscripcion && Objects.equals(id, other.id)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}

}

package modelo.data;

import java.util.Objects;

public class Articulo {
	private Integer id;
	private String nombre;
	private float precio;
	
	
	public Articulo(Integer id, String nombre, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	private Integer getId() {
		return id;
	}
	private void setId(Integer id) {
		this.id = id;
	}
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(precio) == Float.floatToIntBits(other.precio);
	}

	float getPrecio() {
		return precio;
	}
	private void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	
}

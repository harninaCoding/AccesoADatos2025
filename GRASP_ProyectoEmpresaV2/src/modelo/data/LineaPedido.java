package modelo.data;

import java.util.Objects;

public class LineaPedido {

	private Articulo articulo;
	private int cantidad;

	public LineaPedido(Articulo articulo, int cantidad) {
		super();
		this.articulo = articulo;
		this.cantidad = cantidad;
	}


	private int getCantidad() {
		return cantidad;
	}
	float getTotalParcial() {
		return articulo.getPrecio()*getCantidad();
	}

	@Override
	public int hashCode() {
		return Objects.hash(articulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaPedido other = (LineaPedido) obj;
		return Objects.equals(articulo, other.articulo);
	}

	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}

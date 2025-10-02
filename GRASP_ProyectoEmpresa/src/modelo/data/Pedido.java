package modelo.data;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pedido {

	private int numeroDeSerie;
	private LocalDate fecha;
	private Cliente cliente;
	private Set<LineaPedido> lineas;
	// solo en la solucion lambda
	private float cuantia = 0;

	public Pedido(int numeroDeSerie, LocalDate fecha, Cliente cliente) {
		super();
		this.numeroDeSerie = numeroDeSerie;
		this.fecha = fecha;
		this.cliente = cliente;
		lineas = new HashSet<LineaPedido>();
		//periodo entre dos fechas
		
	}

	public boolean addArticulo(Articulo articulo, Integer cantidad) {
		return lineas.add(new LineaPedido(articulo, cantidad));
	}

	public float getCuantiaTotal() {
		float cuantia = 0;
		Iterator<LineaPedido> iterator = lineas.iterator();
		while (iterator.hasNext()) {
			LineaPedido next = iterator.next();
			cuantia += next.getTotalParcial();
		}
		return cuantia;

	}

	public float getCuantiaTotalLambda() {
		this.cuantia = 0;
		lineas.forEach((linea) -> {
			cuantia += linea.getTotalParcial();
		});
		return cuantia;
	}
	
	private int getNumeroDeSerie() {
		return numeroDeSerie;
	}

	private void setNumeroDeSerie(int numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	private LocalDate getFecha() {
		return fecha;
	}

	private void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	private Cliente getCliente() {
		return cliente;
	}

	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}

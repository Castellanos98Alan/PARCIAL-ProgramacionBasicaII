package ar.edu.unlam.dominio;

public class Pedido {

	private static Integer contadorId = 0;
	private Integer id;
	private Producto platoPrincipal;
	private Producto bebida;
	private Producto postre;
	private Double montoTotal;

	public Pedido(Producto platoPrincipal, Producto bebida, Producto postre, Double montoTotal) {
		this.id = ++contadorId;
		this.platoPrincipal = platoPrincipal;
		this.bebida = bebida;
		this.postre = postre;
		this.montoTotal = montoTotal;
	}

	@Override
	public String toString() {
		return "Pedido" + id + "[platoPrincipal=" + platoPrincipal + ", bebida=" + bebida + ", postre=" + postre + "]";
	}

	public Integer getIdPedido() {
		return id;
	}

}

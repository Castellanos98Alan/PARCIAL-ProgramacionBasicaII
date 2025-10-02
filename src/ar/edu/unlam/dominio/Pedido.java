package ar.edu.unlam.dominio;

public class Pedido {

	private Producto platoPrincipal;
	private Producto bebida;
	private Producto postre;
	private Double precioFinal;

	public Pedido(Producto platoPrincipal, Producto bebida, Producto postre, Double precioFinal) {
		this.platoPrincipal = platoPrincipal;
		this.bebida = bebida;
		this.postre = postre;
		this.precioFinal = precioFinal;
	}

	@Override
	public String toString() {
		return "Pedido [platoPrincipal=" + platoPrincipal + ", bebida=" + bebida + ", postre=" + postre + "]";
	}

	
	
}

package ar.edu.unlam.dominio;

public class Bebida extends Producto {

	private String tamanio;

	public Bebida(String nombre, Double precio, String tamanio) {
		super(nombre, precio);
		this.tamanio = tamanio;
	}
	
	
	public String getTamanio() {
		return tamanio;
	}


	@Override
	public Double calcularPrecioFinal() { //G = 10% descuento
		Double precioFinal = super.getPrecio();
		if(this.tamanio.equalsIgnoreCase("grande")) {
			Double descuento = (precioFinal * 0.10);
			precioFinal = precioFinal - descuento;
		}
		return precioFinal;
	}
}

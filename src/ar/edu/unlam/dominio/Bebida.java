package ar.edu.unlam.dominio;

public class Bebida extends Producto {

	private String tamanio;

	public Bebida(String nombre, Double precio, String tamanio) {
		super(nombre, precio);
		this.tamanio = tamanio;
	}

}

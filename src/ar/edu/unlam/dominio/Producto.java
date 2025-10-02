package ar.edu.unlam.dominio;

public abstract class Producto {

	private String nombre;
	private Double precio;
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

}

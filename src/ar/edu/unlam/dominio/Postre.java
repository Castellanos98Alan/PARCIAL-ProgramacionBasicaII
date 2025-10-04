package ar.edu.unlam.dominio;

public class Postre extends Producto {

	private String adicional;
	
	public Postre(String nombre, Double precio, String adicional) {
		super(nombre, precio);
		this.adicional = adicional;
	}
	
	public String getAdicional() {
		return adicional;
	}

	@Override
	public Double calcularPrecioFinal() {
		Double precioFinal = super.getPrecio();
		if(this.adicional.equalsIgnoreCase("cafe")){ // adicional de $20
			precioFinal = super.getPrecio() + 20.0;
		}else if(this.adicional.equalsIgnoreCase("helado")) { // adicional de $40
			precioFinal = super.getPrecio() + 40.0;
		}
		return precioFinal;
	}
	
	

}

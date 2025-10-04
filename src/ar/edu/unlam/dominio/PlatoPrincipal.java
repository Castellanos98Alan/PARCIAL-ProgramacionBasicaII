package ar.edu.unlam.dominio;

public class PlatoPrincipal extends Producto{

	private Double precioBaseCubiertos;

	public PlatoPrincipal(String nombre, Double precio, Double precioBaseCubiertos) {
		super(nombre, precio);
		this.precioBaseCubiertos = precioBaseCubiertos;
		
	}
	
	
	public Double getPrecioBaseCubiertos() {
		return precioBaseCubiertos;
	}


	@Override
	public Double calcularPrecioFinal() {
		return this.precioBaseCubiertos + super.getPrecio();
	}

}

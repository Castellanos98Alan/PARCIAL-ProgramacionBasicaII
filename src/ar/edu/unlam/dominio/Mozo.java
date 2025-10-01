package ar.edu.unlam.dominio;

public class Mozo extends Persona {

	private Mesa mesa;

	public Mozo(String nombre, Integer dni) {
		super(nombre, dni);
	this.mesa = null;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	@Override
	public String toString() {
		return "Mozo [mesa=" + mesa + ", getDni()=" + getDni() ;
	}

	
	

}

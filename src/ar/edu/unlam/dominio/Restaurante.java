package ar.edu.unlam.dominio;

public class Restaurante {

	public Restaurante(Integer cantidadMozosTurnoMañana) {
		// TODO Auto-generated constructor stub
	}

	

	public Restaurante() {
		// TODO Auto-generated constructor stub
	}



	


	public void agregarMozo(Mozo mozo) {
		// TODO Auto-generated method stub
		
	}

	public boolean ingresaMozo(Mozo mozo, Mozo mozoNuevo) {
	    return mozo.getTurno().equals(mozoNuevo.getTurno());
	}
}

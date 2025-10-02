package ar.edu.unlam.dominio;

public class Mozo {
private String nombre;
private Integer dni;
private String turno;
	
	
	
	

	    public Mozo(Integer dni, String nombre, String turno) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.turno = turno;
	    }

	    @Override
	    public String toString() {
	        return "Mozo dni: " + dni + " - Nombre: " + nombre + " - Turno: "+ turno;
	    }
	


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getDni() {
		return dni;
	}



	public void setDni(Integer dni) {
		this.dni = dni;
	}



	public String getTurno() {
		return turno;
	}



	public void setTurno(String turno) {
		this.turno = turno;
	}

	
	
	
	
	
	
}

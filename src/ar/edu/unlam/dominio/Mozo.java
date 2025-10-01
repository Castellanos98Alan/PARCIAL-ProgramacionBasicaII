package ar.edu.unlam.dominio;

public class Mozo {
private String nombre;
private Integer dni;
private String turno;
	
	
	
	public Mozo(String nombre, Integer dni, String turno) {
		this.nombre = nombre;
		this.dni = dni;
		this.turno = turno;
		
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

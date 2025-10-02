package ar.edu.unlam.dominio;

import java.util.HashSet;

public class Mozo extends Persona {

	private HashSet<Mesa> mesa;
	private String turno;

	public Mozo(String nombre, Integer dni, String turno) {
		super(nombre, dni);
	this.mesa = new HashSet<>();
	this.turno = turno;
	}



	public void setMesa(HashSet<Mesa> mesa) {
		this.mesa = mesa;
	}



	@Override
	public String toString() {
		return "Mozo [mesa=" + mesa + ", getDni()=" + getDni() ;
		}



	public String getTurno() {
		return turno;
	}



	public void setTurno(String turno) {
		this.turno = turno;
}
	}
package ar.edu.unlam.dominio;

import java.util.HashSet;

public class Mesa {

	private Integer numeroMesa;
	private HashSet<Mesa> mesas;

	public Mesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
		mesas = new HashSet<>();
	}

	public Integer getNumeroMesa() {
		return numeroMesa;
	}

	public void agregarMesa(Mesa mesa1) {
		this.mesas.add(mesa1);
		
	}
	
	@Override
	public String toString() {
		return "Mesa [numeroMesa=" + numeroMesa + "]";
	}

}

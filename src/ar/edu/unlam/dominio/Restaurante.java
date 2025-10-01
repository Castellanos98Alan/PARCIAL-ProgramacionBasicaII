package ar.edu.unlam.dominio;

import java.util.HashSet;

public class Restaurante {

	private HashSet<Mozo> mozos;
	private HashSet<Mesa> mesas;

	public Restaurante() {
		mozos = new HashSet<Mozo>();
		mesas = new HashSet<>();
	}

	public void agregarMozo(Mozo mozo) {
		this.mozos.add(mozo);

	}

	public void asignarMesaAMozo(Integer dniMozo, Integer numeroMesa) {

		Mozo mozoEncontrado = buscarMozoPorDni(dniMozo);
		Mesa mesaEncontrada = buscarMesaPorId(numeroMesa);
		
		if(mozoEncontrado!=null && mesaEncontrada!=null ) {
			mozoEncontrado.setMesa(mesaEncontrada);
		}
		
		
		
	}

	private Mesa buscarMesaPorId(Integer mesaID) {

		Mesa mesaEncontrada = null;
		for (Mesa mesa : mesas) {
			if (mesa.getNumeroMesa().equals(mesaID)) {
				mesaEncontrada = mesa;
			}
		}
		return mesaEncontrada;
	}

	private Mozo buscarMozoPorDni(Integer mozoDni) {

		Mozo mozoEncontrado = null;
		for (Mozo mozo : mozos) {
			if (mozo.getDni().equals(mozoDni)) {
				mozoEncontrado = mozo;
			}
		}
		return mozoEncontrado;
	}

	public void agregarMesa(Mesa mesa1) {
		this.mesas.add(mesa1);
		
	}
}

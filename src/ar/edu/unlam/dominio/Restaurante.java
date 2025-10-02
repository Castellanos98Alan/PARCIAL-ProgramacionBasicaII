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
	public void agregarMesa(Mesa mesa) {
		this.mesas.add(mesa);

	}

	public void asignarMesaAMozo(Integer dniMozo, Integer numeroMesa) {

		Mozo mozoEncontrado = buscarMozoPorDni(dniMozo);
		Mesa mesaEncontrada = buscarMesaPorId(numeroMesa);
		
		 HashSet<Mesa> mesasAsignadas = new HashSet<>();
			
		if(mozoEncontrado!=null && mesaEncontrada!=null ) {
			
			mesasAsignadas.add(mesaEncontrada);
			mozoEncontrado.setMesa(mesasAsignadas);
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

	public boolean ingresaMozo(Mozo mozo, Mozo mozoNuevo) {
	    return mozo.getTurno().equals(mozoNuevo.getTurno());
	}
}
	
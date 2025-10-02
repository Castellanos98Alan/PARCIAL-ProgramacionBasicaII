package ar.edu.unlam.dominio;

import java.util.HashSet;

public class Restaurante {

	private HashSet<Mozo> mozos;
	private HashSet<Mesa> mesas;
	private HashSet<Cliente> clientes;
	private HashSet<Pedido> pedidos;

	public Restaurante() {
		mozos = new HashSet<Mozo>();
		mesas = new HashSet<>();
		clientes = new HashSet<>();
		pedidos = new HashSet<>();
	}

	public Boolean agregarMozo(Mozo mozo) {
		return this.mozos.add(mozo);
	}

	public Boolean agregarMesa(Mesa mesa) {
		return this.mesas.add(mesa);
	}

	public Boolean agregarCliente(Cliente cliente) {
		return this.clientes.add(cliente);
	}

	public Boolean agregarPedido(Pedido pedido) {
		return this.pedidos.add(pedido);
	}
	public Boolean asignarMesaAMozo(Integer dniMozo, Integer numeroMesa) {

		Boolean fueAsignada = false;

		Mozo mozoEncontrado = buscarMozoPorDni(dniMozo);
		Mesa mesaEncontrada = buscarMesaPorId(numeroMesa);

		if (mozoEncontrado != null && mesaEncontrada != null) {
			mozoEncontrado.agregarMesa(mesaEncontrada);
			fueAsignada = true;
		}

		return fueAsignada;
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

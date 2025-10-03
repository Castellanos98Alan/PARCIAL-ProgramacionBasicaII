package ar.edu.unlam.dominio;

import java.util.HashSet;

public class Mesa {

	private Integer numeroMesa;
	private HashSet<Mesa> mesas;
	private HashSet<Pedido> pedidos;

	public Mesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
		mesas = new HashSet<>();
		pedidos = new HashSet<>();
	}

	public Integer getNumeroMesa() {
		return numeroMesa;
	}

	public void agregarMesa(Mesa mesa1) {
		this.mesas.add(mesa1);
	}

	public HashSet<Mesa> getMesas() {
		return mesas;
	}

	@Override
	public String toString() {
		return "Mesa [numeroMesa=" + numeroMesa + "]";
	}

	public void asignarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

}

package ar.edu.unlam.dominio;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RestauranteTest {

	Restaurante restaurante;
	Persona mozo1;
	Persona mozo2;
	Mesa mesa1;
	Mesa mesa2;
	Persona cliente1;

	@Before
	public void inicializacion() {
		restaurante = new Restaurante();
		mozo1 = new Mozo("Juan", 40589410, "mañana");
		mozo2 = new Mozo("Flor", 39989315, "tarde");
		mesa1 = new Mesa(1);
		mesa2 = new Mesa(2);
		cliente1 = new Cliente("Alexis", 36908347);
	}

	@Test
	public void dadoQueExisteUnRestauranteSeDebenAgregarAlMozoConSuNombreDniYTurnoMañanaOTarde() {
		assertTrue(restaurante.agregarMozo((Mozo) mozo1));
		assertTrue(restaurante.agregarMozo((Mozo) mozo2));
	}

	@Test
	public void dadoQueExisteUnRestauranteSeDebenAgregarSusMesas() {
		assertTrue(restaurante.agregarMesa(mesa1));
		assertTrue(restaurante.agregarMesa(mesa2));
	}

	@Test
	public void dadoQueExisteUnRestauranteSeDebenAgregarLasMesasYMozoAlRestauranteParaAsignarleLaMesaAlMozo() {

		assertTrue(restaurante.agregarMozo((Mozo) mozo1));
		assertTrue(restaurante.agregarMesa(mesa1));
		assertTrue(restaurante.agregarMesa(mesa2));

		assertTrue(restaurante.asignarMesaAMozo(mozo1.getDni(), mesa1.getNumeroMesa()));
		assertTrue(restaurante.asignarMesaAMozo(mozo1.getDni(), mesa2.getNumeroMesa()));
	}

	@Test
	public void dadoQueExisteUnaMesaAsignadaAlMozoNoSePuedaAsignarMesaInexistente() {
		restaurante.agregarMozo((Mozo) mozo1);
		restaurante.agregarMesa(mesa2);// mesa numero 2

		assertFalse(restaurante.asignarMesaAMozo(mozo1.getDni(), 99)); // no existe mesa 99

	}

	@Test
	public void dadoQueExisteUnRestauranteSeDebeAgregarAlCliente() {
		assertTrue(restaurante.agregarCliente((Cliente) cliente1));
	}

	@Test
	public void dadoQueElRestauranteTieneUnClienteEsteUltimoRealizaSuPedido() {
		assertTrue(restaurante.agregarCliente((Cliente) cliente1));

		// Integer id = 1;
		String nombrePlato = "Fideos";
		Double precioPlato = 500.0;
		Double precioBaseCubiertos = 100.0;
		Producto platoPrincipal = new PlatoPrincipal(nombrePlato, precioPlato, precioBaseCubiertos);

		String nombrePostre = "Tiramisu";
		Double precioPostre = 100.0;
		Producto postre = new Postre(nombrePostre, precioPostre);

		String nombreBebida = "Coca";
		Double precioBebida = 50.0;
		String tamanio = "mediana";// puede ser pequeño o mediano
		Producto bebida = new Bebida(nombreBebida, precioBebida, tamanio);

		Double precioFinal = precioPlato + precioPostre + precioBebida;

		Pedido pedido = new Pedido(platoPrincipal, bebida, postre, precioFinal);
		assertTrue(restaurante.agregarPedido(((Cliente) cliente1).realizarPedido(pedido)));

	}

	@Test
	public void dadoQueElRestauranteTieneUnClienteEsteUltimoRealizaSuPedidoYSeCalculaElPrecioTotal() {
		assertTrue(restaurante.agregarCliente((Cliente) cliente1));

		// Integer id = 1;
		String nombrePlato = "Fideos";
		Double precioPlato = 500.0;
		Double precioBaseCubiertos = 100.0;
		Producto platoPrincipal = new PlatoPrincipal(nombrePlato, precioPlato, precioBaseCubiertos);

		String nombrePostre = "Tiramisu";
		Double precioPostre = 100.0;
		Producto postre = new Postre(nombrePostre, precioPostre);

		String nombreBebida = "Coca";
		Double precioBebida = 50.0;
		String tamanio = "mediana";// puede ser pequeño o mediano
		Producto bebida = new Bebida(nombreBebida, precioBebida, tamanio);

		Double precioFinal = 0.0;
		// Double precioFinal = bebida.calcularPrecio() + postre.calcularPrecio() +
		// platoPrincipal.calcularPrecio();

		Pedido pedido = new Pedido(platoPrincipal, bebida, postre, precioFinal);
		assertTrue(restaurante.agregarPedido(((Cliente) cliente1).realizarPedido(pedido)));
	}

	@Test
	public void dadoQueElRestauranteTieneUnClienteEsteUltimoRealizaSuPedidoYSeAsignaAUnMozo() {
		assertTrue(restaurante.agregarCliente((Cliente) cliente1));

		assertTrue(restaurante.agregarMozo((Mozo) mozo1));

		assertTrue(restaurante.agregarMesa(mesa1));

		// asignar mesa a mozo
		assertTrue(restaurante.asignarMesaAMozo(mozo1.getDni(), mesa1.getNumeroMesa()));

		// pedido
		String nombrePlato = "Fideos";
		Double precioPlato = 500.0;
		Double precioBaseCubiertos = 100.0;
		Producto platoPrincipal = new PlatoPrincipal(nombrePlato, precioPlato, precioBaseCubiertos);

		String nombrePostre = "Tiramisu";
		Double precioPostre = 100.0;
		Producto postre = new Postre(nombrePostre, precioPostre);

		String nombreBebida = "Coca";
		Double precioBebida = 50.0;
		String tamanio = "mediana";
		Producto bebida = new Bebida(nombreBebida, precioBebida, tamanio);

		Double precioFinal = 0.0;

		Pedido pedido1 = new Pedido(platoPrincipal, bebida, postre, precioFinal);
		assertTrue(restaurante.agregarPedido(((Cliente) cliente1).realizarPedido(pedido1)));

		// asignar pedido a mesa
		assertTrue(restaurante.asignarPedidoAMesa(pedido1.getIdPedido(), mesa1.getNumeroMesa()));
	}
}

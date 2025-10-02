package ar.edu.unlam.dominio;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;



public class RestauranteTest {

	Restaurante restaurante;
	@Before
	public void inicializacion() {
		restaurante = new Restaurante();
	}
	
	

	@Test
	public void dadoQueExisteUnRestauranteSeDebenAgregarLasMesasYMozoAlRestauranteParaAsignarleLaMesaAlMozo() {
		String nombre = "";
		Integer DNI = 40589410;
		
		Integer numeroMesa1 = 1;
		Mesa mesa1 = new Mesa(numeroMesa1);
		Integer numeroMesa2 = 2;
		Mesa mesa2 = new Mesa(numeroMesa2);
		
		Persona mozo = new Mozo(nombre,DNI,"mañana");
		
		restaurante.agregarMozo((Mozo)mozo);
		restaurante.agregarMesa(mesa1);
		
		restaurante.asignarMesaAMozo(DNI,numeroMesa1);
		restaurante.asignarMesaAMozo(DNI,numeroMesa2);
		
		
		System.out.println(mozo);
	}

	@Test
	public void queSeCompruebeQueElRestauranteTengaUnCliente() {
		
		String nombre = "";
		Integer DNI = 40589410;
		
		Persona cliente = new Cliente(nombre,DNI);
		
		//restaurante.agregarCliente(cliente);
	}
	
	 @Test
	    public void dadoQueExisteUnTurnoElMozoTurnoTardeNoDebeIngresarTurnoMediodia() {
	    	Mozo mozo = new Mozo("Alexis", 4205584, "Mañana");
	    	Mozo mozoNuevo = new Mozo("Alexis", 4205584, "Tarde");

	    	Boolean ingresaMozoTurnoTarde = restaurante.ingresaMozo(mozo, mozoNuevo);

	    	assertFalse(ingresaMozoTurnoTarde);
	    }
	




}


package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import HappyVerde.Casamiento;
import HappyVerde.Cumple;
import HappyVerde.GestionDeEventos;
import HappyVerde.Usuario;

public class TestDeEventos {

	@Test
	public void queSePuedaCrearUnCumple() {
		
		Usuario javi = new Usuario("javi@si.com",4598741L,"Javier");
		Cumple cumpledejavi = new Cumple("Cumple de Javi",javi);
		GestionDeEventos.agregarEventoALListado(cumpledejavi);
		
		assertTrue(GestionDeEventos.listadoDeEventos.contains(cumpledejavi));
		
	}
	
	@Test
	public void queSePuedeCrearUnCasamiento() {
		
		Usuario male = new Usuario("Male@no.com",5478963L,"Malena");
		Usuario gus = new Usuario("gustavito@gmail.com", 632145L,"Gustavo");
		Casamiento casoriodemaleygustavo = new Casamiento("Casamiento de MAle y Gustavo",gus,male);
		
		GestionDeEventos.agregarEventoALListado(casoriodemaleygustavo);
		assertTrue(GestionDeEventos.listadoDeEventos.contains(casoriodemaleygustavo));
		
	}
	/*
	@Test
	public void queSePuedaInvitarGenteAunCumple() {
		
		Usuario marchi = new Usuario("marcos@si.net",789321L,"Marcos");
		Usuario ariel = new Usuario("arielitox@yahoo.com",963214L,"Ariel");
		Cumple cumpledeariel = new Cumple("Cumple de Ariel",ariel);
		
		cumpledeariel.AgregarUsuarioALista(marchi);
		assertTrue(cumpledeariel.getInvitados().contains(marchi));
		
		
		
	}*/
	
	@Test
	public void queUnInvitadoPuedaConfirmarSuAsistencia() {
		
	}

}

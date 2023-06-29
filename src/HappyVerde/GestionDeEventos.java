package HappyVerde;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestionDeEventos {
	public static ArrayList <Evento> listadoDeEventos = new ArrayList<Evento>();
	
	public static void agregarEventoALListado(Evento evento) {
		listadoDeEventos.add(evento);
	}
	
	public static void verificarInvitado(Evento evento,Usuario user) throws Exception{
		try {
			evento.confirmados.contains(user);
		}catch(Exception e) {
			throw e;
		}
		
		}
	

}

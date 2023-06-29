package HappyVerde;

import java.util.TreeSet;

public abstract class Evento {
	protected String nombre;
	public TreeSet<Usuario> invitados;
	protected TreeSet<Usuario> confirmados;

	public Evento(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public TreeSet<Usuario> getInvitados() {
		return invitados;
	}

	public void setInvitados(TreeSet<Usuario> invitados) {
		this.invitados = invitados;
	}

	public void AgregarUsuarioALista(Usuario invitado) {
		invitados.add(invitado);
	}
	
	public void agregarConfirmados() {
		
	}

	

}

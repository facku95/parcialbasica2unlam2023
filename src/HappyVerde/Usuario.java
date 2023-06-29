package HappyVerde;

public class Usuario {
	
	protected String eMail;
	protected Long dni;
	protected String nombre;
	protected Boolean organizador;
	protected Boolean invitado;
	
	public Usuario(String eMail, Long dni, String nombre) {
		this.eMail = eMail;
		this.dni = dni;
		this.nombre = nombre;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Boolean organizador) {
		this.organizador = organizador;
	}

	public Boolean getInvitado() {
		return invitado;
	}

	public void setInvitado(Boolean invitado) {
		this.invitado = invitado;
	}
	
	
	
	
	
	
	
	
	

}

package HappyVerde;

public class Casamiento extends Evento{
	private Usuario novio;
	private Usuario novia;
	
	public Casamiento(String nombre,Usuario novio,Usuario novia) {
		super(nombre);
		this.novio=novio;
		this.novia=novia;
		
	}

	public Usuario getNovio() {
		return novio;
	}

	public void setNovio(Usuario novio) {
		this.novio = novio;
	}

	public Usuario getNovia() {
		return novia;
	}

	public void setNovia(Usuario novia) {
		this.novia = novia;
	}
	
	

}

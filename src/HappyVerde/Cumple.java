package HappyVerde;

public class Cumple extends Evento{
	private Usuario cumplea�ero;

	public Cumple(String nombre, Usuario prota) {
		super(nombre);
		this.cumplea�ero=prota;
		
	}

	public Usuario getCumplea�ero() {
		return cumplea�ero;
	}

	public void setCumplea�ero(Usuario cumplea�ero) {
		this.cumplea�ero = cumplea�ero;
	}

	
	
	

}

package HappyVerde;

public class Cumple extends Evento{
	private Usuario cumpleañero;

	public Cumple(String nombre, Usuario prota) {
		super(nombre);
		this.cumpleañero=prota;
		
	}

	public Usuario getCumpleañero() {
		return cumpleañero;
	}

	public void setCumpleañero(Usuario cumpleañero) {
		this.cumpleañero = cumpleañero;
	}

	
	
	

}

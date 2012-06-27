package Modelo;

public class ElementoCobrableView {
	private int nroElementoCobrable;
	private String nombre;
	private float valor;
	
	public ElementoCobrableView(int nroEC, String nombre, float valor) {
		super();
		this.nroElementoCobrable = nroEC;
		this.nombre = nombre;
		this.valor = valor;
	}

	public int getNroElementoCobrable() {
		return nroElementoCobrable;
	}

	public void setNroElementoCobrable(int nroElementoCobrable) {
		this.nroElementoCobrable = nroElementoCobrable;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	//Necesario para los combos
	public String toString(){
		return getNombre();
	}
}

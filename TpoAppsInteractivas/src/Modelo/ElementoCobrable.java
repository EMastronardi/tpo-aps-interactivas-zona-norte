package Modelo;


public class ElementoCobrable {
	private String nombre;
	private float valor;

	public ElementoCobrable(String nombre, float valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
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
	public ElementoCobrableView generarElementoCobrableView(){
		return new ElementoCobrableView(nombre, valor);
		
	}

}

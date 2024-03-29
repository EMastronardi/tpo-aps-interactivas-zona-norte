package Modelo;

import java.util.ArrayList;

import Persistencia.AdmPersistenciaElementoCobrable;

public class ElementoCobrable {
	private Integer nroElementoCobrable;
	private String nombre;
	private float valor;

	public ElementoCobrable(int nroEC, String nombre, float valor) {
		super();
		this.nroElementoCobrable = nroEC;
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public Integer getNroElementoCobrable() {
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
	public ElementoCobrableView generarElementoCobrableView(){
		return new ElementoCobrableView(nroElementoCobrable ,nombre, valor);
		
	}
	public void updateElementoCobrable(){
		AdmPersistenciaElementoCobrable.getInstancia().update(this);
	}
	public static ArrayList<ElementoCobrable> getAllElementosCobrables(){
		return AdmPersistenciaElementoCobrable.getInstancia().selectAll();
	}
}

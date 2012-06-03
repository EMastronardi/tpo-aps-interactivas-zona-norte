package Modelo;
import java.util.*;


public class ItemFactura {
	private String nombre;
	private float Valor;
	
	public ItemFactura(String nombre,float valor ) {
		super();
		this.nombre = nombre;
		this.Valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getValor() {
		return Valor;
	}

	public void setValor(float valor) {
		Valor = valor;
	}
	
}

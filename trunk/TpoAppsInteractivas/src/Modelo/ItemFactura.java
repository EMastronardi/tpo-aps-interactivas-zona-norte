package Modelo;
import java.util.*;

import Persistencia.AdmPersistenciaFactura;
import Persistencia.AdmPersistenciaItemFactura;


public class ItemFactura {
	private String nombre;
	private float Valor;
	private static int ultNroItemFactura = -1;
	
	public static void leerUltNroFactura(){
		if(ultNroItemFactura == -1)
			ultNroItemFactura = AdmPersistenciaItemFactura.getInstancia().getUltNumItemFactura();
	}
	public static int getProxNroFactura(){
		ultNroItemFactura +=1;
		return ultNroItemFactura;
	}
	
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

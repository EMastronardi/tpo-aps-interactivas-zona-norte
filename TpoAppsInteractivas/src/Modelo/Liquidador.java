package Modelo;
import java.util.*;

import Modelo.ElementoCobrable;
import Modelo.ItemFactura;

public abstract class Liquidador {
	protected boolean estado;
	protected ArrayList<ElementoCobrable> cobrales;
	
	public Liquidador(boolean estado, ArrayList<ElementoCobrable> cobrales) {
		this.estado = estado;
		this.cobrales = cobrales;
	}
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public ArrayList<ElementoCobrable> getCobrales() {
		return cobrales;
	}
	public void setCobrales(ArrayList<ElementoCobrable> cobrales) {
		this.cobrales = cobrales;
	}
	protected ElementoCobrable getElementoCobrablePorNombre(String nombre){
		for (ElementoCobrable elem : cobrales) {
			if(elem.getNombre()== nombre){
				return elem;
			}
		}
		
		return null;
	}
	
	abstract ArrayList<ItemFactura> liquidar(String tipoCliente, float consumo);
	abstract float calcularConsumo(float consumoCliente);
}

package Modelo;
import java.util.*;

import Modelo.ElementoCobrable;
import Modelo.ItemFactura;

public abstract class Liquidador {
	protected boolean estado;
	protected ArrayList<ElementoCobrable> Cobrales;
	
	public Liquidador(boolean estado, ArrayList<ElementoCobrable> cobrales) {
		this.estado = estado;
		Cobrales = cobrales;
	}
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public ArrayList<ElementoCobrable> getCobrales() {
		return Cobrales;
	}
	public void setCobrales(ArrayList<ElementoCobrable> cobrales) {
		Cobrales = cobrales;
	}
	public float getValorMetroCubico() {
		return valorMetroCubico;
	}
	public void setValorMetroCubico(float valorMetroCubico) {
		this.valorMetroCubico = valorMetroCubico;
	}
	abstract ArrayList<ItemFactura> liquidar();
	abstract float calcularConsumo();
}

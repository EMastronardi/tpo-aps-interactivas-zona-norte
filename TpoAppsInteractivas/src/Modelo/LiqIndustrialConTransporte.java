package Modelo;

import java.util.ArrayList;
import Modelo.ItemFactura;

public final class LiqIndustrialConTransporte extends LiquidadorIndustrial {

	public LiqIndustrialConTransporte(boolean estado, ArrayList<ElementoCobrable> cobrales, float valorMetroCubico) {
		super(estado, cobrales, valorMetroCubico);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<ItemFactura> liquidar() {
		return null;
	}

	public float calcularConsumo() {
		return 0;
	}
}

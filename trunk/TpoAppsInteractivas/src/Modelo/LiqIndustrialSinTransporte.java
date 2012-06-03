package Modelo;

import java.util.ArrayList;


public final class LiqIndustrialSinTransporte extends LiquidadorIndustrial{
	
	public LiqIndustrialSinTransporte(boolean estado, ArrayList<ElementoCobrable> cobrales, float valorMetroCubico) {
		super(estado, cobrales, valorMetroCubico);
	}

	public ArrayList<ItemFactura> liquidar() {
		return null;
	}

	public float calcularConsumo() {
		return 0;
	}
}

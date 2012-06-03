package Modelo;

import java.util.ArrayList;
import Modelo.ItemFactura;

public final class LiqIndustrialConTransporte extends LiquidadorIndustrial {

	public LiqIndustrialConTransporte(boolean estado, ArrayList<ElementoCobrable> cobrales) {
		super(estado, cobrales);

	}
	
	public ArrayList<ItemFactura> liquidar() {
		return null;
	}

	public float calcularConsumo() {
		return 0;
	}
}

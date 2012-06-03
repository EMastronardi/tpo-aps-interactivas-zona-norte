package Modelo;

import java.util.ArrayList;

public abstract class LiquidadorIndustrial extends Liquidador{

	public LiquidadorIndustrial(boolean estado,
			ArrayList<ElementoCobrable> cobrales, float valorMetroCubico) {
		super(estado, cobrales, valorMetroCubico);
	}
	
	abstract ArrayList<ItemFactura> liquidar();
	abstract float calcularConsumo();
}

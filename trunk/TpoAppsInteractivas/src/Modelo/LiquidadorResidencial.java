package Modelo;

import java.util.ArrayList;

public abstract class LiquidadorResidencial extends Liquidador{

	public LiquidadorResidencial(boolean estado,
			ArrayList<ElementoCobrable> cobrales, float valorMetroCubico) {
		super(estado, cobrales, valorMetroCubico);
	}
	
	abstract ArrayList<ItemFactura> liquidar();
	abstract float calcularConsumo();
}

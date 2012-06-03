package Modelo;

import java.util.ArrayList;

public final class LiqResidencialSinSubsidio extends LiquidadorResidencial {

	public LiqResidencialSinSubsidio(boolean estado,
			ArrayList<ElementoCobrable> cobrales, float valorMetroCubico) {
		super(estado, cobrales, valorMetroCubico);
	}

	public ArrayList<ItemFactura> liquidar() {
		return null;
	}

	public float calcularConsumo() {
		return 0;
	}
}

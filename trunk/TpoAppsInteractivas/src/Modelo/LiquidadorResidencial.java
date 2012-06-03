package Modelo;

import java.util.ArrayList;

public abstract class LiquidadorResidencial extends Liquidador{
	private static float costoMetroCubico; 
	public LiquidadorResidencial(boolean estado, ArrayList<ElementoCobrable> cobrales) {
		super(estado, cobrales);
		this.costoMetroCubico = 1; 
	}
	
	public float calcularConsumo(float consumoCliente){		
		return consumoCliente * this.costoMetroCubico;
	}
	
	abstract float calcularConsumo();

	private static float getCostoMetroCubico() {
		return costoMetroCubico;
	}

	private static void setCostoMetroCubico(float costoMetroCubico) {
		LiquidadorResidencial.costoMetroCubico = costoMetroCubico;
	}
}

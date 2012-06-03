package Modelo;

import java.util.ArrayList;

public abstract class LiquidadorIndustrial extends Liquidador{
	private static float costoMetroCubico; 

	public LiquidadorIndustrial(boolean estado, ArrayList<ElementoCobrable> cobrales) {
		super(estado, cobrales);
		this.costoMetroCubico = 1;
	}
	
	abstract ArrayList<ItemFactura> liquidar(String tipoCliente, float consumo);
	public float calcularConsumo(float consumoCliente){		
		return consumoCliente * this.costoMetroCubico;
	}

	private static float getCostoMetroCubico() {
		return costoMetroCubico;
	}

	private static void setCostoMetroCubico(float costoMetroCubico) {
		LiquidadorIndustrial.costoMetroCubico = costoMetroCubico;
	}
}

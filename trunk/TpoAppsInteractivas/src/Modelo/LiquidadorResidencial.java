package Modelo;

import java.util.ArrayList;

public abstract class LiquidadorResidencial extends Liquidador{
	
	private static float costoMetroCubico; 
	
	public LiquidadorResidencial(boolean estado, ArrayList<ElementoCobrable> cobrales) {
		super(estado, cobrales);
		this.costoMetroCubico = 1; 
	}
	
	abstract ArrayList<ItemFactura> liquidar(String tipoCliente, float consumo);
	
	public float calcularConsumo(float consumoCliente){		
		return consumoCliente * this.costoMetroCubico;
	}
	
	public static float getCostoMetroCubico() {
		return costoMetroCubico;
	}

	private static void setCostoMetroCubico(float costoMetroCubico) {
		LiquidadorResidencial.costoMetroCubico = costoMetroCubico;
	}
}

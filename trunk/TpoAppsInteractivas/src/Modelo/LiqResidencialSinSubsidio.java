package Modelo;

import java.util.ArrayList;

public final class LiqResidencialSinSubsidio extends LiquidadorResidencial {

	public LiqResidencialSinSubsidio(boolean estado,ArrayList<ElementoCobrable> cobrales) {
		super(estado, cobrales);
	}

	public ArrayList<ItemFactura> liquidar(String tipoCliente, float consumo) {
		if(this.estado == true && tipoCliente.equals("residencial")){
			
			ArrayList<ItemFactura> items = new ArrayList<>();
			ItemFactura itmConsumo = new ItemFactura("Consumo metros cubicos", this.calcularConsumo(consumo));
			items.add(itmConsumo);
			ItemFactura itmIVA =new ItemFactura("IVA", this.getElementoCobrablePorNombre("IVA Consumidor final").getValor()*itmConsumo.getValor());
			items.add(itmIVA);
			ItemFactura itmCM = new ItemFactura("Contribuciones Municipales", 
					this.getElementoCobrablePorNombre("Contribuciones Municipales").getValor()*itmIVA.getValor());
			items.add(itmCM);
			if(itmConsumo.getValor() + itmIVA.getValor() + itmCM.getValor()> 150){
				return items;
			}
		}
		return null;
	}
}

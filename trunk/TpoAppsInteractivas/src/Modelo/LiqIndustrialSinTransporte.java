package Modelo;

import java.util.ArrayList;


public final class LiqIndustrialSinTransporte extends LiquidadorIndustrial{
	
	public LiqIndustrialSinTransporte(boolean estado, ArrayList<ElementoCobrable> cobrales) {
		super(estado, cobrales);
	}

	public ArrayList<ItemFactura> liquidar(String tipoCliente, float consumo) {
		if(this.estado == true && tipoCliente.equals("industrial") && consumo <= 700){
			ArrayList<ItemFactura> items = new ArrayList<>();
			ItemFactura itmConsumo = new ItemFactura("Consumo metros cubicos", this.calcularConsumo(consumo));
			items.add(itmConsumo);
			ItemFactura itmIVA =new ItemFactura("IVA", this.getElementoCobrablePorNombre("IVA Resp. Inscripto").getValor() * itmConsumo.getValor());
			items.add(itmIVA);
			ItemFactura itmIB = new ItemFactura("Ingresos Brutos",this.getElementoCobrablePorNombre("Ingresos Brutos").getValor() * itmIVA.getValor());
			items.add(itmIB);
			return items;
		}
		return null;
	}
}

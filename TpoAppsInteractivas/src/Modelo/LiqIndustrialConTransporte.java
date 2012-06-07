package Modelo;

import java.util.ArrayList;
import Modelo.ItemFactura;

public final class LiqIndustrialConTransporte extends LiquidadorIndustrial {

	public LiqIndustrialConTransporte(boolean estado, ArrayList<ElementoCobrable> cobrales) {
		super(estado, cobrales);
	}
	
	public ArrayList<ItemFactura> liquidar(String tipoCliente, float consumo) {
		if(this.estado == true && tipoCliente.equals("industrial") && consumo > 700){
			ArrayList<ItemFactura> items = new ArrayList<>();
			ItemFactura itmConsumo = new ItemFactura("Consumo metros cubicos", this.calcularConsumo(consumo));
			items.add(itmConsumo);
			ItemFactura itmIVA =new ItemFactura("IVA", this.getElementoCobrablePorNombre("IVA Resp. Inscripto").getValor() * itmConsumo.getValor());
			items.add(itmIVA);
			ItemFactura itmIB = new ItemFactura("Ingresos Brutos",this.getElementoCobrablePorNombre("Ingresos Brutos").getValor() * itmIVA.getValor());
			items.add(itmIB);
			float subtotal= itmConsumo.getValor() + itmIVA.getValor() + itmIB.getValor();
			ItemFactura itmTrans = new ItemFactura("Transporte", this.getElementoCobrablePorNombre("Transporte").getValor() * subtotal);
			items.add(itmTrans);
			return items;
		}
		return null;
	}
}

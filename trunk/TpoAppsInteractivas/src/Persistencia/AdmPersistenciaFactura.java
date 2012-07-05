package Persistencia;

import java.awt.ItemSelectable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import Modelo.Factura;
import Modelo.ItemFactura;
import Persistencia.AdmPersistenciaItemFactura;

public class AdmPersistenciaFactura {

	private static AdmPersistenciaFactura instancia;
	
	private AdmPersistenciaFactura()
	{
		
	}
	
	public static AdmPersistenciaFactura getInstancia()
	{
		if (instancia == null)
			instancia = new AdmPersistenciaFactura();
		return instancia;
	}
	
	public void insert(Object o) 
	{
		try
		{
			Factura f = (Factura)o;
			Connection con = PoolConnection.getPoolConnection().getConnection();
			PreparedStatement s = con.prepareStatement("insert into Facturas(nroFactura,metrosCubicosConsumidos,fecha,nroCliente) values (?,?,?,?)");
			//agregar campos
			s.setInt(1, f.getNroFactura());
			s.setFloat(2, f.getMetrosCubicosConsumidos());
			s.setDate(3, (Date) f.getFecha());
			s.setInt(4, f.getCliente().getNroCliente());
			
			//Persistir items de factura
			ArrayList<ItemFactura> aux = f.getItems();
			Integer nroItem = 0; 
			for(ItemFactura item : aux){
				AdmPersistenciaItemFactura.getInstancia().insert(nroItem + 1,item, f.getNroFactura());
			}
			
			s.execute();
			PoolConnection.getPoolConnection().realeaseConnection(con);
		}
		catch (Exception e)
		{
			System.out.println();
		}
		

	}
	
}

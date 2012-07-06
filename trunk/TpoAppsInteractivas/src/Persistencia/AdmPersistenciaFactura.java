package Persistencia;

import java.awt.ItemSelectable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public int getUltNumFactura(){
		try {
			Connection con = PoolConnection.getPoolConnection().getConnection();
			int count = 0;
			PreparedStatement c = con.prepareStatement("Select count(*) cant from  Facturas");
			ResultSet rsc = c.executeQuery();
			while(rsc.next()){
				if(rsc.getInt(1) != 0){
					PreparedStatement s = con.prepareStatement("Select top 1 nroFactura from Facturas order by 1 desc");
					ResultSet rs =  s.executeQuery();
					while(rs.next()){
						return rs.getInt(1);
					}
		
				}else{
					return 1;
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return -1;
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
			
			java.sql.Date sqlDate = new java.sql.Date(f.getFecha().getTime()); 
			s.setDate(3, (Date) sqlDate);
			s.setInt(4, f.getCliente().getNroCliente());
			s.execute();
			//Persistir items de factura
			ArrayList<ItemFactura> aux = f.getItems();
			for(ItemFactura item : aux){
				AdmPersistenciaItemFactura.getInstancia().insert(ItemFactura.getProxNroFactura(),item, f.getNroFactura());
			}
			
			
			PoolConnection.getPoolConnection().realeaseConnection(con);
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
		

	}
	
}

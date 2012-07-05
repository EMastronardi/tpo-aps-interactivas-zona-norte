package Persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import Modelo.ItemFactura;

public class AdmPersistenciaItemFactura {

	private static AdmPersistenciaItemFactura instancia;
	
	private AdmPersistenciaItemFactura()
	{
		
	}
	
	public static AdmPersistenciaItemFactura getInstancia()
	{
		if (instancia == null)
			instancia = new AdmPersistenciaItemFactura();
		return instancia;
	}
	
	public void insert(Integer nroItem, Object o, Integer nroFactura) 
	{
		try
		{
			ItemFactura items = (ItemFactura)o;
			Connection con = PoolConnection.getPoolConnection().getConnection();
			PreparedStatement s = con.prepareStatement("insert into ItemsFactura(nroItemFactura,nombre,valor,nroFactura) values (?,?,?,?)");
			//agregar campos
			s.setInt(1, nroItem);
			s.setString(2, items.getNombre());
			s.setFloat(3, items.getValor());
			s.setInt(4, nroFactura);
			s.execute();
			PoolConnection.getPoolConnection().realeaseConnection(con);
		}
		catch (Exception e)
		{
			System.out.println();
		}
		

	}
	
}

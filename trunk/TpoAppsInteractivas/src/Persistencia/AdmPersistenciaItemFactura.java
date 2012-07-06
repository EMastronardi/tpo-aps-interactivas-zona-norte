package Persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			System.err.println(e);
		}
		

	}

	public int getUltNumItemFactura(){
		try {
			Connection con = PoolConnection.getPoolConnection().getConnection();
			int count = 0;
			PreparedStatement c = con.prepareStatement("Select count(*) cant from  ItemsFactura");
			ResultSet rsc = c.executeQuery();
			while(rsc.next()){
				if(rsc.getInt(1) != 0){
					PreparedStatement s = con.prepareStatement("Select top 1 nroItemFactura from ItemsFactura order by 1 desc");
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
	
}

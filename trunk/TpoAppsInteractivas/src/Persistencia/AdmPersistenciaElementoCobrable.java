package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import Modelo.ElementoCobrable;

public class AdmPersistenciaElementoCobrable {

	private static AdmPersistenciaElementoCobrable instancia;
	
	private AdmPersistenciaElementoCobrable()
	{
		
	}
	
	public static AdmPersistenciaElementoCobrable getInstancia()
	{
		if (instancia == null)
			instancia = new AdmPersistenciaElementoCobrable();
		return instancia;
	}
	
	public void update(Object o) 
	{
		try
		{
			ElementoCobrable ec = (ElementoCobrable)o;
			Connection con = PoolConnection.getPoolConnection().getConnection();
			PreparedStatement s = con.prepareStatement("UPDATE ElementosCobrables SET valor ='"+ec.getValor()+"' WHERE nroElementoCobrable = " + ec.getNroElementoCobrable());
			s.executeUpdate();
			PoolConnection.getPoolConnection().realeaseConnection(con);
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
	}
	
	public ArrayList<ElementoCobrable> selectAll()
	{
		try
		{
			ArrayList<ElementoCobrable> ec = new ArrayList<ElementoCobrable>();
			Connection c = PoolConnection.getPoolConnection().getConnection();
			Statement s = c.createStatement();
			ResultSet result = s.executeQuery("Select * from ElementosCobrables");
			while (result.next())
			{
				int nroEC = result.getInt(1);
				String nombre = result.getString(2);
				float valor = result.getFloat(3);
				ElementoCobrable aux = new ElementoCobrable(nroEC, nombre, valor);
				ec.add(aux);
				
			}
			PoolConnection.getPoolConnection().realeaseConnection(c);
			return ec;
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return null;
	}
	
}

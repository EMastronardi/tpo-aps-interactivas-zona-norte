package Persistencia;

import java.awt.ItemSelectable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Industrial;
import Modelo.ItemFactura;
import Modelo.Residencial;


public class AdmPersistenciaCliente {
	private static AdmPersistenciaCliente instancia;
	private AdmPersistenciaCliente()
	{
	}
	
	public static AdmPersistenciaCliente getInstancia()
	{
		if (instancia == null)
			instancia = new AdmPersistenciaCliente();
		return instancia;
	}
	public ArrayList<Cliente> SelectAll(){
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		try {
			Connection con = PoolConnection.getPoolConnection().getConnection();
			
			String SQL = "Select * FROM Clientes as A , Industrial as B WHERE B.nroCliente = A.nroCliente";
			PreparedStatement pstmt = con.prepareStatement(SQL);
		    ResultSet rs = pstmt.executeQuery();
		    while (rs.next()) {
		    	
		    	Industrial industrial = new Industrial ( rs.getString("calle"), rs.getInt("altura"), rs.getInt("piso"), rs.getString("departamento"), 
		    			rs.getString("codigoPostal"), rs.getString("localidad"), rs.getString("provincia"), rs.getString("razonSocial"), rs.getString("cuit"), 
		    			rs.getString("ingresosBrutos"), rs.getString("Categoria"));
		    	clientes.add(industrial);
		    }
		    rs.close();
		    SQL = "Select * FROM Clientes as A , Residencial as B WHERE B.nroCliente = A.nroCliente";
			pstmt = con.prepareStatement(SQL);
		    rs = pstmt.executeQuery();
		    while (rs.next()) {
		    	Residencial residencial = new Residencial ( rs.getString("calle"), 
	    				Integer.parseInt(rs.getString("altura")), 
	    				Integer.parseInt(rs.getString("piso")),
	    				rs.getString("departamento"),
	    				rs.getString("codigoPostal"),
	    				rs.getString("localidad"),
	    				rs.getString("provincia"),
	    				rs.getString("nombre"),
	    				rs.getString("apellido")
	    		);
	    		clientes.add(residencial);
		    }
		    rs.close();
		    pstmt.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return clientes;
		
	}
	
	public boolean altaCliente(Object obj){
		try
		{
			Cliente c = (Cliente)obj;
			Connection con = PoolConnection.getPoolConnection().getConnection();
			String tipo = c.getIsA();
			
			PreparedStatement s = con.prepareStatement("INSERT INTO Clientes values (?,?,?,?,?,?,?,?)");
			s.setInt(1, c.getNroCliente());
			s.setString(2, c.getCalle());
			s.setInt(3, c.getAltura());
			s.setInt(4, c.getPiso());
			s.setString(5, c.getDepartamento());
			s.setString(6, c.getCodigoPostal());
			s.setString(7, c.getLocalidad());
			s.setString(8, c.getProvincia());

			s.executeUpdate();
			if(tipo.equals("industrial")){
				Industrial ind = (Industrial) c;
				s = con.prepareStatement("INSERT INTO Industrial (razonSocial, cuit, ingresosBrutos, Categoria, nroCliente) VALUES(?,?,?,?,?)");
				s.setString(1, ind.getRazonSocial());
				s.setString(2, ind.getCuit());
				s.setString(3, ind.getIngresosBrutos());
				s.setString(4, ind.getCategoria());
				s.setInt(5, ind.getNroCliente());	
				s.execute();
			}else{
				Residencial rs = (Residencial) c;
				s = con.prepareStatement("INSERT INTO Residencial (nombre, apellido, nroCliente) VALUES(?,?,?)");
				s.setString(1, rs.getNombre());
				s.setString(2, rs.getApellido());
				s.setInt(3, rs.getNroCliente());
				s.execute();
			}
			PoolConnection.getPoolConnection().realeaseConnection(con);
			return true;
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
		return false;
	}
	
	public void delete(Object obj) 
	{
		try
		{
			Cliente c = (Cliente)obj;
			Connection con = PoolConnection.getPoolConnection().getConnection();
			String tipo = c.getIsA();
			
			
			if(tipo.equals("industrial")){
				System.out.print("Industrial");
				PreparedStatement s2 = con.prepareStatement("DELETE FROM Industrial WHERE nroCliente = ?");
				s2.setInt(1, c.getNroCliente());
				s2.execute();
				PoolConnection.getPoolConnection().realeaseConnection(con);
			}else{
				System.out.print("Residencial");
				PreparedStatement s3 = con.prepareStatement("DELETE FROM Residencial WHERE nroCliente = ?");
				s3.setInt(1, c.getNroCliente());
				s3.execute();
				PoolConnection.getPoolConnection().realeaseConnection(con);
			}
			
			PreparedStatement med = con.prepareStatement("DELETE FROM Mediciones WHERE nroCliente=?");
			med.setInt(1, c.getNroCliente());
			med.execute();
			PoolConnection.getPoolConnection().realeaseConnection(con);
			
			
			String SQL = "DELETE FROM Clientes WHERE nroCliente = ?";
			PreparedStatement s = con.prepareStatement(SQL);
			s.setLong(1, c.getNroCliente());
			s.execute();
			PoolConnection.getPoolConnection().realeaseConnection(con);
			
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
		

	}
	public boolean modificarCliente(Object obj){
		try
		{
			Cliente c = (Cliente)obj;
			Connection con = PoolConnection.getPoolConnection().getConnection();
			String tipo = c.getIsA();
			
			PreparedStatement s = con.prepareStatement("Update Clientes set " +
					"calle = ?, altura= ?, piso = ?, departamento = ?, codigoPostal = ?, localidad = ?, provincia = ? where nroCliente = ?");
			
			s.setString(1, c.getCalle());
			s.setInt(2, c.getAltura());
			s.setInt(3, c.getPiso());
			s.setString(4, c.getDepartamento());
			s.setString(5, c.getCodigoPostal());
			s.setString(6, c.getLocalidad());
			s.setString(7, c.getProvincia());
			s.setInt(8, c.getNroCliente());
			s.executeUpdate();
			if(tipo.equals("industrial")){
				Industrial ind = (Industrial) c;
				s = con.prepareStatement("Update Industrial set razonSocial = ?, cuit = ?, ingresosBrutos = ?, Categoria = ? Where  nroCliente = ?");
				s.setString(1, ind.getRazonSocial());
				s.setString(2, ind.getCuit());
				s.setString(3, ind.getIngresosBrutos());
				s.setString(4, ind.getCategoria());
				s.setInt(5, ind.getNroCliente());	
				s.execute();
			}else{
				Residencial rs = (Residencial) c;
				s = con.prepareStatement("Update Residencial set nombre = ? , apellido = ? where  nroCliente =?");
				s.setString(1, rs.getNombre());
				s.setString(2, rs.getApellido());
				s.setInt(3, rs.getNroCliente());
				s.execute();
			}
			PoolConnection.getPoolConnection().realeaseConnection(con);
			return true;
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
		return false;
	}

}

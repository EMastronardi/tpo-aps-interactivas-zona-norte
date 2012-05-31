package Controlador;

import java.util.*;

import Modelo.Cliente;
import Modelo.Industrial;
import Modelo.Residencial;


public class Sistema {
	static private Sistema instancia;
	private ArrayList<Cliente> clientes;
	
	private Sistema() {
		clientes = new ArrayList<Cliente>();
	}
	static public Sistema getInstance(){
		if(instancia == null){
			instancia = new Sistema();
		}
		return instancia;
	} 
	
	public boolean altaClienteResidencial(String calle, Integer altura,
		Integer piso, String departamento, String codigoPostal,
		String localidad, String provincia, String nombre, String apellido){
		
		if(this.getCliente(null, calle, altura, piso, departamento, codigoPostal, localidad, provincia)==null){
			Cliente aux = new Residencial(clientes.size(),calle, altura,piso, departamento, codigoPostal, localidad, provincia, nombre, apellido);
			clientes.add(aux);
			return true;
		}
		return false;
	}
	public Cliente getCliente(Integer nroCliente, String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia){
		
		for(int i=0; i<clientes.size(); i++){
			Cliente clieAux = clientes.get(i);
			if(nroCliente != null){
				if(clieAux.getNroCliente().equals(nroCliente)){
					return clieAux;
				}
					
			}else{
				if(clieAux.getCalle().equals(calle) && clieAux.getAltura().equals(altura) 
						&& clieAux.getPiso().equals(piso) && clieAux.getDepartamento().equals(departamento)
						&& clieAux.getCodigoPostal().equals(codigoPostal) && clieAux.getLocalidad().equals(localidad)
						&& clieAux.getProvincia().equals(provincia)){
					return clieAux;
				}
			}			
		}
		return null;
	}
//	public altaClienteindustrial(){
		
//	}
}

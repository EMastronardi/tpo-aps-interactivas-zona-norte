package Controlador;

import java.util.*;

import Modelo.Cliente;
import Modelo.ElementoCobrable;
import Modelo.Industrial;
import Modelo.Residencial;


public class Sistema {
	static private Sistema instancia;
	private ArrayList<Cliente> clientes;
	private Collection<ElementoCobrable> cobrables;
	
	private static int idCliente;
	private Sistema() {
		idCliente = 0;
		clientes = new ArrayList<Cliente>();
	}
	static public Sistema getInstance(){
		if(instancia == null){
			instancia = new Sistema();
		}
		return instancia;
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

	public void RegistrarMedicion(int numeroCliente, Date fecha, float valor){
		Cliente cli = getCliente(numeroCliente, null, null, null, null, null, null, null);
		cli.cargarMedicion(valor, fecha);

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
		
	
	public Boolean bajaClienteResidencial(Integer nroCliente, String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia, String nombre, String apellido){
			
		Cliente cliente = this.getCliente(nroCliente, calle, altura, piso, departamento, codigoPostal, localidad, provincia);
		if(cliente != null){
			clientes.remove(cliente);
			return true;
		}
		return false;
		
	}
	
	public Boolean modificarClienteResidencial(Integer nroCliente, String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia, String nombre, String apellido){
		
		Residencial cliente = (Residencial) this.getCliente(nroCliente, null, null, null, null, null, null, null);
		if(cliente != null){
			cliente.setAltura(altura);
			cliente.setCalle(calle);
			cliente.setCodigoPostal(codigoPostal);
			cliente.setDepartamento(departamento);
			cliente.setLocalidad(localidad);
			cliente.setPiso(piso);
			cliente.setProvincia(provincia);
			cliente.setNombre(nombre);
			cliente.setApellido(apellido);
			
			return true;
		}
		return false;
	}
	
	public Boolean altaClienteIndustrial(Integer nroCliente, String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia, String razonSocial,
			String cuit, String ingresosBrutos, String categoria) {
		
		if(this.getCliente(null, calle, altura, piso, departamento, codigoPostal, localidad, provincia)==null){
			Cliente aux = new Industrial(clientes.size(),calle, altura,piso, departamento, codigoPostal, localidad, provincia, razonSocial, cuit, ingresosBrutos, categoria);
			clientes.add(aux);
			return true;
		}
		return false;
	}
	
	public Boolean bajaClienteIndustrial(Integer nroCliente, String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia, String razonSocial,
			String cuit, String ingresosBrutos, String categoria) {
		
		if(this.getCliente(null, calle, altura, piso, departamento, codigoPostal, localidad, provincia)==null){
			Cliente aux = new Industrial(clientes.size(),calle, altura,piso, departamento, codigoPostal, localidad, provincia, razonSocial, cuit, ingresosBrutos, categoria);
			clientes.add(aux);
			return true;
		}
		return false;
	}

//	public altaClienteindustrial(){
		
//	}
}

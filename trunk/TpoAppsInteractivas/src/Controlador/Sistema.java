package Controlador;

import java.util.*;

import Modelo.Cliente;
import Modelo.ElementoCobrable;
import Modelo.Industrial;
import Modelo.LiqIndustrialConTransporte;
import Modelo.LiqIndustrialSinTransporte;
import Modelo.LiqResidencialConSubsidio;
import Modelo.LiqResidencialSinSubsidio;
import Modelo.Residencial;
import Modelo.Liquidador;

public class Sistema {
	static private Sistema instancia;
	private ArrayList<Cliente> clientes;
	private ArrayList<ElementoCobrable> cobrables;
	private ArrayList<Liquidador> liquidadores;
	
	private Sistema() {
		clientes = new ArrayList<Cliente>();
		this.cargarDatosIniciales();
		
	}
	
	private void cargarDatosIniciales() {
		
		this.generarElementosCobrables();
		this.generarLiquidadores();
		
		
	}

	private void generarElementosCobrables() {
		//elementos cobrables iniciales
		cobrables.add(new ElementoCobrable("IVA Consumidor final", (float) 0.21));
		cobrables.add(new ElementoCobrable("IVA Resp. Inscripto", (float) 0.21));
		cobrables.add(new ElementoCobrable("Contribuciones Municipales", (float) 0.05));
		cobrables.add(new ElementoCobrable("Ingresos Brutos", (float) 0.03));
		cobrables.add(new ElementoCobrable("Transporte", (float) 0.03));
		cobrables.add(new ElementoCobrable("Subsidio", (float) 0.05));
		
		
	}

	static public Sistema getInstance(){
		if(instancia == null){
			instancia = new Sistema();
		}
		return instancia;
	} 
	
	public void generarLiquidadores(){
		//generacion de instancias iniciales de liquidadores
		ArrayList<ElementoCobrable> elementos = new ArrayList<>();
		elementos.add(this.buscarElementoPorNombre("IVA Consumidor final"));
		elementos.add(this.buscarElementoPorNombre("Contribuciones Municipales"));
		LiqResidencialSinSubsidio residencialSinSubSidio = new LiqResidencialSinSubsidio(false, elementos);
		elementos.add(this.buscarElementoPorNombre("Subsidio"));
		LiqResidencialConSubsidio residencialConSubSidio = new LiqResidencialConSubsidio(false, elementos);
		elementos.clear();
		elementos.add(this.buscarElementoPorNombre("IVA Resp. Inscripto"));
		elementos.add(this.buscarElementoPorNombre("Ingresos Brutos"));
		LiqIndustrialSinTransporte industrialSinTransporte = new LiqIndustrialSinTransporte(false, elementos);
		elementos.add(this.buscarElementoPorNombre("Transporte"));
		LiqIndustrialConTransporte industrialConTrasporte = new LiqIndustrialConTransporte(false, elementos);
		
		liquidadores.add(residencialSinSubSidio);
		liquidadores.add(residencialConSubSidio);
		liquidadores.add(industrialConTrasporte);
		liquidadores.add(industrialSinTransporte);
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
	public ElementoCobrable buscarElementoPorNombre(String nombre){
		for (ElementoCobrable elem : cobrables) {
			if(elem.getNombre() == nombre){
				return elem;
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
			Cliente aux = new Residencial(calle, altura,piso, departamento, codigoPostal, localidad, provincia, nombre, apellido);
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
			Cliente aux = new Industrial(calle, altura,piso, departamento, codigoPostal, localidad, provincia, razonSocial, cuit, ingresosBrutos, categoria);
			clientes.add(aux);
			return true;
		}
		return false;
	}
	
	public Boolean bajaClienteIndustrial(Integer nroCliente, String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia, String razonSocial,
			String cuit, String ingresosBrutos, String categoria) {
		
		Cliente cliente = this.getCliente(nroCliente, calle, altura, piso, departamento, codigoPostal, localidad, provincia);
		if(cliente != null){
			clientes.remove(cliente);
			return true;
		}
		return false;
	}
	
	public Boolean modificarClienteIndustrial(Integer nroCliente, String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia, String razonSocial,
			String cuit, String ingresosBrutos, String categoria){
		
		Industrial cliente = (Industrial) this.getCliente(nroCliente, null, null, null, null, null, null, null);
		if(cliente != null){
			cliente.setAltura(altura);
			cliente.setCalle(calle);
			cliente.setCodigoPostal(codigoPostal);
			cliente.setDepartamento(departamento);
			cliente.setLocalidad(localidad);
			cliente.setPiso(piso);
			cliente.setProvincia(provincia);
			cliente.setCategoria(categoria);
			cliente.setCuit(cuit);
			cliente.setRazonSocial(razonSocial);
			cliente.setIngresosBrutos(ingresosBrutos);
			
			return true;
		}
		return false;
	}
//	public altaClienteindustrial(){
		
//	}
}


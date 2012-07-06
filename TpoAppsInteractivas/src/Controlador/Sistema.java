package Controlador;

import java.util.*;

import Modelo.Cliente;
import Modelo.IndustrialView;
import Modelo.ResidencialView;
import Modelo.ElementoCobrable;
import Modelo.ElementoCobrableView;
import Modelo.Factura;
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
	private ArrayList<Factura> facturas;
	
	private Sistema() {
		clientes = new ArrayList<Cliente>();
		clientes= Cliente.getAllClients();
		cobrables = new ArrayList<ElementoCobrable>();
		cobrables = ElementoCobrable.getAllElementosCobrables();
		liquidadores = new ArrayList<Liquidador>();
		facturas = new ArrayList<Factura>();
		facturas = Factura.getAllFacturas();
		this.cargarDatosIniciales();	
	}
	
	private void cargarDatosIniciales() 
	{
		this.generarLiquidadores();	
	}
	
	static public Sistema getInstance(){
		if(instancia == null){
			instancia = new Sistema();
		}
		return instancia;
	} 
	
	private void generarLiquidadores(){
		//generacion de instancias iniciales de liquidadores
		ArrayList<ElementoCobrable> elementos1 = new ArrayList<>();
		ArrayList<ElementoCobrable> elementos2 = new ArrayList<>();
		ArrayList<ElementoCobrable> elementos3 = new ArrayList<>();
		ArrayList<ElementoCobrable> elementos4 = new ArrayList<>();
		
		elementos1.add(this.buscarElementoCobrable(1));
		elementos1.add(this.buscarElementoCobrable(3));
		LiqResidencialSinSubsidio residencialSinSubSidio = new LiqResidencialSinSubsidio(true, elementos1);
		
		elementos2.add(this.buscarElementoCobrable(1));
		elementos2.add(this.buscarElementoCobrable(3));
		elementos2.add(this.buscarElementoCobrable(6));
		LiqResidencialConSubsidio residencialConSubSidio = new LiqResidencialConSubsidio(true, elementos2);
		
		elementos3.add(this.buscarElementoCobrable(2));
		elementos3.add(this.buscarElementoCobrable(4));
		LiqIndustrialSinTransporte industrialSinTransporte = new LiqIndustrialSinTransporte(true, elementos3);
		
		elementos4.add(this.buscarElementoCobrable(2));
		elementos4.add(this.buscarElementoCobrable(4));
		elementos4.add(this.buscarElementoCobrable(5));
		LiqIndustrialConTransporte industrialConTrasporte = new LiqIndustrialConTransporte(true, elementos4);
		
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
	public ElementoCobrable buscarElementoCobrable(int nroEC){
		for (ElementoCobrable elem : cobrables) {
			if(elem.getNroElementoCobrable()==nroEC){
				return elem;
			}
		}
		return null;
	}

	public boolean RegistrarMedicion(int numeroCliente, Date fecha, float valor){
		
		Cliente cli = getCliente(numeroCliente, null, null, null, null, null, null, null);
		if (cli!=null){
			if(cli.cargarMedicion(valor, fecha))
				return true;
			else 
				return false;
		}
		else 
			return false;

	}

	
	public boolean altaClienteResidencial(String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia, String nombre, String apellido){
			
		if(this.getCliente(null, calle, altura, piso, departamento, codigoPostal, localidad, provincia)==null){
			Cliente aux = new Residencial(calle, altura,piso, departamento, codigoPostal, localidad, provincia, nombre, apellido);
			clientes.add(aux);
			Cliente.AltaCliente(aux);
			return true;
		}
		return false;
	}
		
	
	public Boolean bajaClienteResidencial(Integer nroCliente, String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia, String nombre, String apellido){
			
		Cliente cliente = this.getCliente(nroCliente, calle, altura, piso, departamento, codigoPostal, localidad, provincia);
		if(cliente != null){
			cliente.Delete();
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
			Cliente.modificarCliente(cliente);
			return true;
		}
		return false;
	}
	
	public Boolean altaClienteIndustrial(String calle, Integer altura,
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
			Cliente.modificarCliente(cliente);
			return true;
		}
		return false;
	}
	
	public boolean facturar(){
		
		for (Cliente cli : clientes) {
			try {
				Factura fact = new Factura(Factura.getProxNroFactura(),cli,liquidadores);
				facturas.add(fact);
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<ResidencialView> obtenerClientesResidencial(){
		ArrayList<ResidencialView> cli = new ArrayList<ResidencialView>();
		for(Cliente c : clientes){
			if (c.getIsA().equals("residencial")){
				Residencial r = (Residencial) c;
				cli.add(r.generarView());
			}
		}
		return cli;
	}
	
	public ArrayList<IndustrialView> obtenerClientesIndustrial(){
		ArrayList<IndustrialView> cli = new ArrayList<IndustrialView>();
		for(Cliente c : clientes){
			if (c.getIsA().equals("industrial")){
				Industrial r = (Industrial) c;
				cli.add(r.generarView());
			}
		}
		return cli;
	}
	
	public ArrayList<ElementoCobrableView> obtenerElementosCobrables(){
		ArrayList<ElementoCobrableView> elem = new ArrayList<ElementoCobrableView>();
		for(ElementoCobrable ec : cobrables){
				elem.add(ec.generarElementoCobrableView());
			}
		return elem;
	}
	
	public boolean modificarElementoCobrable(int nroEC, float valor){
		ElementoCobrable elem = buscarElementoCobrable(nroEC);
		if(elem!=null){
			elem.setValor(valor);
			elem.updateElementoCobrable();
			return true;
		}
		return false;
	}

}


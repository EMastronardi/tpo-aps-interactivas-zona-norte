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
		cobrables = new ArrayList<ElementoCobrable>();
		liquidadores = new ArrayList<Liquidador>();
		facturas = new ArrayList<Factura>();
		this.cargarDatosIniciales();
		
	}
	
	private void cargarDatosIniciales() {
		
		this.generarElementosCobrables();
		this.generarLiquidadores();
		this.generarClientes();
		
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
	
	private void generarClientes(){
		Cliente cli = new Residencial("Mendoza", 5049, 14, "44", "1431", "Capital", "Buenos Aires", "Daniel", "Zanotti");
		cli.cargarMedicion(150, new Date(112, 5, 5));
		cli.cargarMedicion(285, new Date(112, 4, 3));
		cli.cargarMedicion((float)149.5, new Date(112, 3, 7));
		cli.cargarMedicion(360, new Date(112, 2, 2));
		cli.cargarMedicion(470, new Date(112, 1, 1));
		clientes.add(cli);
		
		cli = new Residencial("Juramento", 453, 1, "A", "1812", "Munro", "Buenos Aires", "Emmanuel", "Mastronardi");
		cli.cargarMedicion(100, new Date(112, 5, 4));
		cli.cargarMedicion(225, new Date(112, 4, 8));
		cli.cargarMedicion((float)339.7, new Date(112, 3, 1));
		cli.cargarMedicion((float)460.8, new Date(112, 2, 4));
		cli.cargarMedicion((float)555.3, new Date(112, 1, 5));
		clientes.add(cli);
		
		cli = new Residencial("Pampa", 234, 3, "F", "1603", "Vicente Lopez", "Buenos Aires", "Damian", "Quiroga");
		cli.cargarMedicion(179, new Date(112, 5, 1));
		cli.cargarMedicion(288, new Date(112, 4, 2));
		cli.cargarMedicion((float)350.7, new Date(112, 3, 3));
		cli.cargarMedicion((float)433.8, new Date(112, 2, 4));
		cli.cargarMedicion((float)507.1, new Date(112, 1, 5));
		clientes.add(cli);
		
		cli = new Residencial("Olazabal", 45, 22, "22", "1431", "Ramos Mejia", "Buenos Aires", "Juan", "Fernandez");
		cli.cargarMedicion(137, new Date(112, 5, 29));
		cli.cargarMedicion(250, new Date(112, 4, 1));
		cli.cargarMedicion((float)381.2, new Date(112, 3, 29));
		cli.cargarMedicion((float)498.3, new Date(112, 2, 14));
		cli.cargarMedicion((float)505.5, new Date(112, 1, 10));
		clientes.add(cli);
		
		cli = new Residencial("Biro", 10, 3, "C", "1234", "Castelar", "Buenos Aires", "Anibal", "Lopez");
		cli.cargarMedicion(141, new Date(112, 5, 1));
		cli.cargarMedicion(252, new Date(112, 4, 1));
		cli.cargarMedicion(363, new Date(112, 3, 1));
		cli.cargarMedicion(474, new Date(112, 2, 1));
		cli.cargarMedicion(585, new Date(112, 1, 1));
		clientes.add(cli);
		
		cli = new Residencial("Thomas", 34566, 1, "H", "1909", "Padua", "Buenos Aires", "Leandro", "Micheltorena");
		cli.cargarMedicion(123, new Date(112, 5, 2));
		cli.cargarMedicion(234, new Date(112, 4, 2));
		cli.cargarMedicion(345, new Date(112, 3, 2));
		cli.cargarMedicion(456, new Date(112, 2, 2));
		cli.cargarMedicion(567, new Date(112, 1, 2));
		clientes.add(cli);
		
		cli = new Residencial("Libertador", 2348, 0, "S1", "1343", "Merlo", "Buenos Aires", "Gabriela", "Gianni");
		cli.cargarMedicion(122, new Date(112, 6, 3));
		cli.cargarMedicion(233, new Date(112, 5, 3));
		cli.cargarMedicion(344, new Date(112, 4, 3));
		cli.cargarMedicion(455, new Date(112, 3, 3));
		cli.cargarMedicion(566, new Date(112, 2, 3));
		clientes.add(cli);
		
		cli = new Industrial("Laprida", 3160, 0, "0", "1603", "Villa Martelli", "Buenos Aires", "Canal Directo S.A", "30-70774983-7", "901-7987343-01", "Inscripto");
		cli.cargarMedicion(111, new Date(112, 5, 4));
		cli.cargarMedicion(222, new Date(112, 4, 4));
		cli.cargarMedicion(333, new Date(112, 3, 4));
		cli.cargarMedicion(444, new Date(112, 2, 4));
		cli.cargarMedicion(555, new Date(112, 1, 4));
		clientes.add(cli);
		
		cli = new Industrial("Libertador", 3860, 1, "A", "1633", "La Lucila", "Buenos Aires", "Microlending S.A", "30-703456345-7", "902-2342345-01", "Inscripto");
		cli.cargarMedicion(122, new Date(112, 5, 5));
		cli.cargarMedicion(233, new Date(112, 4, 5));
		cli.cargarMedicion(344, new Date(112, 3, 5));
		cli.cargarMedicion(455, new Date(112, 2, 5));
		cli.cargarMedicion(566, new Date(112, 1, 5));
		clientes.add(cli);
		
		cli = new Industrial("Morris", 345, 0, "0", "2032", "Ferrere", "Buenos Aires", "Panchos S.A", "30-98723454-7", "901-23452345-01", "No Inscripto");
		cli.cargarMedicion(199, new Date(112, 5, 6));
		cli.cargarMedicion(298, new Date(112, 4, 6));
		cli.cargarMedicion(397, new Date(112, 3, 6));
		cli.cargarMedicion(496, new Date(112, 2, 6));
		cli.cargarMedicion(594, new Date(112, 1, 6));
		clientes.add(cli);
		
		cli = new Industrial("Hornos", 239, 4, "S", "1722", "Moreno", "Buenos Aires", "Quilmes S.A", "30-98274543-7", "904-234543223-01", "Inscripto");
		cli.cargarMedicion(155, new Date(112, 5, 7));
		cli.cargarMedicion(255, new Date(112, 4, 7));
		cli.cargarMedicion(355, new Date(112, 3, 7));
		cli.cargarMedicion(455, new Date(112, 2, 7));
		cli.cargarMedicion(555, new Date(112, 1, 7));
		clientes.add(cli);
	}

	static public Sistema getInstance(){
		if(instancia == null){
			instancia = new Sistema();
		}
		return instancia;
	} 
	
	private void generarLiquidadores(){
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
			
			return true;
		}
		return false;
	}
	
	public boolean facturar(){
		for (Cliente cli : clientes) {
			try {
				Factura fact = new Factura(cli,liquidadores);
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
	
	public boolean modificarElementoCobrable(String nombre, float valor){
		ElementoCobrable elem = buscarElementoPorNombre(nombre);
		if(elem!=null){
			elem.setValor(valor);
			return true;
		}
		return false;
	}

}

